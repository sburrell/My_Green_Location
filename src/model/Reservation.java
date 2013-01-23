package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id private long id;
	
	
	@ManyToOne
	@JoinColumn(name = "clientID", nullable=true)
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "employeID", nullable=true)
	private Employe employe;

	@ManyToOne
	@JoinColumn(name = "vehiculeID" )
	private Vehicule vehicule;

	private Date DateDebut;
	
	private Date DateFin;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Reservation() {
		super();
	}
}