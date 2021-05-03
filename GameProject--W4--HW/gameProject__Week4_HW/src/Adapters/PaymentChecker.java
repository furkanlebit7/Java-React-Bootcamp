package Adapters;

import java.util.Calendar;

import Abstracts.PaymentCheckService;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class PaymentChecker implements PaymentCheckService{

	@Override
	public boolean isWalletEnough(Customer customer,Game game) {
		if(customer.getWallet() >= game.getPrice()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean isWalletEnough(Customer customer, Game game, Campaign campaign) {
		if(customer.getWallet() >= (game.getPrice()-(game.getPrice()*campaign.getDiscount())/100)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isAgeEnough(Customer customer,Game game) {
		if(game.getNeed18()) {
			if(Calendar.getInstance().get(Calendar.YEAR)-customer.getDateOfBirth()>=18) {
				return true;
			}else {
				return false;
			}
		}else {
			return true;
		}
		
	}

	

}
