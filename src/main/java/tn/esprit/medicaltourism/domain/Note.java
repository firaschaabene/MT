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
@Table(name="t_note")

public class Note implements Serializable {

	
	private Integer id;
	private Integer note;
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
	public Note() {
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
	public Integer getNote() {
		return this.note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}
	public Note(Integer id, Integer note, Hotel hotel,HealthInstitute hi) {
		this.id = id;
		this.note = note;
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
	
	
   
}
