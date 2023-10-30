package com.examplep.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.examplep.Service.CustomerService;
import com.examplep.model.Customer;

@Controller

public class CustomerController {
	
private CustomerService customerService;

public CustomerController(CustomerService customerService) {
	super();
	this.customerService = customerService;
}
//handler method to handle list students and return mode and view
@GetMapping("/customer")
public String listCustomer(Model model) {
	model.addAttribute("customer",customerService.getAllCustomer());
	return "customer";
	
}
@GetMapping("/customer/new")
 public String createCustomerForm(Model model) {
	 //create customer object to hold customer form data
	 Customer customer =new Customer();
	 model.addAttribute("customer",customer);
	 return "create_customer";
	 
 }
@PostMapping("/customer")
      public String saveCustomer(@ModelAttribute("customer")Customer customer) {
	customerService.saveCustomer(customer);
	return "redirect:/customer";
	
}
@GetMapping("/customer/edit/{id}")
public String editCustomerForm(@PathVariable Long id,Model model) {
	model.addAttribute("customer",customerService.getCustomerById(id));
	return "edit_customer";

}

      @PostMapping("/customer/{id}")
       public String updateCustomer(@PathVariable Long id,
    		   @ModelAttribute("customer")Customer customer,
      Model model){
    	  
    	  
    	  //get customer from database by id 
    	  Customer existingCustomer=customerService.getCustomerById(id);
    	  existingCustomer.setCId(id);
    	  existingCustomer.setCName(customer.getCName());
    	  existingCustomer.setCMail(customer.getCMail());
    	  existingCustomer.setCPhno(customer.getCPhno());
     
    	  //save updated customer object
    	  customerService.updateCustomer(existingCustomer);
    	  return "redirect:/customer";
      }
    	  
    	  //handler method to delete customer request
      @GetMapping("/customer/{id}")
      public String deleteCustomer(@PathVariable Long id) {
    	  customerService.deltedCustomerById(id);
    	  return "redirect:/customer";
      }
}

   


