package trafficSystem.dtos.requests;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IssueTicketRequest {

    private String VehicleId ;
    private String offence;
    private String officerEmail;
    private String officerName;
    private String VehicleChaiseNumber;
    private LocalDateTime dateOfBooking = LocalDateTime.now();
    private LocalDateTime dateOfPayment = LocalDateTime.now();

}
