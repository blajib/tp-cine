package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.fixture.BioPersonne;
import fr.eni.tpcine.fixture.FixtureSansDBB;
import fr.eni.tpcine.fixture.SynopsisFilm;

@Service
public class FilmService implements FilmServiceInterface {
	
	private static List<Film> films;
	
	private FixtureSansDBB generator;
	
	public FilmService(FixtureSansDBB generator, BioPersonne bios, SynopsisFilm synopsis) {
		this.generator = generator;
		FilmService.films = this.generator.fixture(bios, synopsis);
	}
	

	@Override
	public List<Film> getFilms() {
		return FilmService.films;
	}

}
