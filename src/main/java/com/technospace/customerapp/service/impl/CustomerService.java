package com.technospace.customerapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technospace.customerapp.entity.Customer;
import com.technospace.customerapp.model.CustomerModel;
import com.technospace.customerapp.repo.CustomerRepo;
import com.technospace.customerapp.service.ICustomer;
import com.technospace.customerapp.util.JMSUtil;

@Service
public class CustomerService implements ICustomer {
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	JMSUtil jMSUtil;
	@Override
	public String addcustomer(CustomerModel customerModel) {
		Customer customer = new Customer();
		customer.setCid(customerModel.getCid());
		customer.setName(customerModel.getName());
		customer.setMob(customerModel.getMob());
		customer.setBill(customerModel.getBill());
		customer.setEmail(customerModel.getEmail());
		jMSUtil.sendmail(customerModel.getEmail(),"preranapurkar12@gmail.com","Registation at Customer Application","Welcome to Customer App Developed by Technospace");
		customerRepo.save(customer);
		return "Customer Added...";
	}
	@Override
	public List<Customer> gellallcustomer() {
		return customerRepo.findAll();
	}
	@Override
	public Customer getcustomerbyid(int cid) {
		// TODO Auto-generated method stub
		return customerRepo.getCustomerByCid(cid);
	}
	
}
