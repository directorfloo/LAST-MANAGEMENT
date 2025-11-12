package services;

import Data.repositories.VehicleRepository;
import Data.repositories.Vehicles;
import dtos.requests.RegisterVehicleRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class VehicleServiceImplTest {
   private VehicleServiceImpl vehicleService;
   private VehicleRepository vehicle;


    @BeforeEach
    void setUp() {
        vehicleService = new VehicleServiceImpl();
        vehicle =  new Vehicles();

    }
    @Test
    public void testforVehicleName(){
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        vehicleService.registerVehicle(request);
        assertEquals(1,vehicle.count());

    }



}