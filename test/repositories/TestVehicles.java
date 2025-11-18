package repositories;
import data.models.Vehicle;

import data.repositories.VehicleRepository;
import data.repositories.Vehicles;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class TestVehicles {
    private VehicleRepository vehicle;


    @BeforeEach
    public void setUp() {
        vehicle = new Vehicles();

    }


    @Test
    public void testNotAvailable() {
        assertEquals(0, vehicle.count());
    }

    @Test
    public void testaddVehicle() {
        Vehicle myVehicle = new Vehicle();
        vehicle.save(myVehicle);
        assertEquals(1, vehicle.count());
    }

    @Test
    public void testFindVehicleById() {
        Vehicle myVehicle = new Vehicle();
        vehicle.save(myVehicle);
        assertEquals(1, vehicle.count());
        assertEquals(myVehicle, vehicle.findById(myVehicle.getId()));

    }

    @Test
    public void testDeleteVehicleById() {
        Vehicle myVehicle = new Vehicle();
        vehicle.save(myVehicle);
        vehicle.deleteById(1);
        assertEquals(0, vehicle.count());
    }

    @Test
    public void testFindAllVehicles() {
        Vehicle myVehicle = new Vehicle();
        vehicle.save(myVehicle);
        Vehicle mVehicle = new Vehicle();
        vehicle.save(mVehicle);
        assertEquals(2, vehicle.count());

    }

    @Test
    public void testDeleteAllVehicle() {
        Vehicle myVehicle = new Vehicle();
        vehicle.save(myVehicle);
        Vehicle mVehicle = new Vehicle();
        vehicle.save(mVehicle);
        vehicle.deleteAll();
        assertEquals(0, vehicle.count());
    }

    @Test
    public void testDeleteVehicle() {
        Vehicle myVehicle = new Vehicle();
        vehicle.save(myVehicle);
        Vehicle mVehicle = new Vehicle();
        vehicle.save(mVehicle);
        vehicle.delete(myVehicle);
        vehicle.delete(mVehicle);
        assertEquals(0, vehicle.count());

    }
    @Test
    public void testChaiseNumber() {
        Vehicle myVehicle = new Vehicle();
        myVehicle.setChaiseNumber("1234");
        assertEquals("1234", myVehicle.getChaiseNumber());
    }

@AfterEach
    public void tearDown() {
    vehicle.deleteAll();
}

}