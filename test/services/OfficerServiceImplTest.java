package services;

import data.models.Officer;
import data.repositories.OfficerRepository;
import data.repositories.Officers;
import dtos.requests.RegisterOfficerRequest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class OfficerServiceImplTest {
    private OfficerServiceImpl officerService;
    private OfficerRepository officers;

    @BeforeEach
    public void setUp() {
        officerService = new OfficerServiceImpl();
        officers = new Officers();

    }

@Test
public void OfficerServiceImplTest() {
        RegisterOfficerRequest  myRequest1 = new RegisterOfficerRequest();
        officerService.registerOfficer(myRequest1);

        assertEquals(1,officers.count());


    }
    @Test
    public void OfficerServiceImplTest2() {
        RegisterOfficerRequest myRequest1 = new RegisterOfficerRequest();
        officerService.registerOfficer(myRequest1);
        RegisterOfficerRequest myRequest2 = new RegisterOfficerRequest();
        officerService.registerOfficer(myRequest2);
        assertEquals(2, officers.count());
    }

    @AfterEach
    public void tearDown() {
        officers.deleteAll();
    }
}
