package model;

import java.io.Serializable;
import javax.persistence.*;

import model.Categorie;

/**
 * Entity implementation class for Entity: Vehicle
 *
 */
@Entity
public class Vehicule implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id private Long id;	
	private String modele;
	private String immatriculation;
	private String marque;
	private String couleur;
	private String disponibilite;
	
	@ManyToOne
	@JoinColumn(name = "Categorieid")
	private Categorie categorie;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {	return id;}
	public void setId(Long id) {this.id = id;}
	
	public String getModele() {	return modele;}
	public void setModele(String modele) {this.modele = modele;	}

	public String getImmatriculation() {return immatriculation;	}
	public void setImmatriculation(String immatriculation) {this.immatriculation = immatriculation;	}

	public String getMarque() {return marque;}
	public void setMarque(String marque) {this.marque = marque;}
	
	public String getCouleur() {return couleur;}
	public void setCouleur(String couleur) {this.couleur = couleur;}

	public String getDisponibilite() {return disponibilite;}
	public void setDisponibilite(String disponibilite) {this.disponibilite = disponibilite;	}

	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Vehicule() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 
	
   
}