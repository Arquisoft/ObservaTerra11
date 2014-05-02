package controllers;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JustLoadHibernate {

	public static void main(String[] args) {
		// Fuerza a que se cargen los par??metros de configuraci??n y 
		// se analizen todos los mapeos y si procede se crea la BDD
		
		EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("observaterra");
		
		emf.close();
		
		System.out.println("--> Si no hay excepciones todo va bien");
		System.out.println("\n\t (O no hay ninguna clase mapeada)");
	}

}
