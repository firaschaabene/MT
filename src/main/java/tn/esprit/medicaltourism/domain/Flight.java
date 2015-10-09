package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Flight
 *
 */
@Entity
@Table(name="t_flight")

public class Flight implements Serializable {

	
	private Integer id;
	private Date DepartureTime;
	private Date ArrivalTime;
	private static final long serialVersionUID = 1L;
	private List <Ticket>tickets;

	public Flight() {
	
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	@Temporal(TemporalType.DATE)
	public Date getDepartureTime() {
		return this.DepartureTime;
	}

	public void setDepartureTime(Date DepartureTime) {
		this.DepartureTime = DepartureTime;
	}   
	@Temporal(TemporalType.DATE)
	public Date getArrivalTime() {
		return this.ArrivalTime;
	}

	public void setArrivalTime(Date ArrivalTime) {
		this.ArrivalTime = ArrivalTime;
	}
	@OneToMany(mappedBy="myflight")
	public List <Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List <Ticket> tickets) {
		this.tickets = tickets;
	}
   
}
