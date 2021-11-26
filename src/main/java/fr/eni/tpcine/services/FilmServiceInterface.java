package fr.eni.tpcine.services;

import java.util.List;

import fr.eni.tpcine.bo.Film;

public interface FilmServiceInterface {
	public List<Film> findAll();
	public void create(Film film);
	public Film find(long id);
	public void remove(long id);
	public Film update(Film film);
}
