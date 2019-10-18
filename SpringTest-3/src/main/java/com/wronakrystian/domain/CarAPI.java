package com.wronakrystian.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class CarAPI {
	
	@Autowired
	private CarManager carManager;
	
	@RequestMapping(value = "/getCars",method = RequestMethod.GET)
	public List<Car> getCars() {
		System.out.println("/getCars with object convert to json");
		return carManager.getCars();
	}
	@RequestMapping(value="/getCarsForView",method = RequestMethod.GET)
	public String getCars(Model model) {
		System.out.println("/getCars with view");
		model.addAttribute("cars", carManager.getCars());
		return "getCars";
	}
	@RequestMapping(value="/addCar2",method = RequestMethod.POST)
	public boolean addCar(@RequestBody Car car) {
		return carManager.addCar(car);
	}
	
	
}
