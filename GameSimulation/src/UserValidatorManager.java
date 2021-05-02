
public class UserValidatorManager implements UserValidatorService{

	@Override
	public Boolean validate(User user) {
		if(user.getIdentityNumber().length()==11 && user.getBirthDate()>2000 && user.getFirstName().length()>2 && user.getLastName().length()>2)
		return true;
		else
		return false;
	}

}
