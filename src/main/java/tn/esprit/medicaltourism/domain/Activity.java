package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Activity
 *
 */
@Entity
@Table(name="t_activity")
public class Activity implements Serializable {


	private Integer id;
	private String name;
	private String description;
	private String startDate;
	private String endDate;
	private  Hotel hotel;
	private List<Image> pictures;
	
	public Activity(String name, String description, String startDate,
			String endDate, String image) {
		super();
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}
	
	

	public Activity(String name, String description, String startDate,
			String endDate, Hotel hotel) {
		super();
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hotel = hotel;
	}



	private static final long serialVersionUID = 1L;

	public Activity() {
		super();
	} 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}
	public Activity(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
	
	@ManyToOne
	@JoinColumn(name="t_activity")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public Activity(Integer id, String name, String description,
			String startDate, String endDate, Hotel hotel) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hotel = hotel;
	}


	@OneToMany(mappedBy = "activity", cascade = { CascadeType.ALL})
	public List<Image> getPictures() {
		return pictures;
	}

	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}
	

	
	
   
}
