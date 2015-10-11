package tn.esprit.medicaltourism.services;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Note;

@Remote
public interface NoteServiceRemote {

	Boolean create (Note notes);
	




}
