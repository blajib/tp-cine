package fr.eni.tpcine.bo;

import java.util.ArrayList;

public class Film {

	private int id;
	private String titre;
	private int annee;
	private String synopsis;
	private float duree;
	private ArrayList<Personne> listActeurs;
	private Personne realisateur;
	private Genre genre;
	
	public Film() {
	}

	public Film(int id, String titre, int annee, float duree, ArrayList<Personne> listActeurs, Personne realisateur,
			Genre genre) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.genre = genre;
	}
	
	public Film(int id, String titre, int annee, float duree, ArrayList<Personne> listActeurs,
			Personne realisateur, Genre genre, String synopsis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.synopsis = synopsis;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.genre = genre;
	}

	public Film(String titre, int annee, float duree, ArrayList<Personne> listActeurs, Personne realisateur,
			Genre genre) {
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.genre = genre;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public ArrayList<Personne> getListActeurs() {
		return listActeurs;
	}

	public void setListActeurs(ArrayList<Personne> listActeurs) {
		this.listActeurs = listActeurs;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}
	
	
	
	
	

}
