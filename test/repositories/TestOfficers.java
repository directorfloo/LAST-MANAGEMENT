//package repositories;
//
//import data.models.Officer;
//
//import data.repositories.OfficerRepository;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.Assert.assertEquals;
//public class TestOfficers {
//    private OfficerRepository officer;
//
//
//    @BeforeEach
//    public void setUp() {
//        officer = new Officers();
//
//    }
//
//
//    @Test
//    public void testNotAvailable() {
//        assertEquals(0, officer.count());
//    }
//
//    @Test
////    public void testaddOfficer() {
//        Officer myOfficer = new Officer();
//        officer.save(myOfficer);
//        assertEquals(1, officer.count());
//    }
//
//    @Test
//    public void testFindOfficerById() {
//        Officer myOfficer = new Officer();
//        officer.save(myOfficer);
//        assertEquals(1, officer.count());
//        assertEquals(myOfficer, officer.findById(myOfficer.getId()));
//
//    }
//
//    @Test
//    public void testDeleteOfficerById() {
//        Officer myOfficer = new Officer();
//        officer.save(myOfficer);
//        officer.deleteById(1);
//        assertEquals(0, officer.count());
//    }
//
//    @Test
//    public void testFindAllOfficer() {
//        Officer myOfficer = new Officer();
//        officer.save(myOfficer );
//        Officer mysOfficer = new Officer();
//        officer.save(mysOfficer );
//        officer.findAll();
//        assertEquals(2, officer.count());
//
//    }
//    @Test
//    public void  testDeleteAllOfficer() {
//        Officer myOfficer = new Officer();
//        officer.save(myOfficer);
//        Officer mysOfficer = new Officer();
//        officer.save(mysOfficer);
//        officer.deleteAll();
//        assertEquals(0, officer.count());
//    }
//    @Test
//    public void   testDeleteOfficer() {
//        Officer myOfficer = new Officer();
//        officer.save(myOfficer);
//        Officer mysOfficer = new Officer();;
//        officer.save( mysOfficer);
//        officer.delete(myOfficer);
//        officer.delete( mysOfficer);
//        assertEquals(0, officer.count());
//
//    }
//
//}