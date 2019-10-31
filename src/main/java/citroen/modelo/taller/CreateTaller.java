package citroen.modelo.taller;

import javax.persistence.EntityManager;

import citroen.negocio.CategoriaBean;
import citroen.negocio.TallerBean;
import citroen.util.ConnectionEntityManagerFactory;

public class CreateTaller {
	
public void create(TallerBean taller) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(taller);
		entityManager.getTransaction().commit();
		entityManager.close();
	

}
}
