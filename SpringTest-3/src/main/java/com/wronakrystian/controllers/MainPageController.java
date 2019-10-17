package com.wronakrystian.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wronakrystian.domain.Role;
import com.wronakrystian.domain.User;

@Controller
public class MainPageController {
	
	private List<User> users = new ArrayList<User>();
	
	public MainPageController() {
		// TODO Auto-generated constructor stub
		users.add(new User("Karolina", "Stopka", "kryniu77@wp.pl", "1234"));
		users.add(new User("Ewa", "Wrona", "ania90@wp.pl", "1234"));
		users.add(new User("Ania", "Skuza", "ewa100@wp.pl", "1234"));
		users.add(new User("Małgosia", "Aniserowicz", "andrzej@o2.pl", "1234"));
		users.add(new User("Rafał", "Nowak", "moniksewiolo@gmail.com", "1234"));
	}
	

	@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
	public String showMainPage(Model model) {
				
		
		User u = new User("Krystian", "Wrona", "kryniu77@wp.pl", "password");
		model.addAttribute("name", u.getName());
		model.addAttribute("lastName", u.getLastName());
		model.addAttribute("user", u);
		//Passing all collection
		model.addAttribute("users", users);
		return "index";
	}
	

}
