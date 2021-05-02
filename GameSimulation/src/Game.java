
public class Game {
	private int id;
	private int campaignId;
	private String name;
	private double price;
	
	public Game(int id, int campaignId, String name, double price) {
		super();
		this.id = id;
		this.campaignId = campaignId;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
