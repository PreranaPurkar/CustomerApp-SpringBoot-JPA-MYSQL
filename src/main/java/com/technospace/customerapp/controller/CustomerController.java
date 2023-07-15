package com.technospace.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technospace.customerapp.model.CustomerModel;
import com.technospace.customerapp.service.ICustomer;
	
@RestController
@RequestMapping("/customerapp")
public class CustomerController {
	
	@Autowired
	ICustomer iCustomer;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Customer App";
	}
	@PostMapping("/addcustomer")
	public String addcustomer(@RequestBody CustomerModel customerModel) {
	return iCustomer.addcustomer(customerModel);
	}
	
	@GetMapping("/getallcustomer")
	public List getallcustomer() {
		return iCustomer.gellallcustomer();
	}

}
