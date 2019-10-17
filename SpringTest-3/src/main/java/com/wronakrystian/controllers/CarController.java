package com.wronakrystian.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wronakrystian.domain.Car;

@Controller
public class CarController {
	
	private List<Car> myCars = new ArrayList<Car>();
	
	public CarController() {
		// TODO Auto-generated constructor stub
		Car car1 = new Car("BMW", "M3");
		Car car2 = new Car("MAZDA", "CX-30");
		Car car3 = new Car("SKODA", "Kamiq");
		Car car4 = new Car("NISSAN", "QUASHQUAI");
		
		myCars.add(car1);
		myCars.add(car2);
		myCars.add(car3);
		myCars.add(car4);
		
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public String getCar(Model model) {
		System.out.println("get car");
		Car car = new Car("OPEL","Corsa C");
		model.addAttribute("car", car);
		return "car";
	}
	
	@RequestMapping(value = "/cars",method = RequestMethod.GET)
	public String getCars(Model model) {
		System.out.println("get cars");
		
		model.addAttribute("cars", myCars);
		model.addAttribute("newCar", new Car());
		
		return "cars";
	}
	@RequestMapping(value="/addCar",method = RequestMethod.POST)
	public String addCar(@ModelAttribute Car car) {
		System.out.println("add car ...");
		System.out.println(car);
		myCars.add(car);
		return "redirect:cars";
	}
	
}
