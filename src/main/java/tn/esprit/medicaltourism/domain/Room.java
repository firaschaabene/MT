package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Room
 *
 */
@Entity

public class Room implements Serializable {

	   
	
	private Integer id;
	private String type;
	private Integer max;
	private Boolean vacant;
	private Float pricePerNight;
	private Hotel hotel ;
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
	
   
}
