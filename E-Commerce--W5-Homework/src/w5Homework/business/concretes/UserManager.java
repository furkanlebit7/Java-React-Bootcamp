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
		System.out.println("Kaydınız başarılı bir şekilde oluşturulmuştur");
		verifyService.emailSender();
	}

	@Override
	public void delete(int id) {
		if(userDao.delete(id)) {
			System.out.println("Kullanıcı başarılı bir şekilde silinmiştir");
		}else {
			System.out.println("Var olmayan bir kullanıcıyı silmeye çalışıyorsunuz");
		}
		
	}

	@Override
	public void update(User user) {
		if(userDao.update(user)) {
			System.out.println("Kullanıcı başarılı bir şekilde düzenlendi");
		}else {
			System.out.println("Var olmayan bir kullanıcıyı düzenlemeye çalışıyorsunuz");
		}
		
	}

}
