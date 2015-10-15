package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.User;

@Remote
public interface UserServiceRemote {
	void create(User user);

	List<User> findAllUser();

}
