package Main;

import Concretes.CampaignManager;
import Concretes.CustomerManager;
import Concretes.GameManager;
import Concretes.SalesManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1,"Furkan","Lebit",1998,200,"12345678910");
		Game game1 = new Game(12,"CS:GO",70,false,2012);
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		SalesManager salesManager = new SalesManager();
		salesManager.buy(customer1, game1);

		Game game2 = new Game(7,"GTA 5",150,true,2013);
		gameManager.add(game2);
		salesManager.buy(customer1, game2);
		
		Campaign campaign = new Campaign(5,"Engin Demiroð Özel",50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		salesManager.buy(customer1, game2,campaign);
		
		customerManager.update(customer1);
		customerManager.remove(customer1);

		System.out.println("------------------------------------------");
		
		Customer customer2 = new Customer(2,"Muhammed","Lebit",2005,500,"12666678910");
		customerManager.add(customer2);
		salesManager.buy(customer2, game1);
		salesManager.buy(customer2, game2);
		salesManager.buy(customer2, game2, campaign);
		
		customerManager.update(customer2);
		customerManager.remove(customer2);
		gameManager.update(game2);
		gameManager.remove(game1);
		campaignManager.update(campaign);
		campaignManager.remove(campaign);
		
		
	}

}
