package com.example.rentcar.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rentcar.entity.dao.ICustomerDao;
import com.example.rentcar.entity.models.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao customerDao;

	@Override
	public Customer get(long id) {
		return customerDao.findById(id).get();
	}

	@Override
	public List<Customer> getAll() {
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public void post(Customer customer) {
		customerDao.save(customer);		
	}

	@Override
	public void put(Customer customer, long id) {
		customerDao.findById(id).ifPresent((x)->{
			customer.setId(id);
			customerDao.save(customer); 
		});		
	}

	@Override
	public void delete(long id) {
		customerDao.deleteById(id);
		
	}

}
