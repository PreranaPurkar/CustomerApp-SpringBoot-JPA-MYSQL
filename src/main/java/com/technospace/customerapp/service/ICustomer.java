package com.technospace.customerapp.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.technospace.customerapp.model.CustomerModel;

public interface ICustomer {

	public String addcustomer(CustomerModel customerModel);
}
