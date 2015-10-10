package tn.esprit.medicaltourism.initDB;

import javax.ejb.Local;

import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.User;



@Local
public interface InitdbLocal {
	void create( User user) ;
	void create( Hotel hotel) ;
}
