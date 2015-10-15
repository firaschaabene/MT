package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MedicalRecords
 *
 */
@Entity
@Table(name = "t_medicalRecords")
public class MedicalRecords implements Serializable {

	private List<Allergyinformation> allergyinformations;
	private List<HealthProblem> healthProblems;
	private List<Medication> medicationLists;
	private Patient patient;
	private Integer id;
	private static final long serialVersionUID = 1L;

	public MedicalRecords() {

	}
	

	public MedicalRecords(List<Allergyinformation> allergyinformations,
			List<HealthProblem> healthProblems,
			List<Medication> medicationLists, Patient patient) {
		super();
		this.allergyinformations = allergyinformations;
		this.healthProblems = healthProblems;
		this.medicationLists = medicationLists;
		this.patient = patient;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne(mappedBy = "medical")
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@OneToMany(mappedBy = "medicalrecordAI")
	public List<Allergyinformation> getAllergyinformations() {
		return allergyinformations;
	}

	public void setAllergyinformations(
			List<Allergyinformation> allergyinformations) {
		this.allergyinformations = allergyinformations;
	}

	@OneToMany(mappedBy = "med")
	public List<Medication> getMedicationLists() {
		return medicationLists;
	}

	public void setMedicationLists(List<Medication> medicationLists) {
		this.medicationLists = medicationLists;
	}

	@OneToMany(mappedBy = "HP")
	public List<HealthProblem> getHealthProblems() {
		return healthProblems;
	}

	public void setHealthProblems(List<HealthProblem> healthProblems) {
		this.healthProblems = healthProblems;
	}

}