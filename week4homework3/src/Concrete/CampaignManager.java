package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "has been added.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "has been updated.");
		
	}

	@Override
	public void delete(Campaign campaign) { 
		System.out.println(campaign.getCampaignName()+ "has been deleted.");		
	}

}
