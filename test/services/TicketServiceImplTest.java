package services;

import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import data.repositories.*;
import dtos.requests.IssueTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.SettleTicketResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceImplTest {
    VehicleRepository  vehicleRepository;
    TicketRepository ticketRepository;
    OfficerRepository officerRepository;
    TicketService  ticketService;

    @BeforeEach
    void setUp() {
        vehicleRepository = new Vehicles();
        ticketRepository = new Tickets();
        officerRepository = new Officers();
        ticketService = new TicketServiceImpl(ticketRepository, officerRepository, vehicleRepository);
    }

    @Test
    void issueTicket1() {
        IssueTicketRequest request = new IssueTicketRequest();


        Vehicle vehicle = new Vehicle();
        vehicleRepository.save(vehicle);

        Officer  officer = new Officer();
        officer.setEmail("olamide@gmail.com");
        officerRepository.save(officer);

        request.setVehicleId(vehicle.getId());
        request.setOfficerEmail(officer.getEmail());
        request.setOffence("One_Way");

        ticketService.issueTicket(request);

        assertEquals(vehicle.getTickets().get(0), ticketRepository.findById(request.getVehicleId()));

    }

    @Test
    void issueTicket2() {
        IssueTicketRequest request = new IssueTicketRequest();


        Vehicle vehicle = new Vehicle();
        vehicleRepository.save(vehicle);

        Officer  officer = new Officer();
        officer.setEmail("olamide@gmail.com");
        officerRepository.save(officer);

        request.setVehicleId(vehicle.getId());
        request.setOfficerEmail(officer.getEmail());
        request.setOffence("One_Way");
        ticketService.issueTicket(request);

        request.setVehicleId(vehicle.getId());
        request.setOfficerEmail(officer.getEmail());
        request.setOffence("Drunk_Driving");
        ticketService.issueTicket(request);

        request.setVehicleId(vehicle.getId());
        request.setOfficerEmail(officer.getEmail());
        request.setOffence("No_Seat_Belt");
        ticketService.issueTicket(request);

//        System.out.println(vehicle.getTickets());

        assertEquals(vehicle.getTickets(), ticketRepository.findAll());

    }

    @Test
    void settleTicket() {
        IssueTicketRequest request = new IssueTicketRequest();


        Vehicle vehicle = new Vehicle();
        vehicleRepository.save(vehicle);

        Officer  officer = new Officer();
        officer.setEmail("olamide@gmail.com");
        officerRepository.save(officer);

        request.setVehicleId(vehicle.getId());
        request.setOfficerEmail(officer.getEmail());
        request.setOffence("One_Way");

        ticketService.issueTicket(request);

        assertEquals(vehicle.getTickets().get(0), ticketRepository.findById(request.getVehicleId()));

        SettleTicketRequest request1 = new SettleTicketRequest();
        request1.setTicketId(1);
        request1.setAmount(35000);
        ticketService.settleTicket(request1);

        assertTrue(vehicle.getTickets().get(0).isHaspaid());
    }
@AfterEach
    void tearDown() {
        ticketRepository.deleteAll();
}

}


