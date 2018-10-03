package net.guides.springboot2.springboot2webappjsp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.guides.springboot2.springboot2webappjsp.repositories.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping
	public String home(Model model) {
		model.addAttribute("users",userRepo.findAll());
		return "users";
	}
	
	@RequestMapping(params = "name")
	public String userByName(@RequestParam("name") String name, Model model) {
		model.addAttribute("users", userRepo.findUserByName(name));
		return "users";
	}
	
	@RequestMapping(params = "id")
	public String userById(@RequestParam("id") String id, Model model){
		model.addAttribute("users", userRepo.buscaPorId(Integer.parseInt(id)));
		return "users";
	}
}
