package fr.eni.tpcine.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.fixture.FixtureSansDBB;

@Controller
public class TestController {
	
	@GetMapping("/getFilmstest")
	public String getFilms(FixtureSansDBB fix) {
		ArrayList<Film> films = fix.fixture();	
		
		return "pages/index" ;
	}

}
