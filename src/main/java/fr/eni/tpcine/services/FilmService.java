package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.fixture.BioPersonne;
import fr.eni.tpcine.fixture.SynopsisFilm;

@Service
public class FilmService implements FilmServiceInterface {
	
	private static List<Film> films;
	
	

	@Override
	public List<Film> findAll() {
		return FilmService.films;
	}


	@Override
	public Film find(long  id) {
		return FilmService.films.stream()
				  .filter(f-> id  == f.getId())
				  .findAny()
				  .orElse(null);	
	}


	@Override
	public void create(Film film) {
		FilmService.films.add(film);
	}



	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Film update(Film film) {
		// TODO Auto-generated method stub
		return null;
	}

}
