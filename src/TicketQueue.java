import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    private Queue<Ticket> tickets  = new LinkedList<>();

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public Ticket getNextTicket(){
        return tickets.poll();
    }
}
