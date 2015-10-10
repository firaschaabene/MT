package tn.esprit.medicaltourism.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity
@Table(name="t_message")

public class Message implements Serializable {

	private User user;
	private Integer id;
	private Integer idExpediteur;
	private Integer idDestinataire;
	private String text;

	private static final long serialVersionUID = 1L;

	public Message() {
		
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}  
	@Lob
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
        

    @JoinColumn(name="expediteur_fk", referencedColumnName="id")
	public Integer getIdExpediteur() {
		return idExpediteur;
	}
	
	
	public void setIdExpediteur(Integer idExpediteur) {
		this.idExpediteur = idExpediteur;
	}


    @JoinColumn(name="expediteur_fk", referencedColumnName="id")
	public Integer getIdDestinataire() {
		return idDestinataire;
	}
	public void setIdDestinataire(Integer idDestinataire) {
		this.idDestinataire = idDestinataire;
	}
	@ManyToOne
	@JoinColumn(name="user_fk")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
   
}
