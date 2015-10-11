package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.medicaltourism.domain.Hotel;

/**
 * Session Bean implementation class HotelService
 */
@Stateless
@LocalBean
public class HotelService  implements HotelServiceRemote{
	
	@PersistenceContext
	private EntityManager em ;

    /**
     * Default constructor. 
     */
    public HotelService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Hotel create(Hotel hotel) {
		em.persist(hotel);
		return hotel;
		
	}

	
	public void update(Hotel hotel) {
		em.merge(hotel);
		
	}
    
	public void delete(Hotel hotel) {
	em.remove(em.merge(hotel));

	}

	
	public void deleteById(Integer ID) {
		em.remove(em.find(Hotel.class,ID));		
	}
    
	public Hotel findById(Integer id){
		return em.find(Hotel.class, id);
		
	}


	public List<Hotel> findAll() {
	
				
		return 	 em.createQuery(" select hotels from Hotel hotels",Hotel.class).getResultList();
	}

	@Override
	public List<Hotel> findByStars(Integer star) {
	
			
			
			 	return em.createQuery("select u from Hotel u where u.star =:star",
					Hotel.class)
					.setParameter("star", star)
					.getResultList();
		}
	}

	
    
    
    
    
    
    
    
    


