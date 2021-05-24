package week5homework1.business.abstracts;

import week5homework1.entities.concretes.Customer;

public interface CustomerService {
	void userRegister(Customer customer);
	void singIn(String eMail,String password);

}
