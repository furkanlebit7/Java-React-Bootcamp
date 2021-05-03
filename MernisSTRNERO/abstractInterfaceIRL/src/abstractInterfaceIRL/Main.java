package abstractInterfaceIRL;

import P.Abstract.BaseCustomerManager;
import P.Adapters.MernisServiceAdapter;
import P.Concrete.NeroCustomerManager;
import P.Concrete.StarbucksCustomerManager;
import P.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Furkan");
		customer.setLastName("Lebit");
		customer.setDateOfBirth(1998);
		customer.setNationalityId(29323813708L);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		
	}

}
