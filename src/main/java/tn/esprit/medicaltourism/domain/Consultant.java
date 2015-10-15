package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Consultant
 *
 */
@Entity
@Table (name="t_consultant")
@DiscriminatorValue(value = "consultant")
public class Consultant extends User implements Serializable {
						
	
	private static final long serialVersionUID = 1L;

	public Consultant() {
		super();
	}
	
	public Consultant(String lastName, String firstName) {
		super(lastName, firstName);
		// TODO Auto-generated constructor stub
	}
   
}
