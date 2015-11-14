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
	private Integer idRoom;
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
	
public ReservationPk(Integer idPatient, Integer idRoom) {
		super();
		this.idPatient = idPatient;
		this.idRoom = idRoom;
	}
	@Column(name="id_Room")
	public Integer getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPatient == null) ? 0 : idPatient.hashCode());
		result = prime * result + ((idRoom == null) ? 0 : idRoom.hashCode());
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
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		if (idRoom == null) {
			if (other.idRoom != null)
				return false;
		} else if (!idRoom.equals(other.idRoom))
			return false;
		return true;
	}
	
	
	
	
	
}
