package com.technospace.customerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerapp")
public class CustomerController {
@GetMapping("/home")
	public String home() {
		return "Welcome to Customer App";
	}
}
