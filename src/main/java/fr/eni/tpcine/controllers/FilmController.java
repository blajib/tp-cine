package fr.eni.tpcine.controllers;

import java.util.List;

import javax.validation.Valid;

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
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.services.FilmServiceInterface;
import fr.eni.tpcine.services.GenreServiceInterface;
import fr.eni.tpcine.services.PersonneServiceInterface;

@Controller
public class FilmController {
	
	private FilmServiceInterface filmService;
	private PersonneServiceInterface personneService;
	private GenreServiceInterface genreService;
	
	@Autowired
	private void setService(
			FilmServiceInterface service, 
			PersonneServiceInterface personneService,
			GenreServiceInterface genreService) {
		this.filmService = service;
		this.personneService = personneService;
		this.genreService = genreService;
	}
	
	@GetMapping("/film/{id}")
	public String detail(@PathVariable long id, Model model) {	
		
		if(id == 0) return "redirect:/listFilms";
		
		var film = this.filmService.find(id);
		
		if(film == null)  return "redirect:/listFilms";
		
		model.addAttribute("film", film);
		
		return "pages/detail";
	}
	
	@GetMapping("/film/ajouter")
	public String add(Model model) {
		
		Film film = null;
		if(model.getAttribute("film") != null) {
			film = (Film) model.getAttribute("film");
		}
		else {
			film = new Film();
		}
			
		model.addAttribute("film", film);
		model.addAttribute("realisateurs", this.personneService.findAllDirectors());
		//List<Genre> genres = genreService.findAll();
		model.addAttribute("genres", this.genreService.findAll());
		return "pages/add";
	}
	
	@PostMapping("/film/ajouter")
	public String add(@Valid @ModelAttribute("film") Film film, BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			System.out.println("Errors");
			return "pages/add";
		}
		
		this.filmService.create(film);
		model.addAttribute("films",filmService.findAll());
		return "redirect:/listFilms";
	}
	
	@GetMapping("/listFilms")
	public String listFilms(Model model) {
		
		model.addAttribute("films",filmService.findAll());
		
		return "pages/list-films";
	}
	
	@PostMapping("/film/remove")
	public String remove(long id) {	
		filmService.remove(id);	
		return "redirect:/listFilms";
	}
	
	
	
}
