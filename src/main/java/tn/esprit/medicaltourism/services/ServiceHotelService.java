package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Service_Hotel;

/**
 * Session Bean implementation class ServicesHotelService
 */
@Stateless
@LocalBean
public class ServiceHotelService implements ServiceHotelRemote{
	

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em ;
    public ServiceHotelService() {
		
	}

	@Override
	public void create(Service_Hotel service_hotel) {
		em.persist(service_hotel);
		
	}

	
	public void update(Service_Hotel service_hotel) {
		em.merge(service_hotel);
		
	}
    
	public void delete(Service_Hotel service_hotel) {
	em.remove(em.merge(service_hotel));

	}

	
	public void deleteById(Integer ID) {
		em.remove(em.find(Service_Hotel.class,ID));		
	}
    
	public Service_Hotel find(Integer id){
		return em.find(Service_Hotel.class, id);
		
	}


	public List<Service_Hotel> findAll() {
	
				
		return 	 em.createQuery(" select services from Services_Hotel services",Service_Hotel.class).getResultList();
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	public List<Service_Hotel> findByName(String name) {

		
	 	return em.createQuery("select u from Services_Hotel u where u.name =:name",
	 			Service_Hotel.class)
			.setParameter("name", name)
			.getResultList();
	}
	
	
	
	public List<Service_Hotel> findByhotel(Hotel hotel) {
		return em
				.createQuery("select e from Services_Hotel e where e.hotel=:x", Service_Hotel.class)
				.setParameter("x", hotel)
				.getResultList() ;	
	}

		
	
    
	

}


