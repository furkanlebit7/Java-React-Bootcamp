package P.Abstract;

import P.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
