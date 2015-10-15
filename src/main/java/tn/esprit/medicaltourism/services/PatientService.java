package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Patient;

/**
 * Session Bean implementation class PatientService
 */
@Stateless
public class PatientService implements PatientServiceRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager em;

	public PatientService() {
		// TODO Auto-generated constructor stub
	}

	public void createPatient(Patient patient) {
		em.persist(patient);

	}

	@Override
	public List<Patient> findAllPatient() {
		return em.createQuery("select p from Patient p", Patient.class)
				.getResultList();
	}

	@Override
	public Patient findPatient(Integer id) {
		return em.find(Patient.class, id);
	}

	@Override
	public void deletePatient(Patient patient) {
		em.remove(em.find(Patient.class, patient.getId()));

	}

	@Override
	public void updatePatient(Patient patient) {
		em.merge(patient);

	}

}
