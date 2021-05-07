package w5Homework.core;

import w5Homework.GoogleVerify.GoogleVerifier;
import w5Homework.entities.concretes.User;

public class GoogleVerifierAdapter implements OtherVerifierServices{
	
	GoogleVerifier googleVerifier = new GoogleVerifier();
	
	@Override
	public void signUpToSystem(User user) {
		googleVerifier.signUp(user);
		
	}

	@Override
	public void signInToSystem(String email,String password) {
		googleVerifier.signIn(email,password);
	}

}
