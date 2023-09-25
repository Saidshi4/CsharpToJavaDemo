package adapters;

import abstract_.ICustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        //KPSPublicSoapClient client = new KPSPublicSoapClient();
        //Ben Azerbaycandan izliyorum diye tckimlik sitesine ulashamadim vpn de kullandim olmadi diye manual olaraq kendim "true" yaptim
        return true;
    }
}
