package Data.repositories;

import Data.models.Ticket;

import java.util.List;

public class Tickets  implements TicketRepository {

    @Override
    public Ticket save(Ticket ticket) {
        return null;
    }


    @Override
    public Ticket findById(int id) {
        return null;
    }


    @Override
    public List<Ticket> findAll() {
        return List.of();
    }


    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }


    @Override
    public void delete(Ticket ticket) {

    }

    @Override
    public long count() {
        return 0;
    }
}



