package model;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Vehicule;

public class ConnectionDB {
	private EntityManagerFactory factory;
	private EntityManager em;
	private ArrayList<Client> clients;
	private ArrayList<Vehicule> vehicules;
	private ArrayList<Employe> employes;
	private ArrayList<Reservation> reservations;
	private ArrayList<Categorie> categories;
	
		
	public ConnectionDB(String db) {
	/*	factory = Persistence.createEntityManagerFactory("LocationVoitureDB");
		em = factory.createEntityManager(); */
		initCategorie();
		initClient();
		initVehicule();
		initEmploye();
		initReservation();			
		
	}
	
	private void initCategorie() {
		Categorie c1 = new Categorie();
		Categorie c2 = new Categorie();
		c1.setId((long) 1);
		c2.setId((long) 2);
		c1.setNom("Business");
		c2.setNom("Familiale");
		c1.setPrix(80);
		c2.setPrix(130);
		c1.setNbPlaces(5);
		c2.setNbPlaces(7);
		c1.setNbPortes(5);
		c2.setNbPortes(5);
		c1.setCaution(500);
		c2.setCaution(850);
		c1.setCO2(3000);
		c2.setCO2(50000);
		categories.add(c1);
		categories.add(c2);		
	}

	@SuppressWarnings("deprecation")
	private void initReservation() {
		Reservation r1 = new Reservation();
		Reservation r2 = new Reservation();
		Reservation r3 = new Reservation();
		
		r1.setId(1);
		r1.setVehicule(vehicules.get(1));
		r1.setClient(clients.get(0));
		r1.setEmploye(employes.get(0));
		r1.setDateDebut(new Date(2012, 7, 1));
		r1.setDateFin(new Date(2012, 7, 10));
		
		r2.setId(2);
		r2.setVehicule(vehicules.get(0));
		r2.setClient(clients.get(0));
		r2.setEmploye(employes.get(1));
		r2.setDateDebut(new Date(2012, 5, 11));
		r2.setDateFin(new Date(2012, 7, 21));
		
		r3.setId(3);
		r3.setVehicule(vehicules.get(2));
		r3.setClient(clients.get(1));
		r3.setEmploye(employes.get(1));
		r3.setDateDebut(new Date(2012, 8, 6));
		r3.setDateFin(new Date(2012, 8, 10));
		
		reservations.add(r1);
		reservations.add(r2);
		reservations.add(r3);
	}

	private void initEmploye() {
		// TODO Auto-generated method stub
		Employe e1 = new Employe();
		Employe e2 = new Employe();
		
		e1.setId(1);
		e2.setId(2);
		e1.setLogin("monsieur_employe");
		e2.setLogin("madame_secretaire");
		e1.setPwd("employe");
		e2.setPwd("employe");
		e1.setNom("Banane");
		e2.setNom("Fraise");
		e1.setPrenom("Jamie Lee");
		e2.setPrenom("Lucie");
		e1.setFonction("consultant");
		e2.setFonction("secretaire");
		
		employes.add(e1);
		employes.add(e2);
	}

	private void initVehicule() {
		Vehicule v1 = new Vehicule();
		Vehicule v2 = new Vehicule();
		Vehicule v3 = new Vehicule();
		Vehicule v4 = new Vehicule();
		
		v1.setId((long) 1);
		v1.setCategorie(categories.get(1));
		v1.setCouleur("Bleu");
		v1.setDisponibilite("Oui");
		v1.setImmatriculation("MNR123");
		v1.setMarque("Ford");
		v1.setModele("Focus");
		
		v2.setId((long) 2);
		v2.setCategorie(categories.get(1));
		v2.setCouleur("Rouge");
		v2.setDisponibilite("Non");
		v2.setImmatriculation("QJF456");
		v2.setMarque("Renault");
		v2.setModele("Twingo");
		
		v3.setId((long) 3);
		v3.setCategorie(categories.get(0));
		v3.setCouleur("Gris");
		v3.setDisponibilite("Oui");
		v3.setImmatriculation("PYB789");
		v3.setMarque("Renault");
		v3.setModele("Clio");
		
		v4.setId((long) 4);
		v4.setCategorie(categories.get(0));
		v4.setCouleur("Jaune");
		v4.setDisponibilite("Non");
		v4.setImmatriculation("DXP345");
		v4.setMarque("Peugeot");
		v4.setModele("106");
		
		vehicules.add(v1);
		vehicules.add(v2);
		vehicules.add(v3);
		vehicules.add(v4);
	}

	private void initClient() {
		Client c1 = new Client();
		Client c2 = new Client();
		Client c3 = new Client();
		
		c1.setId(1);
		c2.setId(2);
		c3.setId(3);
		c1.setNom("Burrell");
		c2.setNom("Girard");
		c3.setNom("Veale");
		c1.setPrenom("Sarah");
		c2.setPrenom("Jean-Jacques-et-Paul");
		c3.setPrenom("Clodagh");
		c1.setLogin("sburrell");
		c2.setLogin("patateman");
		c3.setLogin("cveale");
		c1.setPwd("hello");
		c2.setPwd("hello");
		c3.setPwd("hello");
		
		clients.add(c1);
		clients.add(c2);
		clients.add(c3);
				
	}

	public void add(Vehicule v) {
		beginTransaction();
		em.persist(v);
		commitTransaction();
	}
	
	public void del(Vehicule v) {
		beginTransaction();
		em.remove(v);
		commitTransaction();
	}
	
	@SuppressWarnings("rawtypes")
	public List getAll(String table) {
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public List get(String table, String champs, String value) {
		
		return null;
		
	}
	
	@SuppressWarnings("rawtypes")
	public List get(String sql) {
		return null;
	}

	public void beginTransaction() {
		em.getTransaction().begin();
	}
	
	public void commitTransaction() {
		em.getTransaction().commit();
	}
	
	public void close() {
		em.close();
	}
}
