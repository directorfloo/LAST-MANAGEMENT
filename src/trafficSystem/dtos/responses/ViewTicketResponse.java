package trafficSystem.dtos.responses;

import lombok.Data;

@Data
public class ViewTicketResponse {
    private  String vehicleId;
    private  String dateOfPayment;
    private  String hasPaid;
}
