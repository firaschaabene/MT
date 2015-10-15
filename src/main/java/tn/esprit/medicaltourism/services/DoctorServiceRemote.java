package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Doctor;

@Remote
public interface DoctorServiceRemote {
	void createDoctor(Doctor doctor);

	List<Doctor> findAllDoctors();

	Doctor findDoctor(Integer id);

	void deleteDoctor(Doctor doctor);

	void updateDoctor(Doctor doctor);
	
	List<Doctor>  findDoctorBySpec(String speciality );



}
