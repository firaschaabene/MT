package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Offer
 *
 */
@Entity
@Table(name="t_offer")

public class Offer implements Serializable {

	
	private Integer id;
	private String name;
	private Float percentagePromotion;
	private String StartDatePromotion;
	private String EndDatePromotion;
	private String description;
	private Hotel hotels;
	
	private static final long serialVersionUID = 1L;

	public Offer() {
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
	public Float getPercentagePromotion() {
		return this.percentagePromotion;
	}

	public void setPercentagePromotion(Float percentagePromotion) {
		this.percentagePromotion = percentagePromotion;
	}   
	public String getStartDatePromotion() {
		return this.StartDatePromotion;
	}

	public void setStartDatePromotion(String StartDatePromotion) {
		this.StartDatePromotion = StartDatePromotion;
	}   
	public String getEndDatePromotion() {
		return this.EndDatePromotion;
	}

	public void setEndDatePromotion(String EndDatePromotion) {
		this.EndDatePromotion = EndDatePromotion;
	}   
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}

	
	public Offer(String description) {
		this.description = description;
	}
	@ManyToOne
	@JoinColumn(name="hotel_fk")
	public Hotel getHotels() {
		return hotels;
	}
	public void setHotels(Hotel hotels) {
		this.hotels = hotels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Offer( String name, Float percentagePromotion,
			String startDatePromotion, String endDatePromotion, String description,
			Hotel hotels) {
	
		this.name = name;
		this.percentagePromotion = percentagePromotion;
		StartDatePromotion = startDatePromotion;
		EndDatePromotion = endDatePromotion;
		this.description = description;
		this.hotels = hotels;
	}
	public Offer(String name, Float percentagePromotion, String description) {
		this.name = name;
		this.percentagePromotion = percentagePromotion;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Offer [name=" + name + ", percentagePromotion="
				+ percentagePromotion + ", description=" + description + "]";
	}

	
	
   
}
