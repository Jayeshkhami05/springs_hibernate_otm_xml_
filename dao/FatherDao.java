package springs_hibernate_otm_xml_pesm7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import springs_hibernate_otm_xml_pesm7.dto.Father;

public class FatherDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rajath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveFather(Father father) {
		entityTransaction.begin();
		entityManager.persist(father);
		entityTransaction.commit();
	}

	public void updateFather(int id, Father father) {
		Father dbFather = entityManager.find(Father.class, id);
		if (dbFather != null) {
			father.setId(id);
			entityTransaction.begin();
			entityManager.merge(father);
			entityTransaction.commit();
		}
	}

}
