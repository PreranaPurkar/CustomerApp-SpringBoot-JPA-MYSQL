package com.technospace.customerapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technospace.customerapp.entity.Customer;
import com.technospace.customerapp.model.CustomerModel;
import com.technospace.customerapp.repo.CustomerRepo;
import com.technospace.customerapp.service.ICustomer;

@Service
public class CustomerService implements ICustomer {
	@Autowired
	CustomerRepo customerRepo;
	@Override
	public String addcustomer(CustomerModel customerModel) {
		Customer customer = new Customer();
		customer.setCid(customerModel.getCid());
		customer.setName(customerModel.getName());
		customer.setMob(customerModel.getMob());
		customer.setBill(customerModel.getBill());
		customer.setEmail(customerModel.getEmail());
		customerRepo.save(customer);
		
		return "Customer Added...";
	}
	@Override
	public List<Customer> gellallcustomer() {
		return customerRepo.findAll();
	}
}
