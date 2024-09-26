package com.sunbase.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbase.crud.dao.ICustomerRepository;
import com.sunbase.crud.entity.Customer;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	
	
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	
	
	public Customer saveAll(Customer customer)
	{
	
		Customer save = this.customerRepository.save(customer);
		
		return save;
	
	}
	
	public List<Customer> getAll()
	{
		
		List<Customer> all = this.customerRepository.findAll();
		
		return all;
	}
	
	
	public Optional<Customer> getById(int id)
	{
		
		Optional<Customer> customer = this.customerRepository.findById(id);
		
		return customer;
	}
	
	
	public void deleteRecord(int id)
	{
		
		this.customerRepository.deleteById(id);
	}
	
	
	public String updateCustomer(int id , Customer customer)
	{
		
		
		Optional<Customer> byCustomer = this.customerRepository.findById(id);
		
		
		  if (byCustomer.isPresent()) {
		        Customer existingCustomer = byCustomer.get(); // Retrieve the customer object
		        
		        existingCustomer.setFirst_name(customer.getFirst_name());
		        existingCustomer.setLast_name(customer.getLast_name());
		        existingCustomer.setStreet(customer.getStreet());
		        existingCustomer.setAddress(customer.getAddress());
		        existingCustomer.setCity(customer.getCity());
		        existingCustomer.setState(customer.getState());
		        existingCustomer.setEmail(customer.getEmail());
		        existingCustomer.setPhone(customer.getPhone());

		         this.customerRepository.save(existingCustomer);
		    }
		
		return "Updated";
	}
	
	
	
	

}
