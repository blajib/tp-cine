package fr.eni.tpcine.bo;

import javax.validation.constraints.NotNull;

public class Genre {
	
	private int id;
	
	private String libelle;

	public Genre() {
	}
	
	

	public Genre(int id, String libelle) {
		super();
		this.setId(id);
		this.libelle = libelle;
	}



	public Genre(String libelle) {
		this.libelle = libelle;
	}



	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
