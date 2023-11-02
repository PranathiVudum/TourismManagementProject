package com.examplep.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examplep.Repository.CustomerRepository;
import com.examplep.Service.CustomerService;
import com.examplep.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer>getAllCustomer(){

		return customerRepository.findAll();
	}
    @Override
	public Customer saveCustomer(Customer customer) {
    	return customerRepository.save(customer);
    }


	@Override
	public Customer getCustomerById(Long Id) {
		
		return customerRepository.findById(Id).get();
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		
		return  customerRepository.save(customer);
	}


	@Override
	public void deltedCustomerById(Long Id) {
		customerRepository.deleteById(Id);
		
	}
}
