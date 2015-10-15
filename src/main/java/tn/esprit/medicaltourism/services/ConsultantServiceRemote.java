package tn.esprit.medicaltourism.services;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Consultant;

@Remote
public interface ConsultantServiceRemote {
	void createConsultant(Consultant consultant);

	List<Consultant> findAllConsultants();

	Consultant findConsultant(Integer id);

	void deleteConsultant(Consultant consultant);

	void updateConsultant(Consultant consultant);

}
