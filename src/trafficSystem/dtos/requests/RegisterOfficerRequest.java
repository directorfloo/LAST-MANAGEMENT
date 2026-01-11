package trafficSystem.dtos.requests;

import lombok.Data;

@Data
public class RegisterOfficerRequest {
    private  String officerId;
    private String officerName;
    private String   officerEmail;

}
