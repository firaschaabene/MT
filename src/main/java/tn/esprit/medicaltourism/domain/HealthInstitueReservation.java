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
@Table(name="t_HealthInstitueReservation")

public class HealthInstitueReservation implements Serializable {

	
	private String StartDate;
	
	private String EndDdate;
	private User user;
	private HealthInstitute  healthInstitute ;
	
	private HealthInstitueReservationPk HealthInstitueReservationPk;
	private static final long serialVersionUID = 1L;

	public HealthInstitueReservation() {
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
	public HealthInstitueReservationPk getHealthInstitueReservationPk() {
		return this.HealthInstitueReservationPk;
	}

	public void setHealthInstitueReservationPk(HealthInstitueReservationPk healthInstitueReservation) {
		this.HealthInstitueReservationPk = healthInstitueReservation;
	}
	@ManyToOne
	@JoinColumn(name="id_user",referencedColumnName="id",insertable=false,updatable=false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
	@JoinColumn(name="id_hi",referencedColumnName="id",insertable=false,updatable=false)
	public HealthInstitute getHealthInstitute() {
		return healthInstitute;
	}
	public void setHealthInstitute(HealthInstitute clinic) {
		this.healthInstitute = clinic;
	}
	public HealthInstitueReservation(String startDate, String endDdate, User user,
			HealthInstitute healthInstitute) {
		StartDate = startDate;
		EndDdate = endDdate;
		this.user = user;
		this.healthInstitute = healthInstitute;
		
		this.HealthInstitueReservationPk= new HealthInstitueReservationPk(user.getId(),healthInstitute.getId());
	}

	
	
   
}
