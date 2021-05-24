package week5homework1.business.concretes;

import week5homework1.business.abstracts.CustomerVerificationService;

public class CustomerVerificationManager implements CustomerVerificationService{

	@Override
	public void postVerificationCode(String eMail) {
		//String code= "https://aasdfghjklşi";
		System.out.println("Verification code sent to: " + eMail);		
	}

	@Override
	public boolean verificationMailIsItClicked(String eMail, String code) {
		String baseCode = "https://aasdfghjklşi";
		if(baseCode==code) {
			System.out.println("Mail is verified : " + eMail);
			return true;
		}else {
			System.out.println("Mail is not a verified");
		return false;
		}
		}
	

}
