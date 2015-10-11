package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: MedicationList
 *
 */
@Entity
@Table(name="t_medicationList")
public class MedicationList implements Serializable {

	
	private Integer id;
	private String startDate;
	private String endDate;
//	private Medicalrecords medicalrecord;
//	private List<Medication> medications; 
	private static final long serialVersionUID = 1L;

	public MedicationList() {
		super();
	}  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
//	@ManyToOne
//	@JoinColumn(name = "medRec_medList_FK")
//	public Medicalrecords getMedicalrecord() {
//		return medicalrecord;
//	}
//	public void setMedicalrecord(Medicalrecords medicalrecord) {
//		this.medicalrecord = medicalrecord;
//	}
//	
//	@OneToMany(mappedBy = "medication")
//	public List<Medication> getMedications() {
//		return medications;
//	}
//	public void setMedications(List<Medication> medications) {
//		this.medications = medications;
//	}
   
}
