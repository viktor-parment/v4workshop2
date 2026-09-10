public class Customer {
    private int id;
    private String name;
    private static int nextId = 1;

    public int getId() {return this.id;}
    public String getName() {return this.name;}

    public Customer(String name){
        this.id = nextId;
        this.name = name;
        nextId++;
    }
    @Override
    public String toString() {
        return String.format("Customer: %s ID: %d", getName(), getId());
    }
}
