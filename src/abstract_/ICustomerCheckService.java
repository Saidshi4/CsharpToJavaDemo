package abstract_;

import entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
