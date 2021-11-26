package fr.eni.tpcine.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.eni.tpcine.bo.Personne;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
	
	@Query("select p from Personne p where p.job = 2")
	public List<Personne> findAllDirectors();

}
