package trafficSystem.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trafficSystem.data.models.Vehicle;
import trafficSystem.data.repositories.VehicleRepository;
import trafficSystem.dtos.requests.RegisterVehicleRequest;
import trafficSystem.dtos.responses.RegisterVehicleResponse;

import static trafficSystem.utils.Mapper.map;
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private  VehicleRepository vehicles;

    @Override

    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request) {
       Vehicle vehicle = map(request);
       Vehicle savedVehicle = vehicles.save(vehicle);

       return map(savedVehicle);


    }
}
