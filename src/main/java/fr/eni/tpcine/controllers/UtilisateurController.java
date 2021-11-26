package fr.eni.tpcine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.tpcine.bo.Utilisateur;
import fr.eni.tpcine.services.UtilisateurServiceInterface;

@Controller
public class UtilisateurController {
	
	private UtilisateurServiceInterface utilisateurService;

	public UtilisateurController(UtilisateurServiceInterface utilisateurService) {
		super();
		utilisateurService = utilisateurService;
	}

	@GetMapping("/utilisateur/create")
	public String createUtilisateur(Model model) {
		
		model.addAttribute("utilisateur",new Utilisateur());
		
		return "/pages/utilisateur/add";
	}
	
	@PostMapping("/utilisateur/create")
	public String createUtilisateur(@ModelAttribute Utilisateur utilisateur) {
		
		utilisateurService.create(utilisateur);
		
		return "redirect:/listFilms";
	}

}
