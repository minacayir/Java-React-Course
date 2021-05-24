package week5homework1;

import week5homework1.business.abstracts.CustomerService;
import week5homework1.business.concretes.CustomerCheckManager;
import week5homework1.business.concretes.CustomerManager;
import week5homework1.core.concretes.GoogleLoggerManagerAdapter;
import week5homework1.dataAccess.concretes.HibernateCustomerDao;
import week5homework1.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new CustomerCheckManager(), new HibernateCustomerDao(), new GoogleLoggerManagerAdapter());
		Customer customer = new Customer(1,"Mina","Çayır","asdfgg@gmail.com","1111111");
		customerService.userRegister(customer);
	}

}
