package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;

@Remote
public interface ActivityServiceRemote {

	Activity create (Activity activity);
	void update (Activity  activity);
void delete(Integer id);
void delete(Activity activity);
Activity find(Integer id);
Activity findByName(String name);
List<Activity>findByhotel(Hotel hotel);
List<Activity>findAll();





}
