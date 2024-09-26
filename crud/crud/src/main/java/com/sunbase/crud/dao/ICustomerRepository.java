package com.sunbase.crud.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sunbase.crud.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {


	
	


}
