package com.technospace.customerapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technospace.customerapp.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public Customer getCustomerByCid(int cid) ;
		
	}

