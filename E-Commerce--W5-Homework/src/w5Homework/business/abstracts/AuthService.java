package w5Homework.business.abstracts;

import w5Homework.entities.concretes.User;

public interface AuthService {
	void signUp(User user);
	void signIn(String email,String password);
}
