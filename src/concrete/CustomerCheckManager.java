package concrete;

import abstract_.ICustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}