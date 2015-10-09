package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Hotel
 *
 */
@Entity
@Table(name="t_hotel")

public class Hotel implements Serializable {
	private Integer id;
	private String location;
	private Integer star;
	private String address;
	private List<Reservation>reservations;
	private List<Offer>offer;
	private List<Activity>activities;
	
	private List<Note> evals;

	private static final long serialVersionUID = 1L;

	public Hotel() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@OneToMany(mappedBy="hotel")
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	@ManyToMany(mappedBy="hotels")
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	
	public Hotel(Integer id, String location, String address) {
		this.id = id;
		this.location = location;
		this.address = address;
	}
	@OneToMany(mappedBy="hotels")
	public List<Note> getEvals() {
		return evals;
	}
	public void setEvals(List<Note> evals) {
		this.evals = evals;
	}
	public Hotel(Integer id, String location, String address, List<Note> evals) {
		this.id = id;
		this.location = location;
		this.address = address;
		this.evals = evals;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	public Hotel(Integer id, String location, Integer star, String address) {
		this.id = id;
		this.location = location;
		this.star = star;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", location=" + location + ", star=" + star
				+ ", address=" + address + "]";
	}
	@OneToMany(mappedBy="hotels")
	public List<Offer> getOffer() {
		return offer;
	}
	public void setOffer(List<Offer> offer) {
		this.offer = offer;
	}
	
	
	
	
	
	
	
   
}
