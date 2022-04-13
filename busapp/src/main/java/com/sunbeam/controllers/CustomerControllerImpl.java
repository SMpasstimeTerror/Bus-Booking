package com.sunbeam.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dtos.Credentials;
import com.sunbeam.dtos.CustomerDTO;
import com.sunbeam.dtos.Response;
import com.sunbeam.entities.Customer;
import com.sunbeam.services.CustomerServiceImpl;


@CrossOrigin
@RestController
public class CustomerControllerImpl {
	@Autowired
	private CustomerServiceImpl customerService;
	@PostMapping("/customer/signin")
	public ResponseEntity<?> signIn(@RequestBody Credentials cred) {
		CustomerDTO customerDto = customerService.findCustomerByEmailAndPassword(cred);
		if(customerDto == null)
			return Response.error("customer not found");
		return Response.success(customerDto);
	}
	@PostMapping("/customer/signup")
	public ResponseEntity<?> signUp(@RequestBody Customer customer) {
		Map<String, Object> result = customerService.saveCustomer(customer);
		return Response.success(result);
	}
	
	

}
