package fr.eni.tpcine.fixture;

import fr.eni.tpcine.bo.Genre;

public class FixtureSansDBB {
	
	public void fixture() {
		Genre genre = new Genre();
		genre.setLibelle("horreur");
		Genre genre1 = new Genre();
		genre.setLibelle("comedie");
		Genre genre2 = new Genre();
		genre.setLibelle("biopic");
		Genre genre3 = new Genre();
		genre.setLibelle("aventure");
		Genre genre4 = new Genre();
		genre.setLibelle("biopic");

	}

}
