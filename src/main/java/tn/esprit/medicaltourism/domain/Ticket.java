package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import tn.esprit.medicaltourism.domain.TicketPK;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity
@Table(name="t_ticket")
public class Ticket implements Serializable {

	
	private Date timeDeparture;
	private Date timeArrival;
	private float price;
	private String destination;
	private TicketPK ticketPK;
	
	private Flight Myflight;
	private User Mypatient;
	private static final long serialVersionUID = 1L;

	public Ticket() {
		super();
	}   
	public Date getTimeDeparture() {
		return this.timeDeparture;
	}

	public void setTimeDeparture(Date timeDeparture) {
		this.timeDeparture = timeDeparture;
	}   
	public Date getTimeArrival() {
		return this.timeArrival;
	}

	public void setTimeArrival(Date timeArrival) {
		this.timeArrival = timeArrival;
	}   
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}   
	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}  
	@EmbeddedId
	public TicketPK getTicketPK() {
		return this.ticketPK;
	}

	public void setTicketPK(TicketPK ticketPK) {
		this.ticketPK = ticketPK;
	
   
		
	}
	@ManyToOne
	@JoinColumn(name="id_flight",referencedColumnName="id",insertable=false,updatable=false)
	public Flight getMyflight() {
		return Myflight;
	}
	public void setMyflight(Flight myflight) {
		Myflight = myflight;
	}
	@ManyToOne
	@JoinColumn(name="id_patient",referencedColumnName="id",insertable=false,updatable=false)
	public User getMypatient() {
		return Mypatient;
	}
	public void setMypatient(User mypatient) {
		Mypatient = mypatient;
	}
	public Ticket(Date timeDeparture, Date timeArrival, float price,
			String destination, Flight myflight, User mypatient) {
		super();
		this.timeDeparture = timeDeparture;
		this.timeArrival = timeArrival;
		this.price = price;
		this.destination = destination;
		Myflight = myflight;
		Mypatient = mypatient;
		this.ticketPK=new TicketPK(mypatient.getId(),myflight.getId());
	}
	
	
}
