package fr.eni.tpcine.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tpcine.bo.Genre;

@Repository
public interface GenreRepository extends  JpaRepository<Genre, Long>{

}
