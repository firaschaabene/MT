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

	
	private static final long serialVersionUID = 1L;

	public Doctor() {
		super();
	}
   
}
