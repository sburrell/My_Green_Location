package model;

import java.io.Serializable;
import javax.persistence.*;
import model.Utilisateur;

/**
 * Entity implementation class for Entity: Employe
 *
 */
@Entity

public class Employe extends Utilisateur implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String fonction;
	private String nom;
	private String prenom;

	public Employe(String fonction, String nom, String prenom) {
		super();
		this.fonction = fonction;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

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

	public Employe() {
		super();
	}
   
}