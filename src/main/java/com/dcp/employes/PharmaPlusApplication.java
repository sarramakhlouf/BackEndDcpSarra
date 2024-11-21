package com.dcp.employes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.dcp.employes.entities.Employe;

@SpringBootApplication
public class PharmaPlusApplication implements CommandLineRunner {
   @Autowired
   private RepositoryRestConfiguration repositoryRestConfiguration;
   public static void main(String[] args) {
      SpringApplication.run(PharmaPlusApplication.class, args);
   }

   public void run(String... args) throws Exception {
      this.repositoryRestConfiguration.exposeIdsFor(Employe.class);
   }
}

