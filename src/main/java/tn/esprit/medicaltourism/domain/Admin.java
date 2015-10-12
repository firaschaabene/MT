package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;

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

	public Admin(String firstName, String lastName, String nickName,
			String birthDate, String email, String adress, Integer cinNumber,
			Image picture, String pwd) {
		super(firstName, lastName, nickName, birthDate, email, adress, cinNumber, picture, pwd);
		// TODO Auto-generated constructor stub
	}
	
	
   
}
