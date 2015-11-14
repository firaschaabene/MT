package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Room
 *
 */
@Entity
@Table(name="t_room")
public class Room implements Serializable {

	   
	
	private Integer id;
	private String type;
	private Integer max;
	private Boolean vacant;
	private Float pricePerNight;
	private Hotel hotel ;
	private String description ;
	private List<Image> pictures;
	private List<Reservation> reservations;
	
	private static final long serialVersionUID = 1L;

	public Room() {
		super();
	}   
	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public Integer getMax() {
		return this.max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}   
	public Boolean getVacant() {
		return this.vacant;
	}

	public void setVacant(Boolean vacant) {
		this.vacant = vacant;
	}   
	public Float getPricePerNight() {
		return this.pricePerNight;
	}

	public void setPricePerNight(Float pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Room(String type, Integer max, Boolean vacant, Float pricePerNight) {
		super();
		this.type = type;
		this.max = max;
		this.vacant = vacant;
		this.pricePerNight = pricePerNight;
	}
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "hotel_room_Fk")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Room(String type, Integer max, Boolean vacant, Float pricePerNight,
			Hotel hotel) {
		super();
		this.type = type;
		this.max = max;
		this.vacant = vacant;
		this.pricePerNight = pricePerNight;
		this.hotel = hotel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@OneToMany(mappedBy = "room", cascade = { CascadeType.ALL})
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	@OneToMany(mappedBy = "room", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Image> getPictures() {
		return pictures;
	}

	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}
}
