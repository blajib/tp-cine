package fr.eni.tpcine.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tpcine.bo.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{

}
