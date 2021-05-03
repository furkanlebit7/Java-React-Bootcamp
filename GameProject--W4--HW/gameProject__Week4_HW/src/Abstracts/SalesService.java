package Abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public interface SalesService {
	void buy(Customer customer,Game game);
	void buy(Customer customer,Game game,Campaign campaign);
}
