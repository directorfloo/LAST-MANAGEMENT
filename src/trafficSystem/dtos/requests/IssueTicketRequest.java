package trafficSystem.dtos.requests;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class IssueTicketRequest {

    private String officerId;
    private String vehicleId;
    private String offence;
    private String officerName;
    private String vehicleChaiseNumber;

}
