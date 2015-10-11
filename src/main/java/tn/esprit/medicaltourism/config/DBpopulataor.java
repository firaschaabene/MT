package tn.esprit.medicaltourism.config;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.medicaltourism.domain.Admin;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.User;
import tn.esprit.medicaltourism.initDB.InitdbLocal;

@Singleton
@Startup
public class DBpopulataor {
	
	 @EJB
	private InitdbLocal initdbLocal ;
	
	public DBpopulataor() {

	}

	@PostConstruct
	public void createSome() {
		User admin = new Admin();
		admin.setNickName("root");
		admin.setPwd("root");
		initdbLocal.create(admin);
		
		Hotel hotel = new Hotel("Sephir",5,"Hammamet");
		initdbLocal.create(hotel);
	}
	
//	@PostConstruct
//	public void createSomeHotel() {
////		Hotel hotel = new Hotel();
////		admin.setNickName("root");
////		admin.setPwd("root");
////		initdbLocal.create(admin);
//			
//	}
//	
	
}
