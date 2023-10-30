package com.examplep.Service;

import java.util.List;

import com.examplep.model.Customer;

public interface CustomerService {
	List<Customer>getAllCustomer();
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(Long id);
	
	Customer updateCustomer(Customer customer);
	
    void deltedCustomerById(Long id);

}
