package Abstracts;

import entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void remove(Customer customer);
	void update(Customer customer);
}
