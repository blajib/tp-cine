package fr.eni.tpcine.bo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne {
	//public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	private String nom;
	@Basic
	private String prenom;
	@Basic
	private String bio;
	@Basic
	private int job;
	
	
	public Personne() {
	}
	
	
	public Personne(Long id, String nom, String prenom, String bio, int job) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.bio = bio;
		this.job = job;
	}


	public Personne(String nom, String prenom, String bio, int job) {
		this.nom = nom;
		this.prenom = prenom;
		this.bio = bio;
		this.job = job;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}
	
	
	
	
	
	
	
	

}
