package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity
@Table (name="t_provider")
@DiscriminatorValue(value = "provider")
public class Provider extends User implements Serializable {

	private List<Hotel>hotels;
	
	private List<HealthInstitute>healthInstitutes;
	private static final long serialVersionUID = 1L;

	public Provider() {
	
	}

	public Provider(String firstName, String lastName, String nickName,
			String birthDate, String email, String adress, Integer cinNumber,
			Image picture, String pwd) {
		super(firstName, lastName, nickName, birthDate, email, adress, cinNumber,
				picture, pwd);
		// TODO Auto-generated constructor stub
	}

	public Provider(String lastName, String firstName, String email) {
		super(lastName, firstName, email);
		// TODO Auto-generated constructor stub
	}

	public Provider(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	@OneToMany(mappedBy = "provider", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
@OneToMany(mappedBy = "provider", cascade = { CascadeType.ALL}, fetch = FetchType.EAGER)
	public List<HealthInstitute> getHealthInstitutes() {
		return healthInstitutes;
	}

	public void setHealthInstitutes(List<HealthInstitute> healthInstitutes) {
		this.healthInstitutes = healthInstitutes;
	}
	
   
}
