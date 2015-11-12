package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Service
 *
 */
@Entity
@Table(name="t_serviceHI")
public class Service_HI implements Serializable {

	private Integer id ;
	private String name ;
	private String description ;
	private Float price ;
	private List<Image> pictures;
	
	
	
	
	public Service_HI(String name, String description, Float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	
	}
	private static final long serialVersionUID = 1L;

	public Service_HI() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	@OneToMany(mappedBy = "service_hi", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Image> getPictures() {
		return pictures;
	}
	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}

   
}
