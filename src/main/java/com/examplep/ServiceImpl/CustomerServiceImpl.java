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
	public Customer getCustomerById(Long id) {
		
		return customerRepository.findById(id).get();
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		
		return  customerRepository.save(customer);
	}


	@Override
	public void deltedCustomerById(Long id) {
		customerRepository.deleteById(id);
		
	}
}
