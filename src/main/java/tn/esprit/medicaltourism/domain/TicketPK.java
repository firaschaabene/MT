package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class TicketPK implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPatient;
	private Integer idFlight;


	public TicketPK() {
	
	}   
	@Column(name="id_patient")
	public Integer getIdPatient() {
		return this.idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}
	@Column(name="id_flight")
	public Integer getIdFlight() {
		return this.idFlight;
	}
	
	
	
	
	
	
	
	


	public void setIdFlight(Integer idFlight) {
		this.idFlight = idFlight;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idFlight == null) ? 0 : idFlight.hashCode());
		result = prime * result
				+ ((idPatient == null) ? 0 : idPatient.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketPK other = (TicketPK) obj;
		if (idFlight == null) {
			if (other.idFlight != null)
				return false;
		} else if (!idFlight.equals(other.idFlight))
			return false;
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		return true;
	}   
	
	
	
	public TicketPK(Integer idPatient, Integer idFlight) {
		super();
		this.idPatient = idPatient;
		this.idFlight = idFlight;
	}

   
}
