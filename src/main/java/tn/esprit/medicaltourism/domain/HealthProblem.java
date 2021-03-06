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
@Table(name = "t_healthProblem")
public class HealthProblem implements Serializable {

	private Integer id;
	
	private MedicalRecords HP;
	private String diagnostic;
	private String startDate;
	private String dateOfResolution;

//	private enum ProblemState {
//		Active, inactive
//	}
//
//	private enum CharacterState {
//		chronic, acute
//	}
//
//	private ProblemState state;
//	private CharacterState character;
//	
//
//	@Enumerated(EnumType.STRING)
//	public ProblemState getState() {
//		return state;
//	}
//
//	public void setState(ProblemState state) {
//		this.state = state;
//	}
//
//	@Enumerated(EnumType.STRING)
//	public CharacterState getCharacter() {
//		return character;
//	}
//
//	public void setCharacter(CharacterState character) {
//		this.character = character;
//	}

	private int priority;

	private static final long serialVersionUID = 1L;

	public HealthProblem() {
		super();
	}
	

	public HealthProblem(MedicalRecords hP, String diagnostic,
			String startDate, String dateOfResolution, int priority) {
		super();
		HP = hP;
		this.diagnostic = diagnostic;
		this.startDate = startDate;
		this.dateOfResolution = dateOfResolution;
		this.priority = priority;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDateOfResolution() {
		return dateOfResolution;
	}

	public void setDateOfResolution(String dateOfResolution) {
		this.dateOfResolution = dateOfResolution;
	}

	@ManyToOne
	@JoinColumn(name = "medRecc_HP_FK")
	public MedicalRecords getHP() {
		return HP;
	}

	public void setHP(MedicalRecords hP) {
		HP = hP;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
