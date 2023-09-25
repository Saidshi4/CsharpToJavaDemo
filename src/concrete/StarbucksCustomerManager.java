package concrete;

import abstract_.BaseCustomerManager;
import abstract_.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    ICustomerCheckService iCustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService){
        this.iCustomerCheckService = iCustomerCheckService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        if(iCustomerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else throw new Exception("Not a valid person!");
    }
}
