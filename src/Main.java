import abstract_.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer(123, "Said", "Gulizada", "2004/10/24", 1234567890);
        customerManager.save(customer);
    }
}