package com.example.rentcar.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.rentcar.entity.models.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long>{

}
