package Adapters;

import Abstracts.CustomerCheckService;
import entities.Customer;

public class eDevletChecker implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getNationalId().length()==11) {
			return true;
		}else {
			return false;
		}
	}

}
