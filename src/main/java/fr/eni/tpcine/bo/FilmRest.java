package fr.eni.tpcine.bo;

public class FilmRest {
	private Long id;
	private String titre;
	private int anneeSortie;
	private String synopsis;
	private String realisateur;
	private Long idRealisateur;
	private String genre;
	private Long idGenre;
	
	public FilmRest(Long id, String titre, int anneeSortie, String synopsis, String realisateur, Long idRealisateur,
			String genre, Long idGenre) {
		super();
		this.id = id;
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.synopsis = synopsis;
		this.realisateur = realisateur;
		this.idRealisateur = idRealisateur;
		this.genre = genre;
		this.idGenre = idGenre;
	}
	public FilmRest() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public Long getIdRealisateur() {
		return idRealisateur;
	}
	public void setIdRealisateur(Long idRealisateur) {
		this.idRealisateur = idRealisateur;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Long getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}
	
	
	
	
	
	


}
