package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ReservationPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPatient;
	private Integer idHotel;
	public ReservationPk() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="id_Patient")
	public Integer getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}
	@Column(name="id_Hotel")
	public Integer getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idHotel == null) ? 0 : idHotel.hashCode());
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
		ReservationPk other = (ReservationPk) obj;
		if (idHotel == null) {
			if (other.idHotel != null)
				return false;
		} else if (!idHotel.equals(other.idHotel))
			return false;
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		return true;
	}

	public ReservationPk(Integer idPatient, Integer idHotel) {
		super();
		this.idPatient = idPatient;
		this.idHotel = idHotel;
	}
	
	
	
	
	
}
