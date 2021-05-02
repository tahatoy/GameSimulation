
public class User {
	private int id;
	private String firstName;
	private String lastName;
	private int birthDate;
	private String identityNumber;
	private String email;	
	
	public User(int id, String firstName, String lastName, int birthDate, String identityNumber, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.identityNumber = identityNumber;
		this.email = email;
	}
	
	//Private objelere sýnýf dýþýndan müdahale edebilmek için get ve set metodlarýmýzý yazalým
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	

	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
	public String getEmail() {
		return email;
	}	
	public void setEmail(String email) {
		this.email = email;
	}
	
		
}
