package models;

import Data.models.Owner;
import Data.models.Vehicle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestVehicle {




@Test
    public void testVehicleName() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("ola");
    assertEquals("ola", vehicle.getName());

    }
    @Test
    public void testVehicleName2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("ol");
        assertNotEquals("ola", vehicle.getName());
    }
    @Test
    public void testVehicleModel() {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("Toyota");
        assertEquals("Toyota", vehicle.getModel());
    }
    @Test

    public void testVehicleModel2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("Toyo");
        assertNotEquals("Toyota", vehicle.getModel());
    }
    @Test
    public void testVehicleColour() {
        Vehicle vehicle = new Vehicle();
        assertEquals("blue", vehicle.getColour());
        
    }
    @Test
    public void testVehicleColour2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setColour("blue");
        assertNotEquals("ble", vehicle.getColour());

    }
    @Test
    public void testVehiclePlateNumber() {
        Vehicle vehicle = new Vehicle();
        vehicle.setPlateNumber("12345");
        assertEquals("12345", vehicle.getPlateNumber());

    }

    @Test
    public void testVehiclePlateNumber2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setPlateNumber("12345");
        assertNotEquals("1245", vehicle.getPlateNumber());


    }
}
