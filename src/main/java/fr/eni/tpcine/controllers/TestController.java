package fr.eni.tpcine.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Role;
import fr.eni.tpcine.repositorys.RoleRepository;
import fr.eni.tpcine.services.ApiService;

@Controller
public class TestController {
	
	@Autowired
	private RoleRepository roleRepo;
	
	public ApiService service;
	
	public TestController(ApiService service) {
		super();
		this.service = service;
	}



	@GetMapping("/test")
	public void test() {
		roleRepo.save(new Role("ADMIN"));
		roleRepo.save(new Role("ROLE_USER"));
		roleRepo.flush();
	}


}
