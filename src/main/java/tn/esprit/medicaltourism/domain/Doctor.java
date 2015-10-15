package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity
@Table (name="t_doctor")
@DiscriminatorValue(value = "doctor")
public class Doctor extends User implements Serializable {

	private String speciality;
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	private static final long serialVersionUID = 1L;

	public Doctor() {
		super();
	}
	public Doctor(String lastName, String firstName, String speciality) {
		super(lastName, firstName);
		this.speciality = speciality;
	}


	public Doctor(String lastName, String firstName,String email, String speciality) {
		super(lastName, firstName,email);
		this.speciality = speciality;
	}
	
	
	
   
}
