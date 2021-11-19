package fr.eni.tpcine.bo;

public class Genre {
	
	private int id;
	private String libelle;

	public Genre() {
	}
	
	

	public Genre(int id, String libelle) {
		super();
		this.id = id;
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
	
	
	
	
}
