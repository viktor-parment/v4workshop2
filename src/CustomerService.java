import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomerToMap(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer getCustomerFromMap(int id) {
        return customers.get(id);
    }

    @Override
    public String toString() {
        return String.format("Customer: %s ID: %d", getCustomerFromMap.getName(), customers.get());
    }
}