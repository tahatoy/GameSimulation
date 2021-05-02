
public class SalesManager implements SalesService {

	@Override
	public void sell(User user, Campaign campaign, Game game) {
		System.out.println(game.getName() + " Oyunu  "+ user.getFirstName()+ " kullanýcýsýna " + campaign.getName() + " kampnayasýyla " + " %  "+campaign.getDiscount()+ " indirimli "
				+ " satýlmýþtýr. Güle güle kullanýn."  );
		
	}

}
