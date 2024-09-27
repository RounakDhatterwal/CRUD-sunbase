package com.sunbase.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunbase.crud.entity.Customer;
import com.sunbase.crud.services.CustomerService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/") 
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@GetMapping("/login")
	public ResponseEntity<HttpStatus> login()
	{
		return ResponseEntity.ok().body(HttpStatus.ACCEPTED);
	}
	

	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		
//		System.out.println(customer.toString());
//		
//		 Customer saveAll = this.customerService.saveAll(customer);
		try {
	        System.out.println(customer.toString());
	        return this.customerService.saveAll(customer);
	    } catch (Exception e) {
	        System.out.println("Error saving customer: " + e.getMessage());
	        return null; // Or handle as needed
	    }
	}
	
	
	@GetMapping("/all")
	public List<Customer> getAll()
	{
		
		List<Customer> all = this.customerService.getAll();
		
		return all;
		
	}
	
	
	@GetMapping("/get/{id}")
	public Optional<Customer> findById(@PathVariable int id)
	{
		
		Optional<Customer> customer = this.customerService.getById(id);
		
		return customer;
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		
		this.customerService.deleteRecord(id);
		
		
		return "delete record";
	}
	
	
	@PutMapping("/update/{id}")
	public String updateCustomer(@PathVariable int id , @RequestBody Customer customer)
	{
		
		String updateCustomer = this.customerService.updateCustomer(id, customer);
		
		
		return updateCustomer;
	}

}
