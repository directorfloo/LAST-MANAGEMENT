package models;

import Data.models.Owner;
import Data.models.Vehicle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestVehicle {
    private Vehicle vehicle;
    private Owner owner;

    @BeforeEach
    public void setUp() {
    owner = new Owner("O001", "John Doe", "123 Main St", "555-1234", "Male", "john@example.com");
    vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
    }

@Test
    public void testVehicleName() {
    Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
    vehicle.setName("ola");
    assertEquals("ola", vehicle.getName());

    }
    @Test
    public void testVehicleName2() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        vehicle.setName("ol");
        assertNotEquals("ola", vehicle.getName());
    }
    @Test
    public void testVehicleModel() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        vehicle.setModel("Toyota");
        assertEquals("Toyota", vehicle.getModel());
    }
    @Test

    public void testVehicleModel2() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        vehicle.setModel("Toyo");
        assertNotEquals("Toyota", vehicle.getModel());
    }
    @Test
    public void testVehicleColour() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        assertEquals("blue", vehicle.getColour());
        
    }
    @Test
    public void testVehicleColour2() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        vehicle.setColour("blue");
        assertNotEquals("ble", vehicle.getColour());

    }
    @Test
    public void testVehiclePlateNumber() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        vehicle.setPlateNumber("12345");
        assertEquals("12345", vehicle.getPlateNumber());

    }

    @Test
    public void testVehiclePlateNumber2() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Blue", 1235, owner, "12345-ABC","2004");
        vehicle.setPlateNumber("12345");
        assertNotEquals("1245", vehicle.getPlateNumber());


    }
}
