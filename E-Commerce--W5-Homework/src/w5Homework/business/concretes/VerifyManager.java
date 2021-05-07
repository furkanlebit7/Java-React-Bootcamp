package w5Homework.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import w5Homework.business.abstracts.VerifyService;
import w5Homework.dataAccess.abstracts.UserDao;

public class VerifyManager implements VerifyService{
	
	UserDao userDao;
	int verifyCode;

	public VerifyManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isPasswordTrue(String password) {
		if(password.length()>=6) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailTrue(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailExist(String email) {
		if(!(userDao.get(email)==null)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFirstNameTrue(String firstName) {
		if(firstName.length()>=2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isLastNameTrue(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}
		return false;
	}

	@Override
	public int emailSender() {
		  verifyCode= (int)(Math.random()*(10000+99999+1)+10000); 
		System.out.println("Email doðrulama kodunuz : "+verifyCode);
		
		return verifyCode;
	}

	@Override
	public void emailChecker() {
			System.out.println("Email doðrulamanýz onaylanmýþtýr");
	}

	@Override
	public boolean isUserVerified(boolean isV) {
		if(isV==true) {
			return true;
		}
		return false;
	}

	
	
}
