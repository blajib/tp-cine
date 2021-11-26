package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.repositorys.FilmRepository;

@Primary
@Service
public class FilmServiceOrm implements  FilmServiceInterface {
	
	private FilmRepository repo;
	
	

	public FilmServiceOrm(FilmRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Film> findAll() {
		return repo.findAll();
	}


	@Override
	public void create(Film film) {
		repo.save(film);
		repo.flush();
		
	}

	@Override
	public Film find(long id) {
		return repo.getById(id);
	}

	@Override
	public void remove(long id) {
		Film film = repo.getById(id);
		repo.delete(film);
		repo.flush();
		
	}

	@Override
	public Film update(Film film) {
		repo.save(film);
		repo.flush();
		return null;
	}



}
