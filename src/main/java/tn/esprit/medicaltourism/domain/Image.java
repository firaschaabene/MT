package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
private Services_Hotel service_hotel;
private HealthInstitute healthInstitute;
private Activity activity ;


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
@OneToOne
@JoinColumn(name ="hotel_picture_FK")
public Hotel getHotel() {
	return hotel;
}
public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}
@OneToOne
@JoinColumn(name ="HI_picture_FK")
public HealthInstitute getHealthInstitute() {
	return healthInstitute;
}
public void setHealthInstitute(HealthInstitute healthInstitute) {
	this.healthInstitute = healthInstitute;
}
@OneToOne
@JoinColumn(name ="Activity_picture_FK")
public Activity getActivity() {
	return activity;
}
public void setActivity(Activity activity) {
	this.activity = activity;
}
@OneToOne
@JoinColumn(name ="services_Hotel_picture_FK")
public Services_Hotel getService_hotel() {
	return service_hotel;
}
public void setService_hotel(Services_Hotel service_hotel) {
	this.service_hotel = service_hotel;
}





	
}
