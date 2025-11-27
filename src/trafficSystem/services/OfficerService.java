package trafficSystem.services;

import trafficSystem.dtos.requests.RegisterOfficerRequest;
import trafficSystem.dtos.responses.RegisterOfficerResponse;

public interface OfficerService {

    RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request);
}
