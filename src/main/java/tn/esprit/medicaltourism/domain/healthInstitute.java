package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
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
	//private List<ClinicReservation>clincReservation;
	private static final long serialVersionUID = 1L;
	private List<ClinicReservation>clinicReservations;

	public healthInstitute() {
	
	}   
	@Id    
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

}
