package fr.eni.tpcine.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tpcine.bo.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
