package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Services_Hotel;

@Remote
public interface ServicesHotelRemote {
	
	
	

	void create (Services_Hotel service_hotel);
	void update (Services_Hotel  service_hotel);
void delete(Integer id);

Services_Hotel find(Integer id);
 //List <Offer> findByName(String name);
List<Services_Hotel> findByName(String name);
List<Services_Hotel>findAll();
List<Services_Hotel>findByhotel(Hotel hotel);

}
