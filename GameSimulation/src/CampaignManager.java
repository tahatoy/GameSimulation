
public class CampaignManager implements CampaignService {

		
	@Override
	public void add(Campaign campaign) {
	System.out.println("Kampanya eklendi: "+campaign.getId()+" Kampanya ad�: "+ campaign.getName()+" �ndirim oran�: "+campaign.getDiscount());	
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi: "+campaign.getId()+" Kampanya ad�: "+ campaign.getName()+" G�ncel indirim oran�: "+campaign.getDiscount());	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya silindi: "+campaign.getId()+" Kampanya ad�: "+ campaign.getName());	
		
	}
	
}
