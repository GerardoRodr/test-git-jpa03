package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

	public static void main(String[] args) {
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion02");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacci�n
		em.getTransaction().begin();
		// 4. proceso
		List<Usuario> lstUsuarios = em.createQuery("Select a From Usuario a", Usuario.class).getResultList();
		System.out.println("nro de usuarios: " + lstUsuarios.size());
		// 5. confirmar la transacci�n
		em.getTransaction().commit();
	}

}
