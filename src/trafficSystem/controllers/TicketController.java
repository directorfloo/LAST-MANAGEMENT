package trafficSystem.controllers;

import org.springframework.web.bind.annotation.*;
import trafficSystem.dtos.requests.IssueTicketRequest;
import trafficSystem.dtos.requests.SettleTicketRequest;
import trafficSystem.dtos.requests.ViewAllTicketsRequest;
import trafficSystem.dtos.requests.ViewTicketRequest;
import trafficSystem.dtos.responses.IssueTicketResponse;
import trafficSystem.dtos.responses.SettleTicketResponse;
import trafficSystem.dtos.responses.ViewAllTicketsResponse;
import trafficSystem.dtos.responses.ViewTicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import trafficSystem.services.TicketService;

@RestController
public class TicketController {
    @Autowired
 private TicketService ticketService;
    @PostMapping("/issueTicket")
    public IssueTicketResponse issueTicket(@RequestBody IssueTicketRequest request) {
       return ticketService.issueTicket(request);

    }
    @PutMapping("/settleTicket")
   public SettleTicketResponse settleTicket(@RequestBody SettleTicketRequest request){
         return ticketService.settleTicket(request);
    }
    @GetMapping("/viewTicket")
  public ViewTicketResponse viewTicket(@RequestBody ViewTicketRequest request){
        return ticketService.viewTicket(request);

   }
   @GetMapping("/viewTickets")
 public ViewAllTicketsResponse viewTickets(@RequestBody  ViewAllTicketsRequest request){
       return ticketService.viewTickets(request);
  }
}
