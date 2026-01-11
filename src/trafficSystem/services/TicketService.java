package trafficSystem.services;

import trafficSystem.dtos.requests.IssueTicketRequest;
import trafficSystem.dtos.requests.SettleTicketRequest;
import trafficSystem.dtos.requests.ViewAllTicketsRequest;
import trafficSystem.dtos.requests.ViewTicketRequest;
import trafficSystem.dtos.responses.IssueTicketResponse;
import trafficSystem.dtos.responses.SettleTicketResponse;
import trafficSystem.dtos.responses.ViewAllTicketsResponse;
import trafficSystem.dtos.responses.ViewTicketResponse;

public interface TicketService {
    IssueTicketResponse issueTicket(IssueTicketRequest request);
    SettleTicketResponse settleTicket(SettleTicketRequest request);
    ViewTicketResponse viewTicket(ViewTicketRequest request);
    ViewAllTicketsResponse viewTickets(ViewAllTicketsRequest request);




}
