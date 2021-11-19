package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.fixture.FixtureSansDBB;

@Service
public class GenreService implements GenreServiceInterface {
	
	private static List<Genre> genres;
	
	private FixtureSansDBB generator;
	
	public GenreService(FixtureSansDBB generator) {
		System.out.println("generate");
		this.generator = generator;
		GenreService.genres = this.generator.genreFixture();
	}
	

	@Override
	public List<Genre> findAll() {
		return GenreService.genres;
	}


	@Override
	public Genre find(int id) {
		return GenreService.genres.stream()
				  .filter(g-> id  == g.getId())
				  .findAny()
				  .orElse(null);	
	}


	@Override
	public void create(Genre genre){
		System.err.println("NOT IMPLEMENTED");
	}

}