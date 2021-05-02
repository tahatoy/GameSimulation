
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
	System.out.println("Oyun baþarýyla sisteme eklendi: "+ game.getId()+" Adý: "+ game.getName()+" Fiyatý: "+game.getPrice()+ "TL" + " Kampanya Kodu: "+ game.getCampaignId());
		
	}

	@Override
	public void update(Game game) {
		 System.out.println("" +
	                "Oyun Güncellendi "+"Id:"+game.getId()+" Adý: "
	                +game.getName()+" Fiyatý: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());
	}

	@Override
	public void delete(Game game) {
		  System.out.println("" +
	                "Oyun Silindi "+"Id:"+game.getId()+" Adý: "
	                +game.getName()+" Fiyatý: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());

	}

}
