package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;


/**
 * Session Bean implementation class ActivityService
 */
@Stateless
@LocalBean
public class ActivityService implements  ActivityServiceRemote{
	@PersistenceContext
	private EntityManager em ;
    /**
     * Default constructor. 
     */
    public ActivityService() {
        // TODO Auto-generated constructor stub
    }

	public Activity create(Activity activity) {
		
		try {
			em.persist(activity);
			System.out.println("activity insert with success");
		
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return  activity;
	}

		
	

	public void update(Activity activity) {
		
	
			try {
				em.merge(activity);
			
			} catch (Exception e) {
				System.err.println("ouups ...");
			}
			
	}
		
	

	public void delete(Integer id) {
		
		try {
			em.remove(em.find(Activity.class,id));
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		
	}
		
	

	public Activity find(Integer id) {
		return em.find(Activity.class, id);
		
	}

	public List<Activity> findAll() {
		
		
		return 	 em.createQuery(" select activities from Activity activities",Activity.class).getResultList();
	}

	public Activity findByName(String name) {
		Activity activity =null;
		
		
		
		
		try {
			Query query = em
					.createQuery("select u from Activity u where u.name =:name");
			query.setParameter("name", name);

			activity = (Activity) query.getSingleResult();
		} catch (Exception e) {
			e.getMessage();
			
		}

		
		if (activity==null)
			System.out.println("erreur");
			else
				System.out.println("done");
		return activity;
		
	}

	public void delete(Activity activity) {
		em.remove(em.merge(activity));
		
	}

	
	public List<Activity> findByhotel(Hotel hotel) {
		
		return em
				.createQuery("select e from Activity e where e.hotel=:x", Activity.class)
				.setParameter("x", hotel)
				.getResultList() ;	
	}

		
	}
    


