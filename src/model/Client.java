package model;

import java.io.Serializable;
import javax.persistence.*;
import model.Utilisateur;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client extends Utilisateur implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Client() {
		super();
	}
   
}