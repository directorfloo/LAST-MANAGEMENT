package utils;

import data.models.Officer;
import data.models.Owner;
import data.models.Vehicle;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;

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
    public static Officer map(RegisterOfficerRequest request) {
        Officer officer = new Officer();
        officer.setName(request.getOfficerName());
        officer.setId(request.getOfficerId());
        officer.setEmail(request.getOfficerEmail());
        return officer;
    }

}
