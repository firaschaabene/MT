package tn.esprit.medicaltourism.services;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Patient;

@Remote
public interface PatientServiceRemote {
	void createPatient(Patient patient);

	List<Patient> findAllPatient();

	Patient findPatient(Integer id);

	void deletePatient(Patient patient);

	void updatePatient(Patient patient);

}
