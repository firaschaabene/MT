package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ReservationClinicPk  implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idClient;
	private Integer idClinic;

	public ReservationClinicPk() {
		// TODO Auto-generated constructor stub
	}
	@Column(name="id_client")
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	@Column(name="id_clinic")
	public Integer getIdClinic() {
		return idClinic;
	}
	public void setIdClinic(Integer idClnic) {
		this.idClinic = idClnic;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result
				+ ((idClinic == null) ? 0 : idClinic.hashCode());
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
		ReservationClinicPk other = (ReservationClinicPk) obj;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idClinic == null) {
			if (other.idClinic != null)
				return false;
		} else if (!idClinic.equals(other.idClinic))
			return false;
		return true;
	}
	public ReservationClinicPk(Integer idClient, Integer idClinic) {
		this.idClient = idClient;
		this.idClinic = idClinic;
	}
	
	
	
	
	

}
