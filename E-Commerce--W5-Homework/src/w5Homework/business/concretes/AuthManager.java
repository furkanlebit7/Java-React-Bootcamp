package w5Homework.business.concretes;

import w5Homework.business.abstracts.AuthService;
import w5Homework.business.abstracts.UserService;
import w5Homework.business.abstracts.VerifyService;
import w5Homework.core.OtherVerifierServices;
import w5Homework.dataAccess.abstracts.UserDao;
import w5Homework.entities.concretes.User;

public class AuthManager implements AuthService{


	OtherVerifierServices otherVerifierServices;
	VerifyService verifyService;
	UserService userService;
	UserDao userDao;
	
	

	public AuthManager(VerifyService verifyService, UserService userService, UserDao userDao) {
		super();
		this.verifyService = verifyService;
		this.userService = userService;
		this.userDao = userDao;
		this.otherVerifierServices=otherVerifierServices;
	}

	@Override
	public void signUp(User user) {
		if(!verifyService.isPasswordTrue(user.getPassword())) {
			System.out.println("Geçersiz Parola");
		}else if(!verifyService.isEmailTrue(user.getEmail())) {
			System.out.println("Geçersiz E-posta formatý");
		}
		else if(verifyService.isEmailExist(user.getEmail())) {
			System.out.println("Bu E-posta adresi zaten kullanýlmaktadýr");
		}
		else if(!verifyService.isFirstNameTrue(user.getFirstName())) {
			System.out.println("Hatalý kullanýcý adý");
		}
		else if(!verifyService.isLastNameTrue(user.getLastName())) {
			System.out.println("Hatalý kullanýcý soyadý");
		}else {
			userService.add(user);
		}
	}

	@Override
	public void signIn(String email,String password) {
		if(!((userDao.get(email))==null)) {
			if(userDao.get(email).getPassword().equals(password)) {
				System.out.println("Sisteme baþarýlý bir þekilde giriþ yaptýnýz");
			}else {
				System.out.println("Hatalý kullanýcý adý veya þifre");
			}
		}
		else {
			System.out.println("Kullanýcý mevcut deðil");
		}
	}

}
