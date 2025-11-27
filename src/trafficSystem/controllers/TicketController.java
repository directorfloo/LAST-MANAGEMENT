package trafficSystem.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import trafficSystem.dtos.requests.IssueTicketRequest;
import trafficSystem.dtos.requests.SettleTicketRequest;
import trafficSystem.dtos.requests.ViewAllTicketsRequest;
import trafficSystem.dtos.requests.ViewTicketRequest;
import trafficSystem.dtos.responses.IssueTicketReponse;
import trafficSystem.dtos.responses.SettleTicketResponse;
import trafficSystem.dtos.responses.ViewAllTicketsResponse;
import trafficSystem.dtos.responses.ViewTicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import trafficSystem.services.TicketService;

@RestController
public class TicketController {
    @Autowired
 private TicketService ticketService;
    @PostMapping("/ticket")
    public IssueTicketReponse issueTicket(@RequestBody IssueTicketRequest request) {
       return ticketService.issueTicket(request);

    }
//    public SettleTicketResponse settleTicket(SettleTicketRequest request){
//         return ticketService.settleTicket(request);
//
//    }
//   public ViewTicketResponse viewTicket(ViewTicketRequest request){
//       return ticketService.viewTicket(request);
//
//   }
//   public ViewAllTicketsResponse viewTickets(ViewAllTicketsRequest request){
//        return ticketService.viewTickets(request);
//   }
}
