package fr.eni.tpcine.services;

import java.util.List;

import fr.eni.tpcine.bo.Film;

public interface FilmServiceInterface {
	public List<Film> getAll();
	public Film get(int id);
}
