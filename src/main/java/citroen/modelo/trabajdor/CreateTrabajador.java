package citroen.modelo.trabajdor;

import javax.persistence.EntityManager;

import citroen.negocio.CategoriaBean;
import citroen.negocio.TrabajadorBean;
import citroen.util.ConnectionEntityManagerFactory;

public class CreateTrabajador {

public void create(TrabajadorBean trabajador) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
