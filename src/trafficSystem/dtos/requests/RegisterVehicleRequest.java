package trafficSystem.dtos.requests;

import lombok.Data;

@Data
public class RegisterVehicleRequest {
    private String VehicleName;
    private String  VehicleModel;
    private String VehicleColour;
    private String VehicleYear;
    private String OwnerName;
    private String OwnerAddress;
    private String OwnerPhoneNumber;
    private String OwnerEmail;

}
