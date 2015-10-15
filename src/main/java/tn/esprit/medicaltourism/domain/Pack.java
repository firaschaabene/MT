package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Pack
 *
 */
@Entity
@Table(name="t_pack")
public class Pack implements Serializable {

	
	private Integer id;
	private String description;
	private String name;
	private Float price;
	private String startDate;
	private String endDate;
	private boolean state ;
	
	
	public Pack(Integer id, String description, String name, Float price,
			String startDate, String endDate, boolean state) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.state = state;
	}
	public Pack(Integer id, String description, String name, String startDate,
			String endDate) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}
	
	private static final long serialVersionUID = 1L;

	public Pack() {
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
	@Override
	public String toString() {
		return "Pack [id=" + id + ", description=" + description
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	public Pack(Integer id, String description, String startDate, String endDate) {
		super();
		this.id = id;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Pack(Integer id, String description, String name, Float price,
			String startDate, String endDate) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}

   
}
