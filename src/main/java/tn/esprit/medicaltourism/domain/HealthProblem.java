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
	private Date startDate;
	private Date dateOfResolution;

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
