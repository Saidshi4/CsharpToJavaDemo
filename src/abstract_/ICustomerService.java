package abstract_;

import entities.Customer;

public interface ICustomerService {
    void save(Customer customer) throws Exception;
}
