package trafficSystem.services;

import trafficSystem.dtos.requests.RegisterVehicleRequest;
import trafficSystem.dtos.responses.RegisterVehicleResponse;

public interface VehicleService {
    RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request);

}
