package Abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public interface PaymentCheckService {
	boolean isWalletEnough(Customer customer,Game game);
	boolean isWalletEnough(Customer customer,Game game,Campaign campaign);
	boolean isAgeEnough(Customer customer,Game game);
}
