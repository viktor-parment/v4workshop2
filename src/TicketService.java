import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public Ticket getTicket(int ticketId) {
        return tickets.get(ticketId);
    }
    public int getTicketCount(){
        return tickets.size();
    }
    public void removeTicket(Ticket ticket){
        tickets.remove(ticket);
    }
}
