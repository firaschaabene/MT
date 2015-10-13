package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Offer;

/**
 * Session Bean implementation class OfferService
 */
@Stateless
@LocalBean
public class OfferService implements OfferServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em ;
    public OfferService() {
        // TODO Auto-generated constructor stub
    }

	public Offer create(Offer offer) {
	
		try {
			em.persist(offer);
			System.out.println("offer insert with success");
		
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return  offer;
	}

	public void update(Offer offer) {

		try {
			em.merge(offer);
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
	
	}

	public void delete(Integer id) {

		try {
			em.remove(em.find(Offer.class,id));
		
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
	
	}

	public Offer find(Integer id) {
		return em.find(Offer.class, id);
	}

	@Override
	public List <Offer >findByName(String name) {
	return em.createQuery("select u from Offer u where u.name =:name",
			Offer.class)
			.setParameter("name", name)
			.getResultList();
}
	
	
//	public Offer findByName(String name) {
//		Offer offer =null;
//		
//		
//		
//		
//		try {
//			Query query = em
//					.createQuery("select u from Offer u where u.name =:name");
//			query.setParameter("name", name);
//
//			offer = (Offer) query.getSingleResult();
//		} catch (Exception e) {
//			e.getMessage();
//			
//		}
//
//		
//		if (offer==null)
//			System.out.println("erreur");
//			else
//				System.out.println("done");
//		return offer;
//		
//	}
//
//	
//    
//
//		
//	

	public List<Offer> findAll() {
		return 	 em.createQuery(" select offers from Offer offers",Offer.class).getResultList();
	}

}
