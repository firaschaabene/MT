package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Image;

/**
 * Session Bean implementation class ImageService
 */
@Stateless
@LocalBean
public class ImageService implements ImageServiceRemote {
	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ImageService() {
	}

	public Image create(Image image) {
		em.persist(image);
		return image;
	}

	public void update(Image image) {
		em.merge(image);
	}

	public void delete(Integer id) {
		em.remove(em.find(Image.class, id));

	}

	public void delete(Image image) {
		em.remove(em.merge(image));
	}

	public Image find(Integer id) {
		return em.find(Image.class, id);
	}

	public Image findByUrl(String url) {
		Image image = null;
		try {
			Query query = em
					.createQuery("select u from Image u where u.url =:url");
			query.setParameter("url", url);

			image = (Image) query.getSingleResult();
		} catch (Exception e) {
			e.getMessage();

		}

		if (image == null)
			System.out.println("erreur");
		else
			System.out.println("done");
		return image;
	}

	public List<Image> findAll() {
		return em.createQuery(" select e from Image e", Image.class)
				.getResultList();
	}

	@Override
	public Image findHotelImage(Hotel hotel) {
		
		Image image = null;
		try {
			Query query = em
					.createQuery("select e from Image e where e.hotel=:x");
			query.setParameter("x", hotel);

			image = (Image) query.getSingleResult();
		} catch (Exception e) {
			e.getMessage();

		}
		return image;
		
	}

}
