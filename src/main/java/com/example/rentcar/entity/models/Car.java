package com.example.rentcar.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name = "car")
public class Car implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	private String license_plate;
	@NotEmpty
	private String brand;
	@NotEmpty
	private String model;
	@NotEmpty
	private String color;
	@NotNull
	private int year;
	
	private boolean availability;
	
	//Getters & Setters 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	//Constructors
	public Car(long id, @NotEmpty String license_plate, @NotEmpty String brand, @NotEmpty String model,
			@NotEmpty String color, int year, boolean availability) {
		super();
		this.id = id;
		this.license_plate = license_plate;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
		this.availability = availability;
	}
	
	//Empty Constructor
	public Car() {
		super();
	}
	
}
