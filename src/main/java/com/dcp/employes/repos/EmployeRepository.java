package com.dcp.employes.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dcp.employes.entities.Employe;

@RepositoryRestResource(path = "rest")
public interface EmployeRepository extends JpaRepository<Employe, Long> {

    List<Employe> findByNomEmploye(String nom);
    List<Employe> findByOrderByNomEmployeAsc();
    List<Employe> findByNomEmployeContains(String fullName);

    @Query("SELECT e FROM Employe e ORDER BY e.nomEmploye ASC")
    List<Employe> trierEmployesNom();
}
