package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.bo.Utilisateur;

@Service
public interface UtilisateurServiceInterface   {
	public List<Utilisateur> findAll();
	public Utilisateur find(long id);
	public Utilisateur update(Utilisateur utilisateur);
	public void create(Utilisateur utilisateur);
	public void remove(long id);
	public List<Utilisateur> findAllDirectors();
	

}
