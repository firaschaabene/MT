package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.medicaltourism.domain.Doctor;

/**
 * Session Bean implementation class DoctorServiceRemote
 */
@Stateless
public class DoctorService implements DoctorServiceRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager em;

	public DoctorService() {
	}

	public void createDoctor(Doctor doctor) {
		em.persist(doctor);
	}

	public List<Doctor> findAllDoctors() {
		return em.createQuery("select d from Doctor d", Doctor.class)
				.getResultList();
	}

	public Doctor findDoctor(Integer id) {
		return em.find(Doctor.class, id);

	}

	public void updateDoctor(Doctor doctor) {

		em.merge(doctor);
	}

	public void deleteDoctor(Doctor doctor) {
		em.remove(em.find(Doctor.class, doctor.getId()));

	}

	@Override
	public List<Doctor> findDoctorBySpec(String speciality) {
		Doctor found = null;
		String jpql = "select d from Doctor d where d.speciality LIKE :x ";
		TypedQuery<Doctor> query = em.createQuery(jpql, Doctor.class);
		query.setParameter("x", speciality);

		
		return (List<Doctor>) query.getSingleResult();

	}

}
