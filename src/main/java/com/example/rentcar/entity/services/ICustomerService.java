package com.example.rentcar.entity.services;

import java.util.List;

import com.example.rentcar.entity.models.Customer;

public interface ICustomerService {

	public Customer get(long id);
	public List<Customer> getAll();
	public void post(Customer customer);
	public void put(Customer customer, long id);
	public void delete(long id);
}
