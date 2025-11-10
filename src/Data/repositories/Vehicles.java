package Data.repositories;

import Data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository {
 private   List<Vehicle> vehicles = new ArrayList<>();
 private int count;

    @Override
    public Vehicle save(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        vehicles.add(vehicle);
        count++;
        return vehicle;

    }

    @Override
    public Vehicle findById(int id) {
            for (int counter = 0; counter < vehicles.size(); counter++) {
                Vehicle vehicle = vehicles.get(counter);
                if (vehicle.getId() == id) {
                    return vehicle;
                }
            }
            throw new IllegalArgumentException("Vehicle with id " + id + " not found");
        }



    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }


    @Override
    public void deleteById(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == id);

    }

    @Override
    public void deleteAll() {
        vehicles.clear();


    }


    @Override
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);

    }


    @Override
    public long count() {
        return count;
    }
}
