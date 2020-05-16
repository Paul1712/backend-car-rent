package com.example.rentcar.entity.services;

import java.util.List;

import com.example.rentcar.entity.models.Car;


public interface ICarService {
	public Car get(long id);
	public List<Car> getAll();
	public void post(Car car);
	public void put(long id, Car car);
	public void delete(long id);

}
