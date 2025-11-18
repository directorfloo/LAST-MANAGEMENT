package services;

import data.models.Offence;
import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import data.repositories.*;
import dtos.requests.IssueTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.IssueTicketReponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketServiceImpl implements TicketService {
    private TicketRepository tickets ;
    private OfficerRepository officers ;
    private VehicleRepository vehicles ;

    public TicketServiceImpl(TicketRepository tickets, OfficerRepository officers, VehicleRepository vehicles) {
        this.tickets = tickets;
        this.officers = officers;
        this.vehicles = vehicles;
    }

    @Override
    public IssueTicketReponse issueTicket(IssueTicketRequest request) {
        Officer officer = officers.findByEmail(request.getOfficerEmail());
        if (officer == null) {
            throw new IllegalArgumentException("Officer not found");
        }
        Vehicle vehicle = vehicles.findById(request.getVehicleId());
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle not found");
        }

        Ticket ticket = new Ticket();
        ticket.setIssuer(officer);
        ticket.setOffence(Offence.valueOf(request.getOffence().toUpperCase()));
        tickets.save(ticket);
        vehicle.getTickets().add(ticket);

        vehicles.save(vehicle);

        return null;

    }



    @Override
    public SettleTicketResponse settleTicket(SettleTicketRequest request) {
//        Vehicle vehicle = vehicles.findById(request.getTicketId());
//        if (vehicle == null) {
//            throw new IllegalArgumentException("Vehicle not found");
//        }
        Ticket ticket = tickets.findById(request.getTicketId());
        if(ticket.getOffence().getAmount() != request.getAmount()) {
            throw new IllegalArgumentException("Amount doesn't match");
        }
        ticket.setHaspaid(true);
        ticket.setDateOfPayment(LocalDateTime.now());
        tickets.save(ticket);
        return new  SettleTicketResponse();
    }

    @Override
    public ViewTicketResponse ViewTicket(ViewTicketRequest request) {
        Ticket ticket = tickets.findById(request.getTicketId());
        if(ticket == null) {
            throw new IllegalArgumentException("Ticket not found");
        }
        return  new ViewTicketResponse();
    }

}
