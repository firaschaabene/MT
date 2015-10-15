package tn.esprit.medicaltourism.initDB;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Admin;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Pack;
import tn.esprit.medicaltourism.domain.Patient;
import tn.esprit.medicaltourism.domain.User;

/**
 * Session Bean implementation class Initdb
 */
@Stateless
public class Initdb implements InitdbRemote, InitdbLocal {

    /**
     * Default constructor. 
     */
    public Initdb() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext
	private EntityManager em;

	

	public User authentificate(String login, String password) {
		User found = null;
		String jpql = "select u from User u where u.nickName=:x and u.pwd=:y";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		query.setParameter("x", login);
		query.setParameter("y", password);
		try {System.out.println(found);
			found = query.getSingleResult();
			System.out.println(found);
		} catch (NoResultException e) {
			System.out.println("authentification attempt failed !");
			
		}

		return found;

	}


	public void create(User user) {
		em.persist(user);

	}


	@Override
	public void create(Hotel hotel) {
		em.persist(hotel);
		
	}


	@Override
	public Pack update(Pack pack) {
		
		return em.merge(pack);
	}


	@Override
	public void create(Pack pack) {
		em.persist(pack);
	}


	@Override
	public void create(Patient patient) {
		em.persist(patient);
		
	}


	@Override
	public void create(Activity activity) {
	em.persist(activity);
		
	}
	
	
	
	
	
	

}
