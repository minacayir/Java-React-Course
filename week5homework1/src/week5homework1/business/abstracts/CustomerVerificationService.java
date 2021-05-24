package week5homework1.business.abstracts;

public interface CustomerVerificationService {
	void postVerificationCode(String eMail);
	boolean verificationMailIsItClicked(String eMail, String code);

}
