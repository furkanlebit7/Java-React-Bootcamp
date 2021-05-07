package w5Homework;

import w5Homework.business.abstracts.AuthService;
import w5Homework.business.abstracts.VerifyService;
import w5Homework.business.concretes.AuthManager;
import w5Homework.business.concretes.UserManager;
import w5Homework.business.concretes.VerifyManager;
import w5Homework.core.GoogleVerifierAdapter;
import w5Homework.dataAccess.concretes.NormalUserDao;
import w5Homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		
		User user = new User();
		user.setId(3);
		user.setFirstName("Furkan");
		user.setLastName("Lebit");
		user.setEmail("furkanlebitt7@gmail.com");
		user.setPassword("1234567");
		user.setIsVerified(false);
		
		AuthService auther = new AuthManager(new VerifyManager(new NormalUserDao()),new UserManager(new NormalUserDao(),new VerifyManager(new NormalUserDao())),new NormalUserDao());
		VerifyService verifier = new VerifyManager(new NormalUserDao());
		
		auther.signUp(user);
		verifier.emailChecker();
		User user1=new User(1, "Zeynep", "Yavuz", "zeynepyavuz@gmail.com", "741852", true);

		auther.signIn(user1.getEmail(),user1.getPassword());
		
		GoogleVerifierAdapter adapter = new GoogleVerifierAdapter();
		adapter.signUpToSystem(user);
		adapter.signInToSystem(user.getEmail(), user.getPassword());
	}

}
