package tn.esprit.medicaltourism.services;


import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Medication;



@Remote
public interface MedicationServiceRemote {
	void create(Medication medication );
	Medication find(Integer id);
	void update(Medication medication);
	void delete(Medication medication);
	List<Medication> findAll();

}
