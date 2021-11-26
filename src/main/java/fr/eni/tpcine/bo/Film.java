package fr.eni.tpcine.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
public class Film {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Vous devez renseigner un titre � ce flim.")
	@Length(min=2,max=25, message="Le titre doit comporter entre 2 et 25 caract�res.")
	@Basic
	private String titre;
	
	@Range(min=1895, max=2022, message="L'ann�e de sortie du flim doit se trouver entre 1895 et 2022")
	@Basic
	private int annee;
	
	@Length(min=15,max=400, message="Le synopsis doit comporter entre 15 et 400 caract�res.")
	@Basic
	private String synopsis;
	
	@Range(min=2, max=400, message="La dur�e du film doit �tre entre 2 minutes et 400 minutes.")
	@Basic
	private float duree;
	
	@ManyToMany
	@JoinTable(name="filmPersonne",
							joinColumns = {@JoinColumn(name="filmId")},
							inverseJoinColumns = {@JoinColumn(name="personneId")}
			)
	private List<Personne> listActeurs;
	
	@ManyToOne
	@NotNull(message="Le film doit avoir un r�alisateur")
	private Personne realisateur;
	
	@ManyToOne
	private Genre genre;
	
	public Film() {
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

	public List<Personne> getListActeurs() {
		return listActeurs;
	}

	public void setListActeurs(List<Personne> listActeurs) {
		this.listActeurs = listActeurs;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
