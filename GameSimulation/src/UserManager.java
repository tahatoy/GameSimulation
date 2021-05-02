
public class UserManager implements UserService{

	UserValidatorService userValidationService;
	
	
	public UserManager(UserValidatorService userValidationService) {
		this.userValidationService = userValidationService;
	}

	
	
	@Override
	public void add(User user) {
		if(userValidationService.validate(user)==true) {
			System.out.println("Kullanc� sisteme eklendi: "+user.getFirstName());
		}
		else {
			System.out.println("Do�rulama hatas�");
		}
	}

	@Override
	public void delete(User user) {
	System.out.println("Kullan�c� sistemden silindi "+ user.getFirstName()+" " +user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi "+ user.getFirstName()+" " +user.getLastName());
		
	}

}
