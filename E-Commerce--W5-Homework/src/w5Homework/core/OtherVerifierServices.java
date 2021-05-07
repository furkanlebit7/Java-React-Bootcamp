package w5Homework.core;

import w5Homework.entities.concretes.User;

public interface OtherVerifierServices {
	void signUpToSystem (User user);
	void signInToSystem (String email,String password);
}
