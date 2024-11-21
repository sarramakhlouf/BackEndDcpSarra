package com.dcp.employes.entities;

import java.util.Date; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String emailEmploye;
	private String FullNameEmploye;
	private Date dateNaissanceEmploye;
	private int NumTelEmploye;
	
	public Employe() {
		super();
	}

	public Employe(String emailEmploye, String fullNameEmploye, Date dateNaissanceEmploye, int numTelEmploye) {
		super();
		this.emailEmploye = emailEmploye;
		FullNameEmploye = fullNameEmploye;
		this.dateNaissanceEmploye = dateNaissanceEmploye;
		NumTelEmploye = numTelEmploye;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getEmailEmploye() {
		return emailEmploye;
	}

	public void setEmailEmploye(String emailEmploye) {
		this.emailEmploye = emailEmploye;
	}

	public String getFullNameEmploye() {
		return FullNameEmploye;
	}

	public void setFullNameEmploye(String fullNameEmploye) {
		FullNameEmploye = fullNameEmploye;
	}

	public Date getDateNaissanceEmploye() {
		return dateNaissanceEmploye;
	}

	public void setDateNaissanceEmploye(Date dateNaissanceEmploye) {
		this.dateNaissanceEmploye = dateNaissanceEmploye;
	}

	public int getNumTelEmploye() {
		return NumTelEmploye;
	}

	public void setNumTelEmploye(int numTelEmploye) {
		NumTelEmploye = numTelEmploye;
	}

	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", emailEmploye=" + emailEmploye + ", FullNameEmploye="
				+ FullNameEmploye + ", dateNaissanceEmploye=" + dateNaissanceEmploye + ", NumTelEmploye="
				+ NumTelEmploye + "]";
	} 
}
