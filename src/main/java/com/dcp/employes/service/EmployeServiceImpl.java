package com.dcp.employes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dcp.employes.entities.Employe;
import com.dcp.employes.repos.EmployeRepository;

public class EmployeServiceImpl implements EmployeService{
	
	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public Employe saveEmploye(Employe em) {
		return employeRepository.save(em);
	}
	@Override
	public Employe updateEmploye(Employe em) {
		return employeRepository.save(em);
	}
	@Override
	public void deleteEmploye(Employe em) {
		employeRepository.delete(em);
	}
	@Override
	public void deleteEmployeById (Long id) {
		employeRepository.deleteById(id);
	}
	@Override
	public Employe getEmploye (Long id) {
		return employeRepository.findById(id).get();
	}
	@Override
	public List<Employe> getAllEmployes(){
		return employeRepository.findAll();
	}
	@Override 
	public List<Employe> findByNomEmploye(String nom) { 
	   return employeRepository.findByNomEmploye(nom); 
	}  
	/*@Override 
	public List<Employe> findByNomEmployeContains(String FullName) { 
	   return employeRepository.findByNomEmployeContains(FullName); 
	} */ 
	@Override 
	public List<Employe> findByOrderByNomEmployeAsc() { 
	   return employeRepository.findByOrderByNomEmployeAsc(); 
	} 
	@Override 
	public List<Employe> trierEmployesNom() { 
	   return employeRepository.trierEmployesNom(); 
	} 
}
