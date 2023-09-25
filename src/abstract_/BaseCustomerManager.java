package abstract_;

import abstract_.ICustomerService;
import entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to DB: " + customer.firstName);
    }
}
