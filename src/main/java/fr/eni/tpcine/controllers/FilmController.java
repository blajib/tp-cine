package fr.eni.tpcine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.tpcine.services.FilmServiceInterface;

@Controller
public class FilmController {
	
	private FilmServiceInterface service;
	
	@Autowired
	private void setService(FilmServiceInterface service) {
		this.service = service;
	}
	
	@GetMapping("/film/{id}")
	public String detail(Integer id) {	
		System.out.println(this.service.getFilms());
		return "pages/detail";
	}
}