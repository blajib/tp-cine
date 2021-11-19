package fr.eni.tpcine.services;

import java.util.List;

import fr.eni.tpcine.bo.Film;

public interface FilmServiceInterface {
	public List<Film> findAll();
	public Film find(int id);
}
