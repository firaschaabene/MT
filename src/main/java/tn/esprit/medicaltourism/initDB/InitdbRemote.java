package tn.esprit.medicaltourism.initDB;

import javax.ejb.Remote;


import tn.esprit.medicaltourism.domain.User;

@Remote
public interface InitdbRemote {

	User authentificate(String text, String valueOf);
	

}
