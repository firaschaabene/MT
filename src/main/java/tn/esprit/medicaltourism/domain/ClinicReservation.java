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
	private healthInstitute  clinic ;
	
	private ReservationClinicPk ReservationPk;
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
	public ReservationClinicPk getReservationPk() {
		return this.ReservationPk;
	}

	public void setReservationPk(ReservationClinicPk ReservationPk) {
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
	public healthInstitute getClinic() {
		return clinic;
	}
	public void setClinic(healthInstitute clinic) {
		this.clinic = clinic;
	}
	public ClinicReservation(String startDate, String endDdate, User client,
			healthInstitute clinic) {
		StartDate = startDate;
		EndDdate = endDdate;
		this.client = client;
		this.clinic = clinic;
		
		this.ReservationPk= new ReservationClinicPk(client.getId(),clinic.getId());
	}

	
	
   
}
