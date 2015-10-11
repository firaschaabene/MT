package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Offer;

@Remote
public interface OfferServiceRemote {

	Offer create (Offer offer);
	void update (Offer  offer);
void delete(Integer id);

Offer find(Integer id);
 //List <Offer> findByName(String name);
List<Offer> findByName(String name);
List<Offer>findAll();

	
	
	
	

}
