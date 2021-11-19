package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.fixture.FixtureSansDBB;

@Service
public class PersonneService implements PersonneServiceInterface {
	
	private static List<Personne> personnes;
	
	private FixtureSansDBB generator;
	
	public PersonneService(FixtureSansDBB generator) {
		this.generator = generator;
		PersonneService.personnes = this.generator.personneFixture();
	}
	
	@Override
	public List<Personne> findAll() {
		return PersonneService.personnes;
	}

	@Override
	public Personne find(int id) {
		return PersonneService.personnes.stream()
				  .filter(f-> id  == f.getId())
				  .findAny()
				  .orElse(null);	
	}
	

}
