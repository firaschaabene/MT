package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Medication;



/**
 * Session Bean implementation class MedicationService
 */
@Stateless
public class MedicationService implements MedicationServiceRemote {


	@PersistenceContext
	private EntityManager em;
	
	public void create(Medication medication) {
		em.persist(medication);
	}

	public Medication find(Integer id) {
		return em.find(Medication.class, id);
	}

	public void update(Medication medication) {
		em.merge(medication);
	}

	public void delete(Medication medication) {
		em.remove(em.merge(medication));
	}

	public void delete(Integer id) {
		em.remove(em.find(Medication.class, id));
	}

	public List<Medication> findAll() {

		
		return em
				.createQuery("select m from Medication m", Medication.class)
				.getResultList();
	}



}
