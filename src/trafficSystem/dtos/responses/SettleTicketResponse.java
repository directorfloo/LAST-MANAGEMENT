package trafficSystem.dtos.responses;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SettleTicketResponse {
    private String  TicketId;
    private String  amount;
    private String date;
}
