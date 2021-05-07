package w5Homework.business.abstracts;

public interface VerifyService {
	boolean isUserVerified(boolean isV);
	boolean isPasswordTrue(String password);
	boolean isEmailTrue(String email);
	boolean isEmailExist(String email);
	boolean isFirstNameTrue(String firstName);
	boolean isLastNameTrue(String lastName);
	int emailSender();
	void emailChecker();
}
