package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: healthInstitute
 *
 */
@Entity
@Table(name="t_healthInstitute")

public class HealthInstitute implements Serializable {

	
	private Integer id;
	private String name;
	private String address;
	private Integer telephoneNumber;
	private List<Note> notes;
	private List<Comment> commentaires;
	private List<HealthInstitueReservation> healthInstitueReservations;
	private Image picture;
	private static final long serialVersionUID = 1L;

	
	public HealthInstitute(String name, String address,
			Integer telephoneNumber, String image) {
		super();
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		
	}

	

	public HealthInstitute() {
	
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
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public Integer getTelephoneNumber() {
		return this.telephoneNumber;
	}

	public void setTelephoneNumber(Integer telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	@OneToMany(mappedBy="healthInstitute")
	public List<HealthInstitueReservation> getHealthInstitueReservations() {
		return healthInstitueReservations;
	}
	public void setHealthInstitueReservations(List<HealthInstitueReservation> healthInstitueReservations) {
		this.healthInstitueReservations = healthInstitueReservations;
	}

	@OneToOne(mappedBy="healthInstitute")
	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}
	@OneToMany(mappedBy = "hi")
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	@OneToMany(mappedBy = "hi")
	public List<Comment> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Comment> commentaires) {
		this.commentaires = commentaires;
	}
	

}
