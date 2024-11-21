package com.dcp.employes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEmploye", types = {Employe.class})
public interface EmployeProjection {
	public String getFullNameEmploye();

}
