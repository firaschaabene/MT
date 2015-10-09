package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HealthProblem
 *
 */
@Entity
@Table(name ="t_healthProblem")
public class HealthProblem implements Serializable {

	private Integer id;
//	private Medicalrecords medicalrecordHP;
	private String diagnostic;
	private Date startDate;
	private Date dateOfResolution;

	private enum ProblemState {
		Active, inactive
	}

	@Enumerated(EnumType.STRING)
	private ProblemState state;

	private enum CharacterState {
		chronic, acute
	}

	@Enumerated(EnumType.STRING)
	private CharacterState character;
	private int priority;

	private static final long serialVersionUID = 1L;

	public HealthProblem() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDateOfResolution() {
		return dateOfResolution;
	}

	public void setDateOfResolution(Date dateOfResolution) {
		this.dateOfResolution = dateOfResolution;
	}

	public ProblemState getState() {
		return state;
	}

	public void setState(ProblemState state) {
		this.state = state;
	}

	public CharacterState getCharacter() {
		return character;
	}

	public void setCharacter(CharacterState character) {
		this.character = character;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

//	@ManyToOne
//	@JoinColumn(name = "medRec_HP_FK")
//	public Medicalrecords getMedicalrecordHP() {
//		return medicalrecordHP;
//	}
//
//	public void setMedicalrecordHP(Medicalrecords medicalrecordHP) {
//		this.medicalrecordHP = medicalrecordHP;
//	}
}
