package trafficSystem.dtos.requests;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SettleTicketRequest {
     private String ticketId;
     private String vehicleId;
     private String dateOfPayment;
     private double amount;

}
