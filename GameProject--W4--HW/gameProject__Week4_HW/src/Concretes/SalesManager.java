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
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullanýcý "+game.getName()+" oyununu "+game.getPrice()+" TL karþýlýðýnda satýn aldý ----- Kalan bakiye : "+customer.getWallet()+" TL");
		}else if(!paymentChecker.isWalletEnough(customer, game)){
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullanýcý "+game.getName()+" oyunu için yeterli bakiyeye sahip deðil");
		}else if(!paymentChecker.isAgeEnough(customer,game)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullanýcý 18 yaþýndan küçük olduðu için "+game.getName()+" oyununu satýn alamamaktadýr");
		}
		
	}
	@Override
	public void buy(Customer customer,Game game,Campaign campaign) {
		if(paymentChecker.isWalletEnough(customer, game,campaign) && paymentChecker.isAgeEnough(customer,game) ) {
			customer.setWallet(customer.getWallet()-(game.getPrice()-((game.getPrice()*campaign.getDiscount())/100)));
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullanýcý"+game.getName()+" oyununu "+campaign.getName()+" kampanyasýndan yararlanarak  %"+campaign.getDiscount()+" indirim ile "+(game.getPrice()-((game.getPrice()*campaign.getDiscount())/100))+" TL karþýlýðýnda satýn aldý ----- Kalan bakiye : "+customer.getWallet()+" TL");
		}else if(!paymentChecker.isWalletEnough(customer, game)){
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullanýcý "+game.getName()+" oyunu için yeterli bakiyeye sahip olmadýðýndan "+campaign.getName()+" kampanyasýndan faydalanamamaktadýr");
		}else if(!paymentChecker.isAgeEnough(customer,game)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli kullanýcý 18 yaþýndan küçük olduðu için "+campaign.getName()+" kampanyasýndan faydalanamaz ve "+game.getName()+" oyununu satýn alamamaktadýr");
		}
		
	}
	

}
