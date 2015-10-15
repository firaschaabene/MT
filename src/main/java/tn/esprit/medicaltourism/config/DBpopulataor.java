package tn.esprit.medicaltourism.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.medicaltourism.domain.Activity;
import tn.esprit.medicaltourism.domain.Admin;
import tn.esprit.medicaltourism.domain.Allergyinformation;
import tn.esprit.medicaltourism.domain.Doctor;
import tn.esprit.medicaltourism.domain.HealthProblem;
import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.MedicalRecords;
import tn.esprit.medicaltourism.domain.Medication;
import tn.esprit.medicaltourism.domain.Pack;
import tn.esprit.medicaltourism.domain.Patient;
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
//		MedicalRecords mr1=new MedicalRecords();
//		MedicalRecords mr2=new MedicalRecords();
//		MedicalRecords mr3=new MedicalRecords();
//		MedicalRecords mr4=new MedicalRecords();
//		MedicalRecords mr5=new MedicalRecords();

//
//		HealthProblem hp1=new HealthProblem(mr1,"diag1","startdate1","dateofResol1",1);
//		
//		HealthProblem hp2=new HealthProblem(mr1,"diag2","startdate2","dateofResol",1);
//		HealthProblem hp3=new HealthProblem(mr1,"diag3","startdate3","dateofResol3",0); 
//		
//		Medication med1=new Medication(mr1,"genericname1","brandname1","dossallevel1","sourcename1",true);
//		Medication med2=new Medication(mr1,"genericname2","brandname2","dossallevel2","sourcename2",false);
//		Medication med3=new Medication(mr1,"genericname3","brandname3","dossallevel3","sourcename3",true);
//
//		Allergyinformation al1=new Allergyinformation(mr1,"allergens1","dietarytriggers1","environmmentaltriggers1","intolerance1","adverseReaction1");
//		Allergyinformation al2=new Allergyinformation(mr1,"allergens2","dietarytriggers2","environmmentaltriggers2","intolerance2","adverseReaction2");
//		Allergyinformation al3=new Allergyinformation(mr1,"allergens3","dietarytriggers3","environmmentaltriggers3","intolerance3","adverseReaction3");
//		
//		List<HealthProblem> list_hi =new ArrayList<HealthProblem>();
//		list_hi.add(hp1);
//		list_hi.add(hp2);
//		list_hi.add(hp3);
//		
//		
//		List<Medication> list_med =new ArrayList<Medication>();
//		list_med.add(med1);
//		list_med.add(med2);
//		list_med.add(med3);
//		
//	
//		List<Allergyinformation> list_AI =new ArrayList<Allergyinformation>();
//		list_AI.add(al1);
//		list_AI.add(al2);
//		list_AI.add(al3);
//		MedicalRecords mr12=new MedicalRecords(list_AI,list_hi,list_med,patient1);

		Patient patient1 = new Patient();
		
		patient1.setNickName("petro");
		patient1.setPwd("");
		initdbLocal.create(patient1);
	Patient patient2 = new Patient();
	patient2.setNickName("Armando");
	patient2.setPwd("");

	initdbLocal.create(patient2);	
	
	Patient patient3 = new Patient();
	patient3.setNickName("mauro");
	patient3.setPwd("");

	initdbLocal.create(patient3);
	

	Patient patient4 = new Patient();
	patient4.setNickName("emily");
	patient4.setPwd("");

	initdbLocal.create(patient4);
	
	
	
	Patient patient5= new  Patient();
	patient5.setNickName("firas");
	patient5.setPwd("");

	initdbLocal.create(patient5);
	
	Doctor dor2 = new Doctor("Mohamed", "Chaouch","mohamed.chaouch@esprit.tn", "Pediater");
	Doctor dor3= new Doctor("Mohamed", "Chaouch","mohamed.chaouch@esprit.tn", "Pediater");
	initdbLocal.create(dor2);
	initdbLocal.create(dor3);
		
	
		
		Hotel hotel = new Hotel("Sephir",5,"Hammamet");
		initdbLocal.create(hotel);
		Hotel hotel1 = new Hotel("Lella el baya",5,"Hammamet");
		initdbLocal.create(hotel1);
		Hotel hotel2 = new Hotel("soltan",5,"Hammamet");
		initdbLocal.create(hotel2);
		Hotel hotel3 = new Hotel("Mouradi",5,"Hammamet");
		initdbLocal.create(hotel3);
		Hotel hotel4 = new Hotel("Sephir",5,"Hammamet");
		initdbLocal.create(hotel4);
		
		Hotel hotel5 = new Hotel("chichkhan",5,"Hammamet");
		initdbLocal.create(hotel5);
		
		
		
		
		
	Activity activity1 = new Activity();
	activity1.setName("running");	
	initdbLocal.create(activity1);
	
	
	Activity activity2 = new Activity();
	activity2.setName("Spa");
	initdbLocal.create(activity2);
	
	
	
	
	Activity activity3 = new Activity();
	activity3.setName("sona");
	initdbLocal.create(activity3);
	
	
	
	
	Activity activity4 = new Activity();
	activity4.setName("swimming");
	initdbLocal.create(activity4);
	
	
	
		
		Pack pack1= new Pack();
		pack1.setName("classic");
		
		Pack pack2= new Pack();
		pack2.setName("confort");
		
		
		Pack pack3= new Pack();
		pack3.setName("confort Plus");
		
		initdbLocal.create(pack1);

		initdbLocal.create(pack2);

		initdbLocal.create(pack3);
		

		
	}
	
	
//	@PostConstruct
//	public void createSomeHotel() {
//		Hotel hotel = new Hotel();
//		admin.setNickName("root");
//		admin.setPwd("root");
//		initdbLocal.create(admin);
//			
//	}

	
}
