package com.example.rentcar.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rentcar.entity.dao.ICarDao;
import com.example.rentcar.entity.models.Car;

@Service
public class CarServiceImpl implements ICarService {

	@Autowired
	private ICarDao carDao;
	
	@Override
	public Car get(long id) {
		return carDao.findById(id).get();
	}

	@Override
	public List<Car> getAll() {
		return (List<Car>) carDao.findAll();	
	}	
	
	@Override
	public void post(Car car) {
		carDao.save(car);
		
	}

	@Override
	public void put(long id, Car car ) {
		carDao.findById(id).ifPresent((x)->{
			car.setId(id);
			carDao.save(car); 
		});
		
	}

	@Override
	public void delete(long id) {
		carDao.deleteById(id);
	}

}
