package P.Concrete;

import P.Abstract.CustomerCheckService;
import P.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
	
}
