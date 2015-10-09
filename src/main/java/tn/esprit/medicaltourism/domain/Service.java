package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Service
 *
 */
@Entity
@Table(name="t_service")
public class Service implements Serializable {

	private Integer id ;
	private String name ;
	private String description ;
	private Float price ;
	private static final long serialVersionUID = 1L;

	public Service() {
		super();
	}
	@Id
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
		
   
}
