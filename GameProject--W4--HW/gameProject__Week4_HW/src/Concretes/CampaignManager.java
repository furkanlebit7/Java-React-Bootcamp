package Concretes;

import Abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Sisteme yeni kampanya eklendi : "+campaign.getName());
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya sistemden çýkarýldý : "+campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : "+campaign.getName());
		
	}

}
