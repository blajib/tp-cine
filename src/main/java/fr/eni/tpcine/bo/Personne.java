package fr.eni.tpcine.bo;

public class Personne {
	
	private int id;
	private String nom;
	private String prenom;
	private String bio;
	
	public Personne() {
	}

	public Personne(int id, String nom, String prenom, String bio) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.bio = bio;
	}
	
	

	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, String bio) {
		this.nom = nom;
		this.prenom = prenom;
		this.bio = bio;
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
	
	
	
	

}
