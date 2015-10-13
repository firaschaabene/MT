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
@Table(name="t_clinicReservation")

public class ClinicReservation implements Serializable {

	
	private String StartDate;
	
	private String EndDdate;
	private User client;
	private HealthInstitute  clinic ;
	
	private ClinicReservationPk ReservationPk;
	private static final long serialVersionUID = 1L;

	public ClinicReservation() {
		super();
	}   
	public String getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(String StartDate) {
		this.StartDate = StartDate;
	}   
	public String getEndDdate() {
		return this.EndDdate;
	}

	public void setEndDdate(String EndDdate) {
		this.EndDdate = EndDdate;
	}  
	@EmbeddedId
	public ClinicReservationPk getReservationPk() {
		return this.ReservationPk;
	}

	public void setReservationPk(ClinicReservationPk ReservationPk) {
		this.ReservationPk = ReservationPk;
	}
	@ManyToOne
	@JoinColumn(name="id_client",referencedColumnName="id",insertable=false,updatable=false)
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	
	@ManyToOne
	@JoinColumn(name="id_clinic",referencedColumnName="id",insertable=false,updatable=false)
	public HealthInstitute getClinic() {
		return clinic;
	}
	public void setClinic(HealthInstitute clinic) {
		this.clinic = clinic;
	}
	public ClinicReservation(String startDate, String endDdate, User client,
			HealthInstitute clinic) {
		StartDate = startDate;
		EndDdate = endDdate;
		this.client = client;
		this.clinic = clinic;
		
		this.ReservationPk= new ClinicReservationPk(client.getId(),clinic.getId());
	}

	
	
   
}
