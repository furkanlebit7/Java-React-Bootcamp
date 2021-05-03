package Concretes;

import Abstracts.SalesService;
import Adapters.PaymentChecker;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class SalesManager implements SalesService{

	PaymentChecker paymentChecker = new PaymentChecker();
		
	@Override
	public void buy(Customer customer,Game game) {
		if(paymentChecker.isWalletEnough(customer, game) && paymentChecker.isAgeEnough(customer,game) ) {
			customer.setWallet(customer.getWallet()-game.getPrice());
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullan�c� "+game.getName()+" oyununu "+game.getPrice()+" TL kar��l���nda sat�n ald� ----- Kalan bakiye : "+customer.getWallet()+" TL");
		}else if(!paymentChecker.isWalletEnough(customer, game)){
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullan�c� "+game.getName()+" oyunu i�in yeterli bakiyeye sahip de�il");
		}else if(!paymentChecker.isAgeEnough(customer,game)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullan�c� 18 ya��ndan k���k oldu�u i�in "+game.getName()+" oyununu sat�n alamamaktad�r");
		}
		
	}
	@Override
	public void buy(Customer customer,Game game,Campaign campaign) {
		if(paymentChecker.isWalletEnough(customer, game,campaign) && paymentChecker.isAgeEnough(customer,game) ) {
			customer.setWallet(customer.getWallet()-(game.getPrice()-((game.getPrice()*campaign.getDiscount())/100)));
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullan�c�"+game.getName()+" oyununu "+campaign.getName()+" kampanyas�ndan yararlanarak  %"+campaign.getDiscount()+" indirim ile "+(game.getPrice()-((game.getPrice()*campaign.getDiscount())/100))+" TL kar��l���nda sat�n ald� ----- Kalan bakiye : "+customer.getWallet()+" TL");
		}else if(!paymentChecker.isWalletEnough(customer, game)){
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullan�c� "+game.getName()+" oyunu i�in yeterli bakiyeye sahip olmad���ndan "+campaign.getName()+" kampanyas�ndan faydalanamamaktad�r");
		}else if(!paymentChecker.isAgeEnough(customer,game)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullan�c� 18 ya��ndan k���k oldu�u i�in "+campaign.getName()+" kampanyas�ndan faydalanamaz ve "+game.getName()+" oyununu sat�n alamamaktad�r");
		}
		
	}
	

}
