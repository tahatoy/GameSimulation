
public class SalesManager implements SalesService {

	@Override
	public void sell(User user, Campaign campaign, Game game) {
		System.out.println(game.getName() + " Oyunu  "+ user.getFirstName()+ " kullan�c�s�na " + campaign.getName() + " kampnayas�yla " + " %  "+campaign.getDiscount()+ " indirimli "
				+ " sat�lm��t�r. G�le g�le kullan�n."  );
		
	}

}
