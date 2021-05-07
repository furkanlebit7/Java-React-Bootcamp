package w5Homework.business.concretes;

import w5Homework.business.abstracts.UserService;
import w5Homework.business.abstracts.VerifyService;
import w5Homework.core.OtherVerifierServices;
import w5Homework.dataAccess.abstracts.UserDao;
import w5Homework.entities.concretes.User;

public class UserManager implements UserService{
	UserDao userDao;
	VerifyService verifyService;

	public UserManager(UserDao userDao, VerifyService verifyService) {
		super();
		this.userDao = userDao;
		this.verifyService = verifyService;
	}

	@Override
	public void add(User user) {
		user.setIsVerified(true);
		userDao.add(user);
		System.out.println("Kayd�n�z ba�ar�l� bir �ekilde olu�turulmu�tur");
		verifyService.emailSender();
	}

	@Override
	public void delete(int id) {
		if(userDao.delete(id)) {
			System.out.println("Kullan�c� ba�ar�l� bir �ekilde silinmi�tir");
		}else {
			System.out.println("Var olmayan bir kullan�c�y� silmeye �al���yorsunuz");
		}
		
	}

	@Override
	public void update(User user) {
		if(userDao.update(user)) {
			System.out.println("Kullan�c� ba�ar�l� bir �ekilde d�zenlendi");
		}else {
			System.out.println("Var olmayan bir kullan�c�y� d�zenlemeye �al���yorsunuz");
		}
		
	}

}
