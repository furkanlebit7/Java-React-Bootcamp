package w5Homework.GoogleVerify;

import w5Homework.entities.concretes.User;

public class GoogleVerifier {
	public void signUp(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" Google Hesabýnýz ile baþarýlý bir þekilde kayýt oldunuz");
	}
	public void signIn(String email,String password) {
		System.out.println("Google Hesabýnýz ile baþarýlý bir þekilde giriþ yaptýnýz");
		
	}
}
