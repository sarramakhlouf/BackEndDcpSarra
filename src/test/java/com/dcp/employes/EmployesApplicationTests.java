package com.dcp.employes;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.dcp.employes.entities.Employe;
import com.dcp.employes.repos.EmployeRepository;

@SpringBootTest
class EmployesApplicationTests {
	@Autowired
	private EmployeRepository employeRepository;

	@Test
	public void testCreateEmploye() {
		Employe emp = new Employe("Sarramk@gmail.com","Sarra Makhlouf",new Date(),25478963);
		employeRepository.save(emp);
	}
	@Test
	public void testDeleteEmploye()
	{
		employeRepository.deleteById(1L);
	}
	@Test 
	public void testListerTousEmploye()
	{
		List<Employe> emps = employeRepository.findAll();
			for (Employe em: emps)
			{
				System.out.println(em);
			}
	}
	@Test 
	public void testFindByNomEmploye() {
		List<Employe> emps = employeRepository.findByNomEmploye("Manel Boulares");
			for (Employe em : emps) {
				System.out.println(em);
			}
	}
	@Test 
	public void testFindByNomEmployeContains() {
		List<Employe> emps = employeRepository.findByNomEmployeContains("Manel Boulares");
			for (Employe em : emps) {
				System.out.println(em);
			}
	}
	@Test
	public void testfindByOrderByNomEmployeAsc() {
		List<Employe> emps= employeRepository.findByOrderByNomEmployeAsc();
			for (Employe em : emps) {
				System.out.println(em);
			}
	}
	@Test
	public void testTrierEmployesNom(){
		List<Employe> emps = employeRepository.trierEmployesNom();
		for (Employe em: emps){
			System.out.println(em);
		}
	}	
}
