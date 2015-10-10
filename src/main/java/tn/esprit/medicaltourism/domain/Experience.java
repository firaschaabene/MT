package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Experience
 *
 */
@Entity
@Table(name="t_experience")

public class Experience implements Serializable {

	private Patient patient;
	private Integer id;
	private Date date;
	private String rating;
	private static final long serialVersionUID = 1L;

	public Experience() {
		
	}   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}
   
	public void setId(Integer id) {
		this.id = id;
	}   
	
	
	@Lob
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@ManyToOne
	@JoinColumn(name="patient_fk")
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
   
}
