package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicalrecords
 *
 */
@Entity
@Table(name="t_medicalRecords")

public class MedicalRecords implements Serializable {

	private Patient patient;
	private Integer id;
	private static final long serialVersionUID = 1L;

	public MedicalRecords() {
	
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@OneToOne(mappedBy= "medical")
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
   
}
