
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
	System.out.println("Oyun ba�ar�yla sisteme eklendi: "+ game.getId()+" Ad�: "+ game.getName()+" Fiyat�: "+game.getPrice()+ "TL" + " Kampanya Kodu: "+ game.getCampaignId());
		
	}

	@Override
	public void update(Game game) {
		 System.out.println("" +
	                "Oyun G�ncellendi "+"Id:"+game.getId()+" Ad�: "
	                +game.getName()+" Fiyat�: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());
	}

	@Override
	public void delete(Game game) {
		  System.out.println("" +
	                "Oyun Silindi "+"Id:"+game.getId()+" Ad�: "
	                +game.getName()+" Fiyat�: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());

	}

}
