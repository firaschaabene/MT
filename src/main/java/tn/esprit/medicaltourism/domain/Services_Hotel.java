package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Services
 *
 */
@Entity
@Table(name="t_services_hotel")

public class Services_Hotel implements Serializable {

	
	private Integer id;
	private String name;
	private String description;
	private Image picture;
	private Hotel hotel;
	@Override
	public String toString() {
		return "Services [name=" + name + ", description=" + description
				+ ", hotel=" + hotel + "]";
	}

	private static final long serialVersionUID = 1L;

	public Services_Hotel() {
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
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToOne(mappedBy="service_hotel", cascade = { CascadeType.PERSIST,
			CascadeType.REMOVE })
	public Image getPicture() {
		return this.picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}
	@ManyToOne
	@JoinColumn(name="hotel_fk")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
	
   
}
