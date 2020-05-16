package com.example.rentcar.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.rentcar.entity.models.Car;

public interface ICarDao extends CrudRepository<Car, Long> {

}
