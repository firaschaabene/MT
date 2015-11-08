package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Note
 *
 */
@Entity
@Table(name="t_comment")

public class Comment implements Serializable {

	
	private Integer id;
	private String contenu;
	private static final long serialVersionUID = 1L;
	private HealthInstitute hi;
	private Hotel hotel;

	@ManyToOne
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Comment() {
	
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   

	public Comment(Integer id, String contenu , Hotel hotel,HealthInstitute hi) {
		this.id = id;
		this.contenu = contenu;
		this.hotel = hotel;
		this.hi=hi;
	}
	@ManyToOne
	public HealthInstitute getHi() {
		return hi;
	}
	public void setHi(HealthInstitute hi) {
		this.hi = hi;
	}
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	
   
}
