package fr.eni.tpcine.fixture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.services.FilmServiceOrm;
import fr.eni.tpcine.services.GenreServiceOrm;
import fr.eni.tpcine.services.PersonneServiceOrm;

@Service
public class FixtureAvecBDD {
	
	private BioPersonne bio;
	private SynopsisFilm resume;
	private PersonneServiceOrm personneService;
	private FilmServiceOrm filmService;
	private GenreServiceOrm genreService;
	

	@Autowired
	public FixtureAvecBDD(BioPersonne bio, SynopsisFilm resume, PersonneServiceOrm personneService,
			FilmServiceOrm filmService, GenreServiceOrm genreService) {
		
		this.bio = bio;
		this.resume = resume;
		this.personneService = personneService;
		this.filmService = filmService;
		this.genreService = genreService;
	}

	public void fixtureBro() {
		
		List<Genre> genres = new ArrayList<Genre>();
		List<Personne> personnes = new ArrayList<Personne>();
		List<Film> films = new ArrayList<Film>();

		
		genres =  Arrays.asList(
				new Genre((long) 1,"horreur"),
				new Genre((long) 2,"comédie"),
				new Genre((long) 3,"biopic"),
				new Genre((long) 4,"aventure"),
				new Genre((long) 5,"fantastique"),
				new Genre((long) 6,"sf"),
				new Genre((long) 7,"dramatique")
				);
		
		for (Genre genre : genres) {
			genreService.create(genre);
		}
		
		/*personnes = Arrays.asList(
				new Personne(1,"Damon","Matt",bio.damon),
				 new Personne(2,"Dicaprio","Leo",bio.dicaprio),
				 new Personne(3,"Garell","Louis",bio.garel),
				 new Personne(4,"Cotillard","Marion",bio.cotillard),
				 new Personne(5,"Eva","Green",bio.green),
				 new Personne(6,"Seydoux","Lea",bio.seydoux),
				 new Personne(7,"Pitt","Brad",bio.pitt),
				 new Personne(8,"Perry","Luc",bio.perry)
				);*/
		
		for (Personne personne : personnes) {
			personneService.create(personne);
		}
		
		
	}
	

}
