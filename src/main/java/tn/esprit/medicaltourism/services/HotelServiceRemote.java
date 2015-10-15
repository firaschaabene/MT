package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;
@Remote
public interface HotelServiceRemote {

	Hotel create (Hotel hotel);
	void update (Hotel hotel);
void delete(Hotel hotel);
void deleteById(Integer ID);
Hotel findById(Integer id);
List<Hotel> findByStars(Integer Star);
List<Hotel>findAll();
List<Activity>findByhotel(Hotel hotel);
}
