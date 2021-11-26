package fr.eni.tpcine.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.eni.tpcine.bo.Personne;

@Service
public class ApiService {
	
	public class DogApi{
		private String message;
		private String status;
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
		
	}
	
	
	public Personne getDirector(String nameFilm) {
			
		return null;
	}
	
	public int getIdFIlm() {
		
		 final String uri = "https://dog.ceo/api/breeds/image/random";
		 
		    RestTemplate restTemplate = new RestTemplate();
		    ResponseEntity<DogApi> response = restTemplate.getForEntity(uri, DogApi.class); //3
		return 0;
	}

}
