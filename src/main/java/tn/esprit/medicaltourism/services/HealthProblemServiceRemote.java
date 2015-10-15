package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.HealthProblem;


@Remote
public interface HealthProblemServiceRemote {
	void create(HealthProblem healthProblem );
	HealthProblem find(Integer id);
	void update(HealthProblem healthProblem);
	void delete(HealthProblem healthProblem);
	List<HealthProblem> findAll();

}
