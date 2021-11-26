package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.repositorys.PersonneRepository;

@Primary
@Service
public class PersonneServiceOrm implements PersonneServiceInterface{
	
	private PersonneRepository repo;
	
	

	public PersonneServiceOrm(PersonneRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Personne> findAll() {

		return repo.findAll();
	}

	@Override
	public Personne find(long id) {
		
		return repo.getById(id);
	}

	@Override
	public Personne update(Personne personne) {
		repo.save(personne);
		repo.flush();
		
		return null;
	}

	@Override
	public void create(Personne personne) {
		repo.save(personne);
		repo.flush();

		
	}

	@Override
	public void remove(long id) {
		Personne personne = repo.getById(id);
		repo.delete(personne);;
		repo.flush();
		
	}
	@Override
	public List<Personne> findAllDirectors() {
		
		return repo.findAllDirectors();
	}

}
