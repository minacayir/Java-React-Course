package week5homework1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import week5homework1.business.abstracts.CustomerCheckService;

public class CustomerCheckManager  implements CustomerCheckService{

	@Override
	public boolean passwordController(String password) {
		if(password.length()<6) {
			System.out.println("Your password must contain at least 6 characters.");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean eMailController(String eMail) {
		String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(eMail);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Your mail is invalid! Please enter a valid e-mail after checking the e-mail you entered. Mail:" + eMail);
            return false;
           }
	}

	@Override
	public boolean nameController(String firstName, String lastName) {
		if(firstName.length() < 2 && lastName.length() < 2 ) {
			System.out.println("Your name and surname must contain at least 2 characters.");
			return false;
		}
		return true;

	}

}
