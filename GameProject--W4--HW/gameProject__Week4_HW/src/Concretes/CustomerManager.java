package Concretes;

import Abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Yeni m��teri eklendi : "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void remove(Customer customer) {
		System.out.println("M��teri silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri bilgileri g�ncellendi : "+customer.getFirstName()+" "+customer.getLastName());
		
	}
	
}
