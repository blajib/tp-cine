package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.repositorys.GenreRepository;

@Primary
@Service
public class GenreServiceOrm implements GenreServiceInterface{
	
	private GenreRepository repo;	

	public GenreServiceOrm(GenreRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Genre> findAll() {
		return repo.findAll();
	}

	@Override
	public Genre find(long id) {
		
		return repo.getById(id);
	}

	@Override
	public void create(Genre genre) {
		repo.save(genre);
		repo.flush();
		
	}

	@Override
	public void remove(long id) {
		Genre genre = repo.getById(id);
		repo.delete(genre);
		repo.flush();
	}

	@Override
	public Genre update(Genre genre) {
		repo.save(genre);
		repo.flush();
		return genre;
	}

}
