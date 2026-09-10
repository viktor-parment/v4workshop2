import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ticket {
    private int id;
    private String title;
    private String description;
    private SupportLevel supportLevel;
    private Customer reporter;
    private List<SupportAgent> responders = new ArrayList<>();
    private Set<TicketTag> ticketTags = new HashSet<>();
    private final LocalDateTime creationDate;
    private final LocalDateTime expirationDate;

    private static int nextId = 1;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Ticket(String title, String description,
                  SupportLevel supportLevel, Customer reporter) {

        this.title = title;
        this.id = nextId++;
        this.description = description;
        this.supportLevel = supportLevel;
        this.reporter = reporter;

        LocalDateTime today = LocalDateTime.now();
        this.creationDate = today;
        this.expirationDate = (today.plusDays(7));
    }

    public void ticketValidation(int id){

    }

    public void addTag(TicketTag tag) {
        ticketTags.add(tag);
    }
}