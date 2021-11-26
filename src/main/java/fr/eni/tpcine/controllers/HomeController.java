package fr.eni.tpcine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.tpcine.fixture.FixtureAvecBDD;

@Controller
public class HomeController {
	
	/*private WebSecurityConfig securityConfig;
	
	public HomeController(WebSecurityConfig securityConfig) {
		super();
		this.securityConfig = securityConfig;
	}*/

	@GetMapping("/")
	public String index() {
		
		return "pages/index";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "/login";
	}
	
	@GetMapping("/fixture")
	public String fixture(FixtureAvecBDD fixture) {
		
		fixture.fixtureBro();		
		
		return "page/index";
	}
}
