package trafficSystem.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import trafficSystem.dtos.requests.RegisterVehicleRequest;
import trafficSystem.dtos.responses.RegisterVehicleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import trafficSystem.services.VehicleService;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/vehicle")
    public RegisterVehicleResponse registerVehicle(@RequestBody RegisterVehicleRequest request){
        return vehicleService.registerVehicle(request);
    }


}
