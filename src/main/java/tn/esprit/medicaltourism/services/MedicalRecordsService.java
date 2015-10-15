package tn.esprit.medicaltourism.services;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.medicaltourism.domain.Allergyinformation;
import tn.esprit.medicaltourism.domain.HealthProblem;
import tn.esprit.medicaltourism.domain.MedicalRecords;
import tn.esprit.medicaltourism.domain.Medication;



/**
 * Session Bean implementation class MedicalRecordsService
 */
@Stateless
public class MedicalRecordsService implements MedicalRecordsServiceRemote {

	@PersistenceContext
	private EntityManager em;
	
	public void create(MedicalRecords medicalRecords) {
		em.persist(medicalRecords);
	}

	public MedicalRecords find(Integer id) {
		return em.find(MedicalRecords.class, id);
	}

	public void update(MedicalRecords medicalRecords) {
		em.merge(medicalRecords);
	}

	public void delete(MedicalRecords medicalRecords) {
		em.remove(em.merge(medicalRecords));
	}

	public void delete(Integer id) {
		em.remove(em.find(MedicalRecords.class, id));
	}

	public List<MedicalRecords> findAll() {

		
		return em
				.createQuery("select m from MedicalRecords m", MedicalRecords.class)
				.getResultList();
	}
	public List<Allergyinformation> findAllByMr(int id){
		String jpql = "select c from Allergyinformation c where c.medicalrecordAI="+id;
		Query query = em.createQuery(jpql);
		return query.getResultList();
		
		
	}
	public List<HealthProblem> findHpByMr(int id){
		String jpql = "select c from HealthProblem c where c.HP="+id;
		Query query = em.createQuery(jpql);
		return query.getResultList();
		
		
	}
	public List<Medication> findMedByMr(int id){
		String jpql = "select c from Medication c where c.med="+id;
		Query query = em.createQuery(jpql);
		return query.getResultList();
		
	}


	

}