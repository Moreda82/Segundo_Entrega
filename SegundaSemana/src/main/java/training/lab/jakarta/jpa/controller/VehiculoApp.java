package training.lab.jakarta.jpa.controller;

import jakarta.persistence.*;
import training.lab.jakarta.jpa.model.Vehiculo;

public class VehiculoApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {
			emf = Persistence.createEntityManagerFactory("default");
			em = emf.createEntityManager();

			Vehiculo l1 = new Vehiculo("BMW", "218D",5000);
			Vehiculo l2 = new Vehiculo("Mercedes","CLK",6000);
			Vehiculo l3 = new Vehiculo("Peugeot","Casa",5000);

        //Insertar coches en la base de datos
			em.getTransaction().begin();
			em.persist(l1);
			em.persist(l2);
			em.persist(l3);
			em.getTransaction().commit();
			System.out.println("******Objeto incluido en la base de dato****");
			
		//Find
			Vehiculo selectedP = (Vehiculo) em.find(Id.class, 101);//aqui buscamos por el ID e imprime en consola		
			System.out.println("******Encontrar realizado****" + selectedP);
///			
		} catch (Exception ex) {
			System.out.println(ex.getMessage()); // capturamos la excepcion
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
		}
	}
}
