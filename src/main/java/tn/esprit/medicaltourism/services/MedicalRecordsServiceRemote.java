package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Allergyinformation;
import tn.esprit.medicaltourism.domain.HealthProblem;
import tn.esprit.medicaltourism.domain.MedicalRecords;
import tn.esprit.medicaltourism.domain.Medication;



@Remote
public interface MedicalRecordsServiceRemote {
	void create(MedicalRecords medicalRecords );
	MedicalRecords find(Integer id);
	void update(MedicalRecords medicalRecords);
	void delete(MedicalRecords medicalRecords);
	List<MedicalRecords> findAll();
	public List<Allergyinformation> findAllByMr(int id);
	public List<HealthProblem> findHpByMr(int id);
	public List<Medication> findMedByMr(int id);

}
