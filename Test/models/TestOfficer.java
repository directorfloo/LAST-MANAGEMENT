package models;

import Data.models.Officer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOfficer {
    @Test
    public void testName(){
        Officer officer = new Officer();
        officer.setName("Emmanuel");
        assertEquals("Emmanuel",officer.getName());
    }
    @Test
    public void testName2(){
        Officer officer = new Officer();
        officer.setName("Emmanuel");
        assertNotEquals("Emmanu",officer.getName());

    }
    @Test
    public void testId(){
        Officer officer = new Officer();
        officer.setId(123456);
        assertEquals(123456,officer.getId());
    }
    @Test
    public void testId2(){
        Officer officer = new Officer();
        officer.setId(123456);
        assertNotEquals(1236,officer.getId());
    }
    @Test
    public void testRank(){
        Officer officer = new Officer();
        officer.setRank("lieutenant");
        assertEquals("lieutenant",officer.getRank());
    }
    @Test
    public void testRank2(){
        Officer officer = new Officer();
        officer.setRank("lieutenant");
        assertNotEquals("lieutenan",officer.getRank());
    }
}
