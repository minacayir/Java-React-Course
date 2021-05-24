package week5homework1.business.abstracts;

public interface CustomerCheckService {
	boolean passwordController(String password);
	boolean eMailController(String eMail);
	boolean nameController(String firstName, String lastName);

}
