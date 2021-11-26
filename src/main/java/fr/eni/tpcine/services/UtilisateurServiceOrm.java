package fr.eni.tpcine.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Utilisateur;
import fr.eni.tpcine.repositorys.UtilisateurRepository;

@Service
public class UtilisateurServiceOrm implements UtilisateurServiceInterface  {

	private UtilisateurRepository repo;
	
	
	
	public UtilisateurServiceOrm(UtilisateurRepository repo) {
		super();
		this.repo = repo;
	}

	
	public List<Utilisateur> findAll() {
		
		return repo.findAll();
	}

	
	public Utilisateur find(long id) {
		
		return repo.getById(id);
	}

	
	public Utilisateur update(Utilisateur utilisateur) {
		repo.save(utilisateur);
		repo.flush();
		return utilisateur;
	}

	
	public void create(Utilisateur utilisateur) {
		repo.save(utilisateur);
		repo.flush();
		
	}

	
	public void remove(long id) {
		Utilisateur user = repo.getById(id);
		repo.delete(user);
		repo.flush();
		
	}

	
	public List<Utilisateur> findAllDirectors() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
