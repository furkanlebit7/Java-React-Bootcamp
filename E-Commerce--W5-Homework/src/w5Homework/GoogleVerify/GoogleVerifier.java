package w5Homework.GoogleVerify;

import w5Homework.entities.concretes.User;

public class GoogleVerifier {
	public void signUp(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" Google Hesab�n�z ile ba�ar�l� bir �ekilde kay�t oldunuz");
	}
	public void signIn(String email,String password) {
		System.out.println("Google Hesab�n�z ile ba�ar�l� bir �ekilde giri� yapt�n�z");
		
	}
}
