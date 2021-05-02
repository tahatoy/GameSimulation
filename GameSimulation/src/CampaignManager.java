
public class CampaignManager implements CampaignService {

		
	@Override
	public void add(Campaign campaign) {
	System.out.println("Kampanya eklendi: "+campaign.getId()+" Kampanya adý: "+ campaign.getName()+" Ýndirim oraný: "+campaign.getDiscount());	
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya güncellendi: "+campaign.getId()+" Kampanya adý: "+ campaign.getName()+" Güncel indirim oraný: "+campaign.getDiscount());	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya silindi: "+campaign.getId()+" Kampanya adý: "+ campaign.getName());	
		
	}
	
}
