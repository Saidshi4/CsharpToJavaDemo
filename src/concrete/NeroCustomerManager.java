package concrete;

import abstract_.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) throws Exception {
        super.save(customer);
    }
}
