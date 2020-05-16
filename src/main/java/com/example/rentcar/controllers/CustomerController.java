package com.example.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentcar.entity.models.Customer;
import com.example.rentcar.entity.services.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCars(){
		return customerService.getAll();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getOne(@PathVariable(value = "id") long id) {
		return customerService.get(id);
	}
	
	@PostMapping("/customer")
	public void add (Customer customer) {
		customerService.post(customer);
	}
	
	@PutMapping("/customer/{id}")
	public void update (Customer customer,@PathVariable(value = "id") long id) {
		customerService.put(customer, id);
	}
	
	@DeleteMapping("/customer/{id}")
	public void delete (@PathVariable(value = "id") long id) {
		customerService.delete(id);
	}
}
