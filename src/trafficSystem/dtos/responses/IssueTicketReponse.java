package trafficSystem.dtos.responses;

import lombok.Data;

@Data
public class IssueTicketReponse {
    private String ticketId;
    private String vehicle;
    private String issuer;
    private String amount;
    private String date;

}
