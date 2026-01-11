package trafficSystem.data.repositories;

import trafficSystem.data.models.Officer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository

public interface OfficerRepository extends MongoRepository<Officer, String> {


    Officer findByEmail(String email);


}
