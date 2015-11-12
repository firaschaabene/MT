package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

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
	private String date;
	private String subject;
	private String story;
	private List<Image> pictures;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
	
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
	
	

	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@ManyToOne
	@JoinColumn(name="patient_fk")
	public Patient getPatient() {
		return patient;
	}
	
	@OneToMany(mappedBy = "experience", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Image> getPictures() {
		return pictures;
	}

	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}
	
	
	public Experience(String date, String subject, String story) {
		super();
		this.date = date;
		this.subject = subject;
		this.story = story;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
   
}
