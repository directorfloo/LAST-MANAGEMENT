package services;


import Data.models.Vehicle;
import Data.repositories.VehicleRepository;
import Data.repositories.Vehicles;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;

import static utils.Mapper.map;

public class VehicleServiceImpl implements VehicleService {
    private  VehicleRepository vehicles = new Vehicles();

    @Override
    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request) {
       Vehicle vehicle =map(request);
        vehicles.save(vehicle);
    return  new RegisterVehicleResponse();
    }
}
