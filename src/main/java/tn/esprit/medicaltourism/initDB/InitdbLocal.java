package tn.esprit.medicaltourism.initDB;

import javax.ejb.Local;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Pack;
import tn.esprit.medicaltourism.domain.Patient;
import tn.esprit.medicaltourism.domain.User;



@Local
public interface InitdbLocal {
	void create( User user) ;
	void create( Hotel hotel) ;
	Pack update (Pack pack);
	void create( Pack pack) ;
	void create (Patient patient);
	void create (Activity activity);
}
