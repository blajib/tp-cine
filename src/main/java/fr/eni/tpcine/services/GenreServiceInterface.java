package fr.eni.tpcine.services;

import java.util.List;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;

public interface GenreServiceInterface {
	public List<Genre> findAll();
	public Genre find(long id);
	public void create(Genre genre);
	public void remove(long id);
	public Genre update(Genre genre);
}
