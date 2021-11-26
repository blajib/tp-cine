package fr.eni.tpcine.bo;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Genre {
	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String libelle;
	
	@OneToMany(mappedBy = "genre")
	private List<Film> films;

	public Genre() {
	}
	
	public Genre(Long id, String libelle) {
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



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Film> getFilms() {
		return films;
	}



	public void setFilms(List<Film> films) {
		this.films = films;
	}




	
	
	
	
}
