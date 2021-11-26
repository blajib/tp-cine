package fr.eni.tpcine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.services.PersonneServiceInterface;

@Controller
public class DirectorController {
	
	private PersonneServiceInterface personneService;
	
	public DirectorController(PersonneServiceInterface personneService) {
		this.personneService = personneService;
	}

	@ModelAttribute("realisateur")
	public Personne getRealisateur() {
	return new Personne();
	}

	@GetMapping("/director/ajouter")
	public String addDirector(@ModelAttribute  Personne realisateur) {
			
		return "pages/director/add";
	}
	
	@PostMapping("/director/ajouter")
	public String addDirector(Personne realisateur,BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("Errors");
			return "pages/add";
		}
		realisateur.setJob(2);
		personneService.create(realisateur);
		
		return "redirect:/film/ajouter";
	}



}
