package fr.eni.tpcine.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.services.FilmServiceOrm;
import fr.eni.tpcine.services.GenreServiceInterface;
import fr.eni.tpcine.services.PersonneServiceInterface;

@Component
public class IdToFilmConverter implements Converter<String, Film> {
	
	private FilmServiceOrm filmService;

	@Autowired
	public IdToFilmConverter(FilmServiceOrm filmService) {
		this.filmService = filmService;
	}

	@Override
    public Film convert(String id) {
    	return this.filmService.find(Long.parseLong(id));
    }
}