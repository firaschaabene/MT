package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Allergyinformation
 *
 */
@Entity
@Table(name="t_allergyInformation")
public class Allergyinformation implements Serializable {

	private Integer id;
//	private Medicalrecords medicalrecordAI;
	private String allergens;
	private String dietaryTriggers;
	private String environmentalTriggers;
	private String intolerances;
	private String adverseReaction;
	private static final long serialVersionUID = 1L;

	public Allergyinformation() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAllergens() {
		return this.allergens;
	}

	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}

	public String getDietaryTriggers() {
		return this.dietaryTriggers;
	}

	public void setDietaryTriggers(String dietaryTriggers) {
		this.dietaryTriggers = dietaryTriggers;
	}

	public String getEnvironmentalTriggers() {
		return this.environmentalTriggers;
	}

	public void setEnvironmentalTriggers(String environmentalTriggers) {
		this.environmentalTriggers = environmentalTriggers;
	}

	public String getIntolerances() {
		return this.intolerances;
	}

	public void setIntolerances(String intolerances) {
		this.intolerances = intolerances;
	}

	public String getAdverseReaction() {
		return this.adverseReaction;
	}

	public void setAdverseReaction(String adverseReaction) {
		this.adverseReaction = adverseReaction;
	}
//
//	@ManyToOne
//	@JoinColumn(name = "medRec_AL_FK")
//	public Medicalrecords getMedicalrecord() {
//		return medicalrecordAI;
//	}
//
//	public void setMedicalrecord(Medicalrecords medicalrecord) {
//		this.medicalrecordAI = medicalrecord;
//	}
}
