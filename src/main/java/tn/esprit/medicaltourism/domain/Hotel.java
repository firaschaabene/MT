package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Hotel
 *
 */
@Entity
@Table(name = "t_hotel")
public class Hotel implements Serializable {
	private Integer id;
	private String Name;
	private Integer star;
	private String address;
	private String description;

	private List<Offer> offer;
	private List<Activity> activities;
	private List<Image> pictures;
	private Provider provider;
	private List<Room> rooms;
	private List<Service_Hotel> services;
	private List<Note> notes;
	private List<Comment> commentaires;
	
	public Hotel(String name, Integer star, String address, String description) {
		
		this.Name = name;
		this.star = star;
		this.address = address;
		this.description = description;
	
	}

	private static final long serialVersionUID = 1L;

	public Hotel() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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



	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL})
	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Hotel(String Name, String address) {

		this.Name = Name;
		this.address = address;
	}

	public Hotel(String Name, String address, List<Note> notes) {

		this.Name = Name;
		this.address = address;
		this.notes = notes;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public Hotel(String Name, Integer star, String address) {

		this.Name = Name;
		this.star = star;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", Name=" + Name + ", star=" + star
				+ ", address=" + address + "]";
	}

	@OneToMany(mappedBy = "hotels", cascade = { CascadeType.ALL})
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


	

	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Service_Hotel> getServices() {
		return services;
	}

	public void setServices(List<Service_Hotel> services) {
		this.services = services;
	}

	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL})
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL})
	public List<Comment> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Comment> commentaires) {
		this.commentaires = commentaires;
	}
	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Image> getPictures() {
		return pictures;
	}

	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}
@ManyToOne
@JoinColumn(name="provider_Fk")
	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL})
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
