package week5homework1.business.concretes;

import week5homework1.business.abstracts.CustomerCheckService;
import week5homework1.business.abstracts.CustomerService;
import week5homework1.business.abstracts.CustomerValidityService;
import week5homework1.core.abstracts.LoggerService;
import week5homework1.dataAccess.abstracts.CustomerDao;
import week5homework1.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	private LoggerService loggerService;
	
	public CustomerManager() {
		
	}
	
	public CustomerManager(CustomerCheckService customerCheckService, CustomerDao customerDao,
			LoggerService loggerService) {
		super();
		this.customerCheckService = customerCheckService;
		this.customerDao = customerDao;
		this.loggerService = loggerService;
	}

	@Override
	public void userRegister(Customer customer) {
       CustomerValidityService validityService = new CustomerValidityManager();
		
		if
		(
		customerCheckService.nameController(customer.getFirstName(), customer.getLastName())
		&&
		customerCheckService.passwordController(customer.getPassword())
		&&
		customerCheckService.eMailController(customer.getEmail())
		&&
		validityService.isItUsed(customer.getEmail())
		)
		{
			customerDao.add(customer);
			loggerService.register();
		}		
	}

	@Override
	public void singIn(String eMail, String password) {
		for(Customer customer : customerDao.getAll()) {
			if(eMail.equals(customer.getEmail()) && password.equals(customer.getPassword())) {
				System.out.println("Successfully logged in.");
			}else {
				System.out.println("One or more of your login information is incorrect.");
			}	
		}
	}

	

}
