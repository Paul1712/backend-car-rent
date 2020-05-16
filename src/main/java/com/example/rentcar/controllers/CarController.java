package com.example.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentcar.entity.models.Car;
import com.example.rentcar.entity.services.ICarService;

@RestController
public class CarController {
	
	@Autowired
	ICarService carService;
	
	@GetMapping("/cars")
	public List<Car> getAllCars(){
		return carService.getAll();
	}
	
	@GetMapping("/car/{id}")
	public Car getOne(@PathVariable(value = "id") long id) {
		return carService.get(id);
	}
	
	@PostMapping("/car")
	public void add (Car car) {
		carService.post(car);
	}
	
	@PutMapping("/car/{id}")
	public String update (@PathVariable(value = "id") long id, Car car) {
		carService.put(id, car);
		return "ACTUALIZO";
	}
	
	@DeleteMapping("/car/{id}")
	public void delete (@PathVariable(value = "id") long id) {
		carService.delete(id);
	}

}
