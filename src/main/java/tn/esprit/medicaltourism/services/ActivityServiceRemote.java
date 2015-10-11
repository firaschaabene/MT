package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Activity;

@Remote
public interface ActivityServiceRemote {

	Activity create (Activity activity);
	void update (Activity  activity);
void delete(Integer id);
void delete(Activity activity);
Activity find(Integer id);
Activity findByName(String name);
List<Activity>findAll();





}
