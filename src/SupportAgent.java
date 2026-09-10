public class SupportAgent {
    public int id;
    private static int nextId = 1;
    public SupportLevel supportLevel;
    public String name;

    public int getId() {return this.id;}
    public String getName() {return this.name;}

    SupportAgent(SupportLevel supportLevel, String name){
        this.id = nextId;
        nextId++;
        this.supportLevel = supportLevel;
        this.name = name;
    }
}
