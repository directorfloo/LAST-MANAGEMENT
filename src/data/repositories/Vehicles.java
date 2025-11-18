package data.repositories;

import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository {
 private  static List<Vehicle> vehicles = new ArrayList<>();
 private   int count;

    @Override
    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() == 0) {
            generateId();
            vehicle.setId(count);
            vehicles.add(vehicle);


        }
        return vehicle;

    }

    private void generateId() {
        count++;

    }

    @Override
    public Vehicle findById(int id) {
                for(Vehicle vehicle : vehicles) {
                if (vehicle.getId() == id) {
                    return vehicle;
                }
            }
            return null;
        }



    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }


    @Override
    public void deleteById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                vehicles.remove(vehicle);
                break;
            }
        };

    }

    @Override
    public void deleteAll() {
        vehicles.clear();


    }


    @Override
    public void delete(Vehicle vehicle ) {
        vehicles.remove(vehicle);
    }


    @Override
    public long count() {
        return  vehicles.size();
    }
    @Override
    public Vehicle findByChaiseNumber(String chaiseNumber) {
        for(Vehicle vehicle : vehicles) {
            if (vehicle.getChaiseNumber().equals(chaiseNumber)) {
                return vehicle;
            }
        }
        return null;
    }
}
