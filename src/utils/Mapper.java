package utils;

import Data.models.Owner;
import Data.models.Vehicle;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;

public class Mapper {
    public static Vehicle map(RegisterVehicleRequest request) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(request.getVehicleName());
        vehicle.setModel(request.getVehicleModel());
        vehicle.setColour(request.getVehicleColour());
        vehicle.setYear(request.getVehicleYear());

        Owner owner = new Owner();
        owner.setName(request.getOwnerName());
        owner.setAddress(request.getOwnerAddress());
        owner.setEmail(request.getOwnerEmail());

        vehicle.setOwner(owner);
        return vehicle;





    }
}
