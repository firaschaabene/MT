package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Allergyinformation;

@Remote
public interface AllergyinformationServiceRemote {
	Boolean create(Allergyinformation allergyinformation );
	Allergyinformation find(Integer id);
	void update(Allergyinformation allergyinformation);
	void delete(Allergyinformation allergyinformation);
	List<Allergyinformation> findAll();

}
