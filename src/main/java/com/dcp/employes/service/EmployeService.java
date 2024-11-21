package com.dcp.employes.service;

import java.util.List;
import com.dcp.employes.entities.Employe;

public interface EmployeService {
	Employe saveEmploye(Employe em); 
	Employe updateEmploye(Employe em); 
	void deleteEmploye(Employe em); 
	void deleteEmployeById(Long id); 
	List<Employe> findByNomEmploye(String FullName); 
	//List<Employe> findByNomEmployeContains(String FullName); 
	//List<Employe> findByNom(String FullName);  
	List<Employe> findByOrderByNomEmployeAsc(); 
	List<Employe> trierEmployesNom();
	List<Employe> getAllEmployes();
	Employe getEmploye(Long id);
}
