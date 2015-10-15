package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.User;


/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService implements UserServiceRemote {

	/**
	 * Default constructor.
	 */

	@PersistenceContext
	private EntityManager em;

	public UserService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(User user) {
		em.persist(user);

	}

	@Override
	public List<User> findAllUser() {

		return em.createQuery("select u from User u", User.class)
				.getResultList();

	}
	
	
	
	

}
