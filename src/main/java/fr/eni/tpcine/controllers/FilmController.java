package fr.eni.tpcine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String detail(@PathVariable Integer id, Model model) {	
		
		if(id == null) return "redirect:/listFilms";
		
		var film = this.service.find(id);
		
		if(film == null)  return "redirect:/listFilms";
		
		model.addAttribute("film", film);
		
		return "pages/detail";
	}
	
	@GetMapping("/listFilms")
	public String listFilms() {
		
		return "pages/list-films";
	}
}
