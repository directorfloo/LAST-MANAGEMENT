package trafficSystem.dtos.responses;

import lombok.Data;

@Data
public class IssueTicketResponse {
    private String OfficerId;
    private String ticketId;
    private String vehicle;
    private String issuer;
    private String amount;
    private String date;

}
