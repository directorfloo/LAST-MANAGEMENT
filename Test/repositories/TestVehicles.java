package repositories;

import Data.models.Owner;
import Data.models.Vehicle;

import Data.repositories.VehicleRepository;
import Data.repositories.Vehicles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class TestVehicles {
    private VehicleRepository vehicle;
    private Owner owner;

@BeforeEach
public void setUp() {
     vehicle = new Vehicles();
     owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
}


@Test
public void testNotAvailable() {
    assertEquals(0, vehicle.count());
}

@Test
public void testaddVehicle() {
    Vehicle myVehicle = new Vehicle("O001", "John Doe", "123 Main St", 1, owner, "john@example.com","2004");
    Vehicle result = vehicle.save(myVehicle);
    assertEquals(1, vehicle.count());
}

@Test
public void testFindVehicleById() {
    Vehicle Vehicle = new Vehicle("O001", "John Doe", "123 Main St", 1, owner, "john@example.com","2004");;
    Vehicle result = vehicle.save(Vehicle);
    assertEquals(1, vehicle.count());
    assertEquals(Vehicle, vehicle.findById(Vehicle.getId()));

}

@Test
public void testDeleteVehicleById() {
    Vehicle myVehicle = new Vehicle("O001", "John Doe", "123 Main St", 1, owner, "john@example.com","2004");;
    Vehicle result = vehicle.save(myVehicle);
    vehicle.deleteById(1);
    assertEquals(1, vehicle.count());
}
}