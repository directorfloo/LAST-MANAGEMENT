package trafficSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trafficSystem.data.models.Officer;

import trafficSystem.data.repositories.OfficerRepository;
import trafficSystem.dtos.requests.RegisterOfficerRequest;
import trafficSystem.dtos.responses.RegisterOfficerResponse;

import static trafficSystem.utils.Mapper.map;
@Service
public class OfficerServiceImpl implements OfficerService {
@Autowired
    private OfficerRepository officers;

    @Override
    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request) {
        Officer officer = map(request);
         Officer SavedOfficer = officers.save(officer);
        return  map(SavedOfficer);

    }

}



