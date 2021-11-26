package fr.eni.tpcine.services;

import java.util.List;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Personne;

public interface PersonneServiceInterface {
	public List<Personne> findAll();
	public Personne find(long id);
	public Personne update(Personne personne);
	public void create(Personne personne);
	public void remove(long id);
	public List<Personne> findAllDirectors();
	
}
