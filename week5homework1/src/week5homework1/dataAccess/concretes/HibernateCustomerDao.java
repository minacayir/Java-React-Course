package week5homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import week5homework1.dataAccess.abstracts.CustomerDao;
import week5homework1.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	
	public List<Customer> customers= new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+"successfully added.");
		customers.add(customer);
		
		
	}

	

	@Override
	public void delete(Customer customer) {
		
		for(Customer customer2 : customers ) {
			if (customer2.getId()==customer.getId()) {
				customers.remove(customer2);
			}
		}
		customers.remove(customer);
		
		
	}

	

	@Override
	public List<Customer> getAll() {
		
		
		return customers;
	}



	
	



	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Customer get(int id) {
		for (Customer customer : customers) {
			if(customer.getId()==id) {
				return customer;
			}
		}
		return null;
	}

}
