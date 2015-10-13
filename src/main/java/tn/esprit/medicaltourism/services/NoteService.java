package tn.esprit.medicaltourism.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Note;

/**
 * Session Bean implementation class NoteService
 */
@Stateless
@LocalBean
public class NoteService implements NoteServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em ;
    public NoteService() {
        // TODO Auto-generated constructor stub
    }
    


	public Boolean create(Note notes) {
		Boolean b = false;
		try {
			em.persist(notes);
			System.out.println("note insert with success");
			b = true;
			
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return  b;
	}

		
    

}
