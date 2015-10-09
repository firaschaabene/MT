package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@Table (name="t_admin")
@DiscriminatorValue(value = "admin")
public class Admin extends User implements Serializable {


	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}
   
}
