package com.technospace.customerapp.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.technospace.customerapp.entity.Customer;
import com.technospace.customerapp.model.CustomerModel;

public interface ICustomer {

	public String addcustomer(CustomerModel customerModel);
	public List<Customer>gellallcustomer();
}
