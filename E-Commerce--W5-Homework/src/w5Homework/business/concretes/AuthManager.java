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
			System.out.println("Ge�ersiz Parola");
		}else if(!verifyService.isEmailTrue(user.getEmail())) {
			System.out.println("Ge�ersiz E-posta format�");
		}
		else if(verifyService.isEmailExist(user.getEmail())) {
			System.out.println("Bu E-posta adresi zaten kullan�lmaktad�r");
		}
		else if(!verifyService.isFirstNameTrue(user.getFirstName())) {
			System.out.println("Hatal� kullan�c� ad�");
		}
		else if(!verifyService.isLastNameTrue(user.getLastName())) {
			System.out.println("Hatal� kullan�c� soyad�");
		}else {
			userService.add(user);
		}
	}

	@Override
	public void signIn(String email,String password) {
		if(!((userDao.get(email))==null)) {
			if(userDao.get(email).getPassword().equals(password)) {
				System.out.println("Sisteme ba�ar�l� bir �ekilde giri� yapt�n�z");
			}else {
				System.out.println("Hatal� kullan�c� ad� veya �ifre");
			}
		}
		else {
			System.out.println("Kullan�c� mevcut de�il");
		}
	}

}
