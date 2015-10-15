package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Services_Hotel;

/**
 * Session Bean implementation class ServicesHotelService
 */
@Stateless
@LocalBean
public class ServicesHotelService implements ServicesHotelRemote{
	

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em ;
    public ServicesHotelService() {
		
	}

	@Override
	public void create(Services_Hotel service_hotel) {
		em.persist(service_hotel);
		
	}

	
	public void update(Services_Hotel service_hotel) {
		em.merge(service_hotel);
		
	}
    
	public void delete(Services_Hotel service_hotel) {
	em.remove(em.merge(service_hotel));

	}

	
	public void deleteById(Integer ID) {
		em.remove(em.find(Services_Hotel.class,ID));		
	}
    
	public Services_Hotel find(Integer id){
		return em.find(Services_Hotel.class, id);
		
	}


	public List<Services_Hotel> findAll() {
	
				
		return 	 em.createQuery(" select services from Services_Hotel services",Services_Hotel.class).getResultList();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Services_Hotel> findByName(String name) {

		
	 	return em.createQuery("select u from Services_Hotel u where u.name =:name",
	 			Services_Hotel.class)
			.setParameter("name", name)
			.getResultList();
	}
	
	
	
	public List<Services_Hotel> findByhotel(Hotel hotel) {
		return em
				.createQuery("select e from Services_Hotel e where e.hotel=:x", Services_Hotel.class)
				.setParameter("x", hotel)
				.getResultList() ;	
	}

		
	
    
	

}


