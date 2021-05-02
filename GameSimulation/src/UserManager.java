
public class UserManager implements UserService{

	UserValidatorService userValidationService;
	
	
	public UserManager(UserValidatorService userValidationService) {
		this.userValidationService = userValidationService;
	}

	
	
	@Override
	public void add(User user) {
		if(userValidationService.validate(user)==true) {
			System.out.println("Kullancý sisteme eklendi: "+user.getFirstName());
		}
		else {
			System.out.println("Doðrulama hatasý");
		}
	}

	@Override
	public void delete(User user) {
	System.out.println("Kullanýcý sistemden silindi "+ user.getFirstName()+" " +user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi "+ user.getFirstName()+" " +user.getLastName());
		
	}

}
