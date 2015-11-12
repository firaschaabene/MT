package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Services
 *
 */
@Entity
@Table(name="t_serviceHotel")

public class Service_Hotel implements Serializable {

	
	private Integer id;
	private String name;
	private String description;
	private List<Image> pictures;
	private Hotel hotel;
	@Override
	public String toString() {
		return "Services [name=" + name + ", description=" + description
				+ ", hotel=" + hotel + "]";
	}

	private static final long serialVersionUID = 1L;

	public Service_Hotel() {
	
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
	
	@OneToMany(mappedBy = "service_hotel", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Image> getPictures() {
		return pictures;
	}

	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}
	@ManyToOne
	@JoinColumn(name="hotel_fk")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Service_Hotel(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	
	
   
}
