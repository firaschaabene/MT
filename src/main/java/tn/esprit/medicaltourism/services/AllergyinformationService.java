package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Allergyinformation;



@Stateless
public class AllergyinformationService implements AllergyinformationServiceRemote {

	@PersistenceContext
	private EntityManager em;
	
	
	public Boolean create(Allergyinformation allergyinformation) {
		Boolean b = false;
		try {
			em.persist(allergyinformation);
			b = true;
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return b;
	}
	
	public Allergyinformation find(Integer id) {
		return em.find(Allergyinformation.class, id);

	}

	public void update(Allergyinformation allergyinformation) {
		em.merge(allergyinformation);

	}
	
	public void delete(Allergyinformation allergyinformation) {
		em.remove(em.merge(allergyinformation));		
	}

	public List<Allergyinformation> findAll() {
		
		return em
				.createQuery("select a from Allergyinformation a", Allergyinformation.class)
				.getResultList();
	}
	
}
