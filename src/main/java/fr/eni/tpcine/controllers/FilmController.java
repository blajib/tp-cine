package fr.eni.tpcine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.services.FilmServiceInterface;
import fr.eni.tpcine.services.PersonneServiceInterface;

@Controller
public class FilmController {
	
	private FilmServiceInterface filmService;
	private PersonneServiceInterface personneService;
	
	@Autowired
	private void setService(FilmServiceInterface service, PersonneServiceInterface personneService) {
		this.filmService = service;
		this.personneService = personneService;
	}
	
	@GetMapping("/film/{id}")
	public String detail(@PathVariable Integer id, Model model) {	
		
		if(id == null) return "redirect:/listFilms";
		
		var film = this.filmService.find(id);
		
		if(film == null)  return "redirect:/listFilms";
		
		model.addAttribute("film", film);
		
		return "pages/detail";
	}
	
	@GetMapping("/film/ajouter")
	public String add(Model model) {	
		model.addAttribute("film", new Film());
		model.addAttribute("personnes", this.personneService.findAll());
		return "pages/add";
	}
	
	@PostMapping("/film/ajouter")
	public String add(@ModelAttribute("film") Film film, BindingResult result) {	
		this.filmService.create(film);
		return "redirect:/";
	}
	
	@GetMapping("/listFilms")
	public String listFilms(Model model) {
		
		model.addAttribute("films",filmService.findAll());
		
		return "pages/list-films";
	}
	
	
}
