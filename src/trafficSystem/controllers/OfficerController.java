package trafficSystem.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import trafficSystem.dtos.requests.RegisterOfficerRequest;
import trafficSystem.dtos.responses.RegisterOfficerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import trafficSystem.services.OfficerService;

@RestController
public class OfficerController {
    @Autowired
 private OfficerService officerService;

    @PostMapping("/officer")
    public RegisterOfficerResponse registerOfficer(@RequestBody RegisterOfficerRequest request) {
        return  officerService.registerOfficer(request);
}
}