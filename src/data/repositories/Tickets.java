package data.repositories;

import data.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Tickets  implements TicketRepository {
    private int count;
private  static List<Ticket> tickets = new ArrayList<>();

    @Override
    public Ticket save(Ticket ticket) {
        if(ticket.getId() == 0){
          generated();
          ticket.setId(count);
          tickets.add(ticket);

        }
        return ticket;
    }

    private void generated() {
        count++;
    }


    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;

            }
        }
        throw new IllegalArgumentException("Vehicle with id " + id + " not found");
    }


    @Override
    public List<Ticket> findAll() {
        return tickets;
    }


    @Override
    public void deleteById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                tickets.remove(ticket);
                break;
            }
        }
    }


    @Override
    public void deleteAll() {
        tickets.clear();

    }


    @Override
    public void delete(Ticket ticket) {
       tickets.remove(ticket);

    }

    @Override
    public long count() {
        return tickets.size();
    }
}



