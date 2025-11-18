package services;

import dtos.requests.IssueTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.IssueTicketReponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;

public interface TicketService {
    IssueTicketReponse issueTicket(IssueTicketRequest request);
    SettleTicketResponse settleTicket(SettleTicketRequest request);
    ViewTicketResponse ViewTicket(ViewTicketRequest request);



}
