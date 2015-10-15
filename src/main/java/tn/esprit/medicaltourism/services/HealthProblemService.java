package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.HealthProblem;

/**
 * Session Bean implementation class HealthProblemService
 */
@Stateless
public class HealthProblemService implements HealthProblemServiceRemote {


	@PersistenceContext
	private EntityManager em;
	
	
	public void create(HealthProblem healthProblem) {
		em.persist(healthProblem);	
	}
	
	public HealthProblem find(Integer id) {
		return em.find(HealthProblem.class, id);

	}

	public void update(HealthProblem healthProblem) {
		em.merge(healthProblem);

	}
	
	public void delete(HealthProblem healthProblem) {
		em.remove(em.merge(healthProblem));		
	}

	public List<HealthProblem> findAll() {
		return em
				.createQuery("select h from HealthProblem h", HealthProblem.class)
				.getResultList();
	}

}
