package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	private String Name;
	private Integer star;
	private String address;
	private String description;
	private List<Reservation>reservations;
	private List<Offer>offer;
	private List<Activity>activities;
	
	private List<Note> evals;

	private static final long serialVersionUID = 1L;

	public Hotel() {
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
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
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
	
	
	public Hotel( String Name, String address) {
		
		this.Name = Name;
		this.address = address;
	}
	@OneToMany(mappedBy="hotels")
	public List<Note> getEvals() {
		return evals;
	}
	public void setEvals(List<Note> evals) {
		this.evals = evals;
	}
	public Hotel( String Name, String address, List<Note> evals) {
		
		this.Name = Name;
		this.address = address;
		this.evals = evals;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	public Hotel( String Name, Integer star, String address) {
	
		this.Name = Name;
		this.star = star;
		this.address = address;
	}
	
	public Hotel( String Name, Integer star, String address,String Description) {
		this.description=Description;
		this.Name = Name;
		this.star = star;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", Name=" + Name + ", star=" + star
				+ ", address=" + address + "]";
	}
	@OneToMany(mappedBy="hotels")
	public List<Offer> getOffer() {
		return offer;
	}
	public void setOffer(List<Offer> offer) {
		this.offer = offer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
   
}
