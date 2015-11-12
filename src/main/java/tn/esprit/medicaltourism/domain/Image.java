package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Image
 *
 */
@Entity
@Table(name="t_image")
public class Image implements Serializable {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id ;
private String url ;
private User user;
private Hotel hotel ;
private Service_Hotel service_hotel;
private Service_HI service_hi;
private HealthInstitute healthInstitute;
private Activity activity ;
private Experience experience;

    public Image() {
       
    }
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}

public Image(int id, String url) {

	this.id = id;
	this.url = url;
}
@Override
public String toString() {
	return "Image [id=" + id + ", url=" + url + ", user=" + user + ", hotel="
			+ hotel + ", healthInstitute=" + healthInstitute + ", activity="
			+ activity + "]";
}


@OneToOne
@JoinColumn(name ="user_picture_FK")
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
@ManyToOne
@JoinColumn(name ="hotel_pictures_FK")
public Hotel getHotel() {
	return hotel;
}
public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}
@ManyToOne
@JoinColumn(name ="HI_pictures_FK")
public HealthInstitute getHealthInstitute() {
	return healthInstitute;
}
public void setHealthInstitute(HealthInstitute healthInstitute) {
	this.healthInstitute = healthInstitute;
}
@ManyToOne
@JoinColumn(name ="Activity_pictures_FK")
public Activity getActivity() {
	return activity;
}
public void setActivity(Activity activity) {
	this.activity = activity;
}
@ManyToOne
@JoinColumn(name ="service_Hotel_pictures_FK")
public Service_Hotel getService_hotel() {
	return service_hotel;
}
public void setService_hotel(Service_Hotel service_hotel) {
	this.service_hotel = service_hotel;
}
@ManyToOne
@JoinColumn(name ="Experience_pictures_FK")
public Experience getExperience() {
	return experience;
}
public void setExperience(Experience experience) {
	this.experience = experience;
}
@ManyToOne
@JoinColumn(name ="Service_HI_pictures_FK")
public Service_HI getService_hi() {
	return service_hi;
}
public void setService_hi(Service_HI service_hi) {
	this.service_hi = service_hi;
}





	
}
