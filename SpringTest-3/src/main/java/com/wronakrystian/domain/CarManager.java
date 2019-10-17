package com.wronakrystian.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarManager {
	private List<Car> cars;
	
	public CarManager() {
		cars = new ArrayList<Car>();
		Car audi = new Car("AUDI","A8");
		Car bmw = new Car("BMW","M3");
		Car opel = new Car("OPEL","Corsa C");
		Car mazda = new Car("MAZDA","CX-30");
		cars.add(opel);
		cars.add(mazda);
		cars.add(bmw);
		cars.add(audi);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public boolean addCar(Car car) {
		return cars.add(car);
	}
	
	
}
