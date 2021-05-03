package Concretes;

import Abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Yeni müþteri eklendi : "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void remove(Customer customer) {
		System.out.println("Müþteri silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri bilgileri güncellendi : "+customer.getFirstName()+" "+customer.getLastName());
		
	}
	
}
