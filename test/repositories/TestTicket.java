//package repositories;
//
//import data.models.Ticket;
//import data.repositories.TicketRepository;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertEquals;
//
//public class TestTicket {
//    private TicketRepository ticket;
//
//
//    @BeforeEach
//    public void setUp() {
//        ticket = new Tickets();
//
//    }
//    @Test
//    public void testNotAvailable() {
//        assertEquals(0, ticket.count());
//    }
//    @Test
//    public void testAddTicket() {
//        Ticket myticket = new Ticket();
//        ticket.save(myticket);
//        assertEquals(1, ticket.count());
//
//    }
//    @Test
//    public void testFindTicketById() {
//        Ticket myticket = new Ticket();
//        ticket.save(myticket);
//        assertEquals(1, ticket.count());
//        assertEquals(myticket, ticket.findById(myticket.getId()));
//
//    }
//    @Test
//    public void testDeleteTicketById() {
//        Ticket myticket = new Ticket();
//        ticket.save(myticket);
//        ticket.deleteById(1);
//        assertEquals(0, ticket.count());
//    }
//
//    @Test
//    public void testFindAllTicket() {
//        Ticket myticket = new Ticket();
//        ticket.save(myticket);
//        Ticket mysticket = new Ticket();
//        ticket.save(mysticket);
//        ticket.findAll();
//        assertEquals(2, ticket.count());
//
//    }
//    @Test
//    public void  testDeleteAllTicket() {
//        Ticket myticket = new Ticket();;
//        ticket.save(myticket);
//        Ticket mysticket = new Ticket();;
//        ticket.save(mysticket);
//        ticket.deleteAll();
//        assertEquals(0, ticket.count());
//    }
//    @Test
//    public void   testDeleteTicket() {
//        Ticket myticket = new Ticket();;
//        ticket.save(myticket);
//        Ticket mysticket = new Ticket();;
//        ticket.save(mysticket);
//        ticket.delete(myticket);
//        ticket.delete(mysticket);
//        assertEquals(0, ticket.count());
//
//    }
//
//
//}
//
//
//
//
