package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ClinicReservationPk  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPatient;
	private Integer idClinic;

	
	public ClinicReservationPk() {
	}
		

	
	
	@Column(name="id_patient")
	public Integer getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}
	@Column(name="id_clinic")
	public Integer getIdClinic() {
		return idClinic;
	}
	public void setIdClinic(Integer idClinic) {
		this.idClinic = idClinic;
	}
	public ClinicReservationPk(Integer idPatient, Integer idClinic) {
		this.idPatient = idPatient;
		this.idClinic = idClinic;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idClinic == null) ? 0 : idClinic.hashCode());
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
		ClinicReservationPk other = (ClinicReservationPk) obj;
		if (idClinic == null) {
			if (other.idClinic != null)
				return false;
		} else if (!idClinic.equals(other.idClinic))
			return false;
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		return true;
	}
	
	
	
	
	
	

}
