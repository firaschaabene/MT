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
	private String DepartureTime;
	private String ArrivalTime;
	private static final long serialVersionUID = 1L;
	private List <Ticket>tickets;

	public Flight() {
	
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	
	public String getDepartureTime() {
		return this.DepartureTime;
	}

	public void setDepartureTime(String DepartureTime) {
		this.DepartureTime = DepartureTime;
	}   

	public String getArrivalTime() {
		return this.ArrivalTime;
	}

	public void setArrivalTime(String ArrivalTime) {
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
