package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Provider provider;
	private List<HealthInstitueReservation> healthInstitueReservations;
	private List<Image> pictures;
	private static final long serialVersionUID = 1L;

	

	

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
	@OneToMany(mappedBy="healthInstitute", cascade = { CascadeType.ALL})
	public List<HealthInstitueReservation> getHealthInstitueReservations() {
		return healthInstitueReservations;
	}
	public void setHealthInstitueReservations(List<HealthInstitueReservation> healthInstitueReservations) {
		this.healthInstitueReservations = healthInstitueReservations;
	}

	@OneToMany(mappedBy = "healthInstitute",cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Image> getPictures() {
		return pictures;
	}

	public void setPictures(List<Image> pictures) {
		this.pictures = pictures;
	}
	@OneToMany(mappedBy = "hi", cascade = { CascadeType.ALL})
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	@OneToMany(mappedBy = "hi", cascade = { CascadeType.ALL})
	public List<Comment> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Comment> commentaires) {
		this.commentaires = commentaires;
	}
	public HealthInstitute(Integer id, String name, String address,
			Integer telephoneNumber, List<Note> notes,
			List<Comment> commentaires, List<Image> pictures) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.notes = notes;
		this.commentaires = commentaires;
		this.pictures = pictures;
	}
	@ManyToOne
	@JoinColumn(name="provider_Fk")
		public Provider getProvider() {
			return provider;
		}

		public void setProvider(Provider provider) {
			this.provider = provider;
		}


}
