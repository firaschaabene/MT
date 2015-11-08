package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue(value = "user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer id;
	private String firstName;
	private String pwd;
	private String lastName;
	private String nickName;
	private String birthDate;
	private String email;
	private String adress;
	private Integer cinNumber;
	private Integer passportNumber;

	private Image picture;
	private List <Message>messages ;
	private List <Ticket>tickets;
	private List<Reservation>reservations;
	private List<HealthInstitueReservation> healthInstitueReservation;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "first_name")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "nick_name")
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "birth_date")
	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "adress")
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Column(name = "cin_number")
	public Integer getCinNumber() {
		return this.cinNumber;
	}

	public void setCinNumber(Integer cinNumber) {
		this.cinNumber = cinNumber;
	}

	@Column(name = "passport_number")
	public Integer getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}

	
	

	public User(String firstName, String lastName, String nickName,
			String birthDate, String email, String adress, Integer cinNumber,
			Image picture, String pwd) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.birthDate = birthDate;
		this.email = email;
		this.adress = adress;
		this.pwd = pwd;
		this.cinNumber = cinNumber;
		this.picture=picture;
		
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@OneToMany(mappedBy= "user")
	public List <Message> getMessages() {
		return messages;
	}

	public void setMessages(List <Message> messages) {
		this.messages = messages;
	}
	

public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

@OneToMany(mappedBy="mypatient")
public List <Ticket> getTickets() {
	return tickets;
}
public void setTickets(List <Ticket> tickets) {
	this.tickets = tickets;
}
@OneToMany(mappedBy="patient")
public List<Reservation> getReservations() {
	return reservations;
}

public void setReservations(List<Reservation> reservations) {
	this.reservations = reservations;
}
@OneToMany(mappedBy="user")
public List<HealthInstitueReservation> getHealthInstitueReservation() {
	return healthInstitueReservation;
}

public void setHealthInstitueReservation(List<HealthInstitueReservation> healthInstitueReservation) {
	this.healthInstitueReservation = healthInstitueReservation;
}

@OneToOne(mappedBy="user",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
public Image getPicture() {
	return picture;
}

public void setPicture(Image picture) {
	this.picture = picture;
}



/**
 * @param lastName
 * @param firstName
 * @param email
 */
public User(String lastName, String firstName, String email) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.email = email;
}



}