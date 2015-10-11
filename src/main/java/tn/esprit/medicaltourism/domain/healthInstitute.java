package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: healthInstitute
 *
 */
@Entity
@Table(name="t_healthInstitute")

public class healthInstitute implements Serializable {

	
	private Integer id;
	private String name;
	private String address;
	private Integer telephoneNumber;
	private String image ;
	public healthInstitute(String name, String address,
			Integer telephoneNumber, String image) {
		super();
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.image = image;
	}
	//private List<ClinicReservation>clincReservation;
	private static final long serialVersionUID = 1L;
	private List<ClinicReservation>clinicReservations;

	public healthInstitute() {
	
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
	@OneToMany(mappedBy="clinic")
	public List<ClinicReservation> getClinicReservations() {
		return clinicReservations;
	}
	public void setClinicReservations(List<ClinicReservation> clinicReservations) {
		this.clinicReservations = clinicReservations;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
