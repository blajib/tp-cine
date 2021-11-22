package fr.eni.tpcine.bo;

import java.util.ArrayList;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;


public class Film {

	private int id;
	
	@NotBlank(message = "Vous devez renseigner un titre à ce flim.")
	@Length(min=2,max=25, message="Le titre doit comporter entre 2 et 25 caractères.")
	private String titre;
	@Range(min=1895, max=2022, message="L'année de sortie du flim doit se trouver entre 1895 et 2022")
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
		this.setId(id);
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.setGenre(genre);
	}
	
	public Film(int id, String titre, int annee, float duree, ArrayList<Personne> listActeurs,
			Personne realisateur, Genre genre, String synopsis) {
		super();
		this.setId(id);
		this.titre = titre;
		this.annee = annee;
		this.setSynopsis(synopsis);
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.setGenre(genre);
	}

	public Film(String titre, int annee, float duree, ArrayList<Personne> listActeurs, Personne realisateur,
			Genre genre) {
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.setGenre(genre);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	
	

}
