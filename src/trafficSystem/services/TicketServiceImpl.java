package trafficSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trafficSystem.data.models.Offence;
import trafficSystem.data.models.Officer;
import trafficSystem.data.models.Ticket;
import trafficSystem.data.models.Vehicle;
import trafficSystem.data.repositories.OfficerRepository;
import trafficSystem.data.repositories.TicketRepository;
import trafficSystem.data.repositories.VehicleRepository;
import trafficSystem.dtos.requests.IssueTicketRequest;
import trafficSystem.dtos.requests.SettleTicketRequest;
import trafficSystem.dtos.requests.ViewAllTicketsRequest;
import trafficSystem.dtos.requests.ViewTicketRequest;
import trafficSystem.dtos.responses.IssueTicketReponse;
import trafficSystem.dtos.responses.SettleTicketResponse;
import trafficSystem.dtos.responses.ViewAllTicketsResponse;
import trafficSystem.dtos.responses.ViewTicketResponse;

import java.time.LocalDateTime;
import java.util.Optional;

import static trafficSystem.utils.Mapper.*;
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository tickets ;
    @Autowired
    private OfficerRepository officers ;
    @Autowired
    private VehicleRepository vehicles ;



    @Override
    public IssueTicketReponse issueTicket(IssueTicketRequest request) {
        Officer officer = officers.findByEmail(request.getOfficerEmail());
        if (officer == null) {
            throw new IllegalArgumentException("Officer not found");
        }
        Optional<Vehicle> vehicle = vehicles.findById(request.getVehicleId());
        if (!vehicle.isPresent()) {
            throw new IllegalArgumentException("Vehicle not found");
        }

        Ticket ticket = new Ticket();
        ticket.setIssuer(officer);
        ticket.setOffence(Offence.valueOf(request.getOffence().toUpperCase()));
        Ticket savedTicket = tickets.save(ticket);
        vehicle.get().getTickets().add(ticket);
        vehicles.save(vehicle.get());

        return  mapIssueTicket(savedTicket);

//        Vehicle vehicle = map(request);
//        Vehicle savedVehicle = vehicles.save(vehicle);
//
//        return map(savedVehicle)

    }



    @Override
    public SettleTicketResponse settleTicket(SettleTicketRequest request) {
        Optional<Ticket> ticket = tickets.findById(request.getTicketId());
        if (!ticket.isPresent()) {
            throw new IllegalArgumentException("Ticket does not exist");
        }
        Ticket foundTicket = ticket.get();
        if(foundTicket.getOffence().getAmount() != request.getAmount()) {
            throw new IllegalArgumentException("Amount doesn't match");
        }
        foundTicket.setHasPaid(true);
        foundTicket.setDateOfPayment(LocalDateTime.now());
        Ticket savedTicket = tickets.save(foundTicket);

        return mapSettleTicket(savedTicket);

    }

    @Override
    public ViewTicketResponse viewTicket(ViewTicketRequest request) {
        Optional<Ticket> ticket = tickets.findById(request.getVehicleId());
        if(!ticket.isPresent()) {
            throw new IllegalArgumentException("Ticket not found");
        }
        return mapViewTicket(ticket.get());
    }

    @Override
    public ViewAllTicketsResponse viewTickets(ViewAllTicketsRequest request) {
        Optional<Vehicle> vehicle = vehicles.findById(request.getVehicleId());
        if(!vehicle.isPresent()) {
            throw new IllegalArgumentException("Vehicle not found");
        }
        String foundTickets = vehicle.get().getTickets().toString();
        return mapViewTickets(foundTickets);


    }


}
