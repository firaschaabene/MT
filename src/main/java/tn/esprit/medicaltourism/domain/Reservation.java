package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import tn.esprit.medicaltourism.domain.ReservationPk;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity
@Table(name="t_reservation")

public class Reservation implements Serializable {

	
	private Date startDate;
	private Date endDdte;
	private ReservationPk ReservationPk;
	private User patient;
	private Hotel hotel;
	
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
	}   
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public Date getEndDdte() {
		return this.endDdte;
	}

	public void setEndDdte(Date endDdte) {
		this.endDdte = endDdte;
	}   
	@EmbeddedId
	public ReservationPk getReservationPk() {
		return this.ReservationPk;
	}

	public void setReservationPk(ReservationPk ReservationPk) {
		this.ReservationPk = ReservationPk;
	}
	@ManyToOne
	@JoinColumn(name="id_Patient",referencedColumnName="id",insertable=false,updatable=false)
	public User getPatient() {
		return patient;
	}
	public void setPatient(User patient) {
		this.patient = patient;
	}
	@ManyToOne
	@JoinColumn(name="id_Hotel",referencedColumnName="id",insertable=false,updatable=false)
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Reservation(Date startDate, Date endDdte, User patient, Hotel hotel) {
		super();
		this.startDate = startDate;
		this.endDdte = endDdte;
		this.patient = patient;
		this.hotel = hotel;
		this.ReservationPk=new ReservationPk(patient.getId(),hotel.getId());
	}
   
	
	
	
}
