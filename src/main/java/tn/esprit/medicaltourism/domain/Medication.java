
package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medication
 *
 */
@Entity
@Table(name="t_medication")
public class Medication implements Serializable {
	
	private Integer id;
	private MedicalRecords med;
	private String genericName;
	private String brandName;
	private String dossageLevel;
	private String sourceName;
	private boolean herbalMedication;
	

	private static final long serialVersionUID = 1L;

	public Medication() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGenericName() {
		return this.genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	@ManyToOne
	@JoinColumn(name="medicals_fk")
	public MedicalRecords getMed() {
		return med;
	}

	public void setMed(MedicalRecords medication) {
		this.med = medication;
	}
	
	
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDossageLevel() {
		return this.dossageLevel;
	}

	public void setDossageLevel(String dossageLevel) {
		this.dossageLevel = dossageLevel;
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public boolean getHerbalMedication() {
		return this.herbalMedication;
	}

	public void setHerbalMedication(boolean herbalMedication) {
		this.herbalMedication = herbalMedication;
	}
	

}
