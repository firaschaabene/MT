package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Pack;

@Remote
public interface PackServiceRemote {

	Pack create (Pack pack);
	void update (Pack  pack);
void delete(Integer id);
void delete(Pack pack);
Pack find(Integer id);
Pack findByName(String name);
List<Pack>findAll();





}
