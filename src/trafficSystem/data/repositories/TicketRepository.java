package trafficSystem.data.repositories;

import trafficSystem.data.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository

public interface TicketRepository extends MongoRepository<Ticket,String> {

        Ticket save(Ticket ticket);
        Ticket findById(int id);
        List<Ticket> findAll();
        void deleteById(int id);
        void deleteAll();
        void delete(Ticket ticket);
        long count();
}
