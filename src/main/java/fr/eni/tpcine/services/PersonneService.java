package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Personne;

@Service
public class PersonneService implements PersonneServiceInterface {
	
	private static List<Personne> personnes;

	
	@Override
	public List<Personne> findAll() {
		return PersonneService.personnes;
	}

	@Override
	public Personne find(long id) {
		return PersonneService.personnes.stream()
				  .filter(f-> id  == f.getId())
				  .findAny()
				  .orElse(null);	
	}


	@Override
	public Personne update(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Personne personne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personne> findAllDirectors() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
