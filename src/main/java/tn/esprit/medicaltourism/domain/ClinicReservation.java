package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: ClinicReservation
 *
 */
@Entity
@Table(name="t_clinicreservation")

public class ClinicReservation implements Serializable {

	
	private Date StartDate;
	
	
	private Date EndDate;
	private ClinicReservationPk clincReservationPK;
	private User client;
	private healthInstitute clinic;
	private static final long serialVersionUID = 1L;

	public ClinicReservation() {
		super();
	}   
	public Date getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}   
	public Date getEndDate() {
		return this.EndDate;
	}

	public void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}   
	
	
	@ManyToOne
	@JoinColumn(name="id_patient",referencedColumnName="id",insertable=false,updatable=false)
	public User getPatient() {
		return client;
	}
	public void setPatient(User patient) {
		this.client = patient;
	}
	@ManyToOne
	@JoinColumn(name="id_clinic",referencedColumnName="id",insertable=false,updatable=false)
	public healthInstitute getClinic() {
		return clinic;
	}
	public void setClinic(healthInstitute clinic) {
		this.clinic = clinic;
	}
	
	@EmbeddedId
	public ClinicReservationPk getClincReservationPK() {
		return clincReservationPK;
	}
	
	
	public void setClincReservationPK(ClinicReservationPk clincReservationPK) {
		this.clincReservationPK = clincReservationPK;
	}
	public ClinicReservation(Date startDate, Date endDate, User patientss,
			healthInstitute clinic) {
		StartDate = startDate;
		EndDate = endDate;
		this.client = patientss;
		this.clinic = clinic;
		this.clincReservationPK=new ClinicReservationPk(patientss.getId(),clinic.getId());
	}
	
	
	
   
}
