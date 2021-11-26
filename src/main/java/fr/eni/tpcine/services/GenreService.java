package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;

@Service
public class GenreService implements GenreServiceInterface {
	
	private static List<Genre> genres;

	

	@Override
	public List<Genre> findAll() {
		return GenreService.genres;
	}


	@Override
	public Genre find(long  id) {
		return GenreService.genres.stream()
				  .filter(g-> id  == g.getId())
				  .findAny()
				  .orElse(null);	
	}


	@Override
	public void create(Genre genre){
		System.err.println("NOT IMPLEMENTED");
	}


	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Genre update(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}