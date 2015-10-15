package tn.esprit.medicaltourism.services;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Consultant;

/**
 * Session Bean implementation class ConsultantService
 */
@Stateless
public class ConsultantService implements ConsultantServiceRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager em;

	public ConsultantService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createConsultant(Consultant consultant) {
		em.persist(consultant);

	}

	@Override
	public List<Consultant> findAllConsultants() {
		return em.createQuery("select p from Consultant p", Consultant.class)
				.getResultList();
	}

	@Override
	public Consultant findConsultant(Integer id) {
		return em.find(Consultant.class, id);
	}

	@Override
	public void deleteConsultant(Consultant consultant) {
		em.remove(em.find(Consultant.class, consultant.getId()));

	}

	@Override
	public void updateConsultant(Consultant consultant) {
		em.merge(consultant);

	}

}
