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

	
	private String startDate;
	private String endDate;
	private ReservationPk ReservationPk;
	private User patient;
	private Room  room;
	private Float totalPrice ;
	private int numberOfPeople;
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
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
	

	public Reservation(String startDate, String endDdte, User patient, Room room) {
		super();
		this.startDate = startDate;
		this.endDate = endDdte;
		this.patient = patient;
		this.room = room;
		this.ReservationPk=new ReservationPk(patient.getId(),room.getId());
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Reservation(String startDate, String endDdte, User patient,
			Room	room, Float totalPrice,int numberOfPeople) {
		super();
		this.startDate = startDate;
		this.endDate = endDdte;
		this.patient = patient;
		this.room = room;
		this.totalPrice = totalPrice;
		this.numberOfPeople=numberOfPeople;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	@ManyToOne
	@JoinColumn(name="id_Room",referencedColumnName="id",insertable=false,updatable=false)
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
   
	
	
	
}
