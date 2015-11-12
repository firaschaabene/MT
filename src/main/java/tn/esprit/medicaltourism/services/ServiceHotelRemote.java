package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Service_Hotel;

@Remote
public interface ServiceHotelRemote {
	
	
	

	void create (Service_Hotel service_hotel);
	void update (Service_Hotel  service_hotel);
void delete(Integer id);

Service_Hotel find(Integer id);
 //List <Offer> findByName(String name);
List<Service_Hotel> findByName(String name);
List<Service_Hotel>findAll();
List<Service_Hotel>findByhotel(Hotel hotel);

}
