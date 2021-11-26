package fr.eni.tpcine.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.FilmRest;
import fr.eni.tpcine.services.FilmServiceInterface;
import fr.eni.tpcine.services.GenreServiceInterface;
import fr.eni.tpcine.services.PersonneServiceInterface;

@RestController
@RequestMapping("rest")
public class RestFilmController {
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
	public ResponseEntity<FilmRest> detail(@PathVariable("id") Long id) {	
		
		
		Film film = this.filmService.find(id);
		FilmRest filmRest = null;
		
		if(film == null) {
			return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
		}else {
			 filmRest = new FilmRest(film.getId(),
					film.getTitre(),film.getAnnee(),film.getSynopsis()
					,film.getRealisateur().getNom(),film.getRealisateur().getId(),
					film.getGenre().getLibelle(),film.getGenre().getId());
		}
		
		return new ResponseEntity<FilmRest>(filmRest,HttpStatus.OK);
	}

	
	@PostMapping("/film/ajouter")
	public ResponseEntity<Film> add(Film film, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("Errors");
			return new ResponseEntity<Film>(HttpStatus.I_AM_A_TEAPOT);
		}
		this.filmService.create(film);
		
		return new ResponseEntity<Film>(HttpStatus.OK);
	}
	
	@GetMapping("/listFilms")
	public ResponseEntity<List<FilmRest>> listFilms() {
		List<Film> films = filmService.findAll();
		List<FilmRest> listFilmRest = new ArrayList<FilmRest>();		
		FilmRest filmRest = new FilmRest();
		for (Film film : films) {
			listFilmRest.add(new FilmRest(film.getId(),
					film.getTitre(),film.getAnnee(),film.getSynopsis()
					,film.getRealisateur().getNom(),film.getRealisateur().getId(),
					film.getGenre().getLibelle(),film.getGenre().getId()));
			
		}		
		return new ResponseEntity<>(listFilmRest,HttpStatus.OK);
	}
	
	@PostMapping("/film/remove")
	public ResponseEntity<Film> remove(@PathVariable("id") Long id) {	
		try {
			filmService.remove(id);	
		} catch (Exception e) {
			return new ResponseEntity<Film>(HttpStatus.I_AM_A_TEAPOT);
		}
		
		return new ResponseEntity<Film>(HttpStatus.OK);
	}

}
