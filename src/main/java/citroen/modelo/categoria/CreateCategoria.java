package citroen.modelo.categoria;

import javax.persistence.EntityManager;

import citroen.negocio.CategoriaBean;
import citroen.util.ConnectionEntityManagerFactory;


public class CreateCategoria {
public void create(CategoriaBean categoria) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}

}
