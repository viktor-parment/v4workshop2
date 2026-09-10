void main() {
    Customer customer1 = new Customer("Bojana");
    Customer customer2 = new Customer( "Jon");
    Customer customer3 = new Customer ("Viktor");

    SupportAgent Agent1 = new SupportAgent(SupportLevel.FirstLine, "Agent1");
    SupportAgent Agent2 = new SupportAgent(SupportLevel.SecondLine,  "Agent2");
    SupportAgent Agent3 = new SupportAgent(SupportLevel.ThirddLine, "Agent3");

    Ticket ticket1 = new Ticket("Problem", "aaah allt går sönder", SupportLevel.ThirddLine, customer1);;

    CustomerService customerService = new CustomerService();

    customerService.addCustomerToMap(customer1);
    customerService.getCustomerFromMap(1);

    IO.println(customerService);

    IO.println(customer1);
    IO.println(customer2);
    IO.println(customer3);
    IO.println(Agent1);
    IO.println(Agent2);
    IO.println(Agent3);



}