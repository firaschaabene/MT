package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class HealthInstitueReservationPk  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUser;
	private Integer idHi;

	
	public HealthInstitueReservationPk() {
	}
		

	
	
	@Column(name="id_user")
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	@Column(name="id_hi")
	public Integer getIdHi() {
		return idHi;
	}
	public void setIdHi(Integer idHi) {
		this.idHi = idHi;
	}
	public HealthInstitueReservationPk(Integer idUser, Integer idHi) {
		this.idUser = idUser;
		this.idHi = idHi;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idHi == null) ? 0 : idHi.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
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
		HealthInstitueReservationPk other = (HealthInstitueReservationPk) obj;
		if (idHi == null) {
			if (other.idHi != null)
				return false;
		} else if (!idHi.equals(other.idHi))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}





	
	
	
	

}
