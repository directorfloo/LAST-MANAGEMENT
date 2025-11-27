package trafficSystem.data.repositories;

import trafficSystem.data.models.Officer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository

public interface OfficerRepository extends MongoRepository<Officer, String> {

    Officer save(Officer officer);
    Officer findById(int id);
    List<Officer> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Officer officer);
    Officer findByEmail(String email);
    long count();

}
