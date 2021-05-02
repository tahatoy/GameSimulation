
public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager(new UserValidatorManager());
		userManager.add(new User(1,"Taha","Toy",2001,"12346578912","mttoy45@gmail.com"));
	
	
		 GameManager gameManager = new GameManager();
	     gameManager.update(new Game(
	             1,
	             1,
	             "Nba2k21",
	             300
	     ));

	     CampaignManager campaignManager = new CampaignManager();
	     campaignManager.delete(new Campaign(
	             1,
	             "Kış Kampanyası",
	             23
	     ));

	     	
	     SalesManager saleManager = new SalesManager();
	        saleManager.sell(new User(
	                1,
	                "1234556",
	                "Taha",
	                1994,
	                "Toy",
	                "mttoy45@gmail.com"

	        ),new Campaign(
	                2,
	                "Summer Campaign",
	                33
	        ),new Game(
	                2,
	                1,
	                "Gta V",
	                150

	        ));
	
	
	}
	
}
