package models;

import Data.models.Owner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOwner {
    @Test
    public void testName() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("Titi");
        assertEquals("Titi", owner.getName());

    }

    @Test
    public void testName2() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("Titi");
        assertNotEquals("Tii", owner.getName());

    }

    @Test
    public void testAddress() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("No1,Emmanuel onoaha street");
        assertEquals("No1,Emmanuel onoaha street", owner.getAddress());
    }

    @Test
    public void testAddress2() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("No1,Emmanuel onoaha street");
        assertNotEquals("No1,Emmanuel onoaha ", owner.getAddress());
    }

    @Test
    public void testPhone() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("08104576967");
        assertEquals("08104576967", owner.getPhone());
    }

    @Test
    public void testPhone2() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("08104576967");
        assertNotEquals("08104576", owner.getPhone());
    }

    @Test
    public void testGender() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("male");
        assertEquals("male", owner.getGender());

    }

    @Test
    public void testGender2() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("male");
        assertNotEquals("Tii", owner.getGender());
    }

    @Test
    public void testEmail() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("olacolon@gmail.com");
        assertEquals("olacolon@gmail.com", owner.getEmail());

    }

    @Test
    public void testEmail2() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("olacolon@gmail.com");
        assertNotEquals("olacolon@gmail.co", owner.getEmail());
    }
    @Test
    public void testId() {
        Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
        owner.setName("134564");
        assertEquals("134564", owner.getId());
    }
    @Test
    public void testId2() {
            Owner owner = new Owner("Titi", "No1,Emmanuel onoaha street", "08104576967", "male", "olacolon@gmail.com", "134564");
            owner.setName("134564");
            assertNotEquals("Tii", owner.getId());
    }

}


