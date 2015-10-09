package tn.esprit.medicaltourism.domain;

import java.io.Serializable;

public class Statistics  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Note evaluations;
	 private Integer notes;
	public Note getEvaluations() {
		return evaluations;
	}
	public void setEvaluations(Note evaluations) {
		this.evaluations = evaluations;
	}
	public Integer getNotes() {
		return notes;
	}
	public void setNotes(Integer notes) {
		this.notes = notes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((evaluations == null) ? 0 : evaluations.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
		Statistics other = (Statistics) obj;
		if (evaluations == null) {
			if (other.evaluations != null)
				return false;
		} else if (!evaluations.equals(other.evaluations))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}
	public Statistics() {
		// TODO Auto-generated constructor stub
	}
	public Statistics(Note evaluations, Integer notes) {
		this.evaluations = evaluations;
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Statistics [evaluations=" + evaluations + ", notes=" + notes
				+ "]";
	}
	

}
