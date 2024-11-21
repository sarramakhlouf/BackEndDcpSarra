package com.dcp.employes.restcontrollers;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
import com.dcp.employes.entities.Employe;
import com.dcp.employes.service.EmployeService;

@RestController 
@RequestMapping("/api") 
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeRestController {
	@Autowired
	EmployeService employeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employe> getAllEmployes(){
		return employeService.getAllEmployes();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public Employe getEmployeById(@PathVariable("id") Long id) {  
		return employeService.getEmploye(id); 
	}
	@RequestMapping(value="/{id}",method = RequestMethod.POST) 
	public Employe createEmploye(@RequestBody Employe employe) { 
		return employeService.saveEmploye(employe); 
	} 
	@RequestMapping(method = RequestMethod.PUT) 
	public Employe updateEmploye(@RequestBody Employe employe) { 
		return employeService.updateEmploye(employe); 
	} 
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	public void deleteEmploye(@PathVariable("id") Long id) { 
		employeService.deleteEmployeById(id); 
	} 
}
