//package repositories;
//import data.models.Ticket;
//
//import data.repositories.VehicleRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.Assert.assertEquals;
//public class TestVehicles {
//    private VehicleRepository vehicle;
//
//
//    @BeforeEach
//    public void setUp() {
//        vehicle = new Vehicles();
//
//    }
//
//
//    @Test
//    public void testNotAvailable() {
//        assertEquals(0, vehicle.count());
//    }
//
//    @Test
//    public void testaddVehicle() {
//        Ticket myVehicle = new Ticket();
//        vehicle.save(myVehicle);
//        assertEquals(1, vehicle.count());
//    }
//
//    @Test
//    public void testFindVehicleById() {
//        Ticket myVehicle = new Ticket();
//        vehicle.save(myVehicle);
//        assertEquals(1, vehicle.count());
//        assertEquals(myVehicle, vehicle.findById(myVehicle.getId()));
//
//    }
//
//    @Test
//    public void testDeleteVehicleById() {
//        Ticket myVehicle = new Ticket();
//        vehicle.save(myVehicle);
//        vehicle.deleteById(1);
//        assertEquals(0, vehicle.count());
//    }
//
//    @Test
//    public void testFindAllVehicles() {
//        Ticket myVehicle = new Ticket();
//        vehicle.save(myVehicle);
//        Ticket mVehicle = new Ticket();
//        vehicle.save(mVehicle);
//        assertEquals(2, vehicle.count());
//
//    }
//
//    @Test
//    public void testDeleteAllVehicle() {
//        Ticket myVehicle = new Ticket();
//        vehicle.save(myVehicle);
//        Ticket mVehicle = new Ticket();
//        vehicle.save(mVehicle);
//        vehicle.deleteAll();
//        assertEquals(0, vehicle.count());
//    }
//
//    @Test
//    public void testDeleteVehicle() {
//        Ticket myVehicle = new Ticket();
//        vehicle.save(myVehicle);
//        Ticket mVehicle = new Ticket();
//        vehicle.save(mVehicle);
//        vehicle.delete(myVehicle);
//        vehicle.delete(mVehicle);
//        assertEquals(0, vehicle.count());
//
//    }
//    @Test
//    public void testChaiseNumber() {
//        Ticket myVehicle = new Ticket();
//        myVehicle.setChaiseNumber("1234");
//        assertEquals("1234", myVehicle.getChaiseNumber());
//    }
//
//@AfterEach
//    public void tearDown() {
//    vehicle.deleteAll();
//}
//
//}