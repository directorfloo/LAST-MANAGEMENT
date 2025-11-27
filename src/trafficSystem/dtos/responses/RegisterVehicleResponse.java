package trafficSystem.dtos.responses;

import lombok.Data;

@Data
public class RegisterVehicleResponse {
    private String vehicleId;
    private String ownerName;
    private String vehicleFullDetail;

}
