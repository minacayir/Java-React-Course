package week5homework1.business.concretes;

import week5homework1.business.abstracts.CustomerValidityService;
import week5homework1.dataAccess.abstracts.CustomerDao;
import week5homework1.entities.concretes.Customer;

public class CustomerValidityManager implements CustomerValidityService{
	
	private CustomerDao customerDao;
	
	public CustomerValidityManager(){
		
	}
	

	public CustomerValidityManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}


	@Override
	public boolean isItUsed(String eMail) {
		for(Customer customer : customerDao.getAll()) {
			if(eMail.equals(customer.getEmail())) {
				System.out.println("This e-mail address has been used before. Please enter a different e-mail address.");
				return false;
			}
		}
		return true;

	}


	

}
