package trafficSystem.utils;

import trafficSystem.data.models.Officer;
import trafficSystem.data.models.Owner;
import trafficSystem.data.models.Ticket;
import trafficSystem.data.models.Vehicle;
import trafficSystem.dtos.requests.RegisterOfficerRequest;
import trafficSystem.dtos.requests.RegisterVehicleRequest;
import trafficSystem.dtos.responses.*;

import java.time.format.DateTimeFormatter;

public class Mapper {
    public static Vehicle map(RegisterVehicleRequest request) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(request.getVehicleName());
        vehicle.setModel(request.getVehicleModel());
        vehicle.setColour(request.getVehicleColour());
        vehicle.setYear(request.getVehicleYear());

        Owner owner = new Owner();
        owner.setName(request.getOwnerName());
        owner.setAddress(request.getOwnerAddress());
        owner.setEmail(request.getOwnerEmail());

        vehicle.setOwner(owner);
        return vehicle;


    }
    public static Officer map(RegisterOfficerRequest request) {
        Officer officer = new Officer();
        officer.setName(request.getOfficerName());
       officer.setId(request.getOfficerId());
        officer.setEmail(request.getOfficerEmail());
        return officer;
    }
    public static RegisterOfficerResponse map(Officer savedOfficer) {
        RegisterOfficerResponse response = new RegisterOfficerResponse();
        response.setId(savedOfficer.getId());
        response.setEmail(savedOfficer.getEmail());
        return response;
    }

    public static RegisterVehicleResponse map(Vehicle savedVehicle) {
        RegisterVehicleResponse response = new RegisterVehicleResponse();
        response.setVehicleId(savedVehicle.getId() + " ");
        response.setOwnerName(savedVehicle.getOwner().getName());
        response.setVehicleFullDetail(savedVehicle.getName() + " " + savedVehicle.getModel() + " " + savedVehicle.getColour() + " " + savedVehicle.getYear());
        return response;
    }

    public static IssueTicketResponse mapIssueTicket(Ticket savedTicket) {
        IssueTicketResponse issueTicket = new IssueTicketResponse();
        issueTicket.setTicketId(savedTicket.getId());
        issueTicket.setVehicle(savedTicket.getVehicle().getName() + " "  + savedTicket.getVehicle().getModel() + " " + savedTicket.getVehicle().getColour() + " " + savedTicket.getVehicle().getYear());
        issueTicket.setIssuer(savedTicket.getIssuer().getName());
        issueTicket.setAmount(savedTicket.getOffence().getAmount() + " ");
        issueTicket.setDate(savedTicket.getDateOfBooking() + " " );
        issueTicket.setOfficerId(savedTicket.getIssuer().getId());
        return issueTicket;
    }

    public static SettleTicketResponse mapSettleTicket(Ticket savedTicket) {
        SettleTicketResponse settleTicketResponse = new SettleTicketResponse();
        settleTicketResponse.setTicketId(savedTicket.getId());
        settleTicketResponse.setAmount(savedTicket.getOffence().getAmount() + " ");
        settleTicketResponse.setDate(DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm a").format(savedTicket.getDateOfPayment()));

        return settleTicketResponse;
    }


    public static ViewTicketResponse mapViewTicket(Ticket savedTicket) {
        ViewTicketResponse viewTicketResponse = new ViewTicketResponse();
        viewTicketResponse.setVehicleId(savedTicket.getId() + " ");
        viewTicketResponse.setDateOfPayment(savedTicket.getDateOfPayment() + " ");
         viewTicketResponse.setHasPaid(savedTicket.isHasPaid() + " ");

      return viewTicketResponse;
    }

    public static ViewAllTicketsResponse mapViewTickets(String savedTickets) {
        ViewAllTicketsResponse viewAllTicketsResponse = new ViewAllTicketsResponse();
        viewAllTicketsResponse.setTickets(savedTickets);
        return viewAllTicketsResponse;
    }

}
