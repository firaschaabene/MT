package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Pack;

@LocalBean
@Stateless
public class PackService implements PackServiceRemote {
	@PersistenceContext
	private EntityManager em ;
    /**
     * Default constructor. 
     */
    public PackService() {
        // TODO Auto-generated constructor stub
    }
	public Pack create(Pack pack) {
		
		try {
			em.persist(pack);
			System.out.println("pack insert with success");
		
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return  pack;
	}

		
	

	public void update(Pack pack) {
		
	
			try {
				em.merge(pack);
			
			} catch (Exception e) {
				System.err.println("ouups ...");
			}
			
	}
		
	

	public void delete(Integer id) {
		
		try {
			em.remove(em.find(Pack.class,id));
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		
	}
		
	

	public Pack find(Integer id) {
		return em.find(Pack.class, id);
		
	}

	public List<Pack> findAll() {
		
		
		return 	 em.createQuery(" select packs from Pack packs",Pack.class).getResultList();
	}

	public Pack findByName(String name) {
		Pack pack =null;
		
		
		
		
		try {
			Query query = em
					.createQuery("select u from Pack u where u.name =:name");
			query.setParameter("name", name);

			pack = (Pack) query.getSingleResult();
		} catch (Exception e) {
			e.getMessage();
			
		}

		
		if (pack==null)
			System.out.println("erreur");
			else
				System.out.println("done");
		return pack;
		
	}

	public void delete(Pack pack) {
		em.remove(em.merge(pack));
		
	}

		
	}
    

    


