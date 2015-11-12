package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Patient
 *
 */
@Entity
@Table(name="t_patient")

public class Patient  extends User implements Serializable {
    private MedicalRecords medical;
	private List<Experience>experience;
	
	public Patient(String lastName, String firstName) {
		super(lastName, firstName);
		// TODO Auto-generated constructor stub
	}
	

	private static final long serialVersionUID = 1L;

	public Patient() {
		
	}
	@OneToMany(mappedBy= "patient", cascade = { CascadeType.ALL})
	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}
	@OneToOne
	@JoinColumn(name= "id_medicalrec")
	public MedicalRecords getMedical() {
		return medical;
	}
	public void setMedical(MedicalRecords medical) {
		this.medical = medical;
	
	
}
}