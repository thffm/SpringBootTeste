package aplication;

import javax.persistence.EntityManager;

import dominio.Pessoa;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();
		
		
		System.out.println("Pronto");
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		System.out.println(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
