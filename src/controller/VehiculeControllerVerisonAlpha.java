package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Vehicule;

public class VehiculeControllerVerisonAlpha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PERSISTENCE_UNIT_NAME = "LocationVoitureDB";
	private static EntityManagerFactory factory;
	private static EntityManager em;

	/**
	 * Constructor
	 */
	public VehiculeControllerVerisonAlpha() {
		super();
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    Vehicule v = getVehiculeById(3);	    	
		request.setAttribute( "vehicule", v );
		RequestDispatcher dispatcher = getServletContext().
		getRequestDispatcher("/VehiculeInfo.jsp"); 
		
		dispatcher.forward(request, response);

	  }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

	/**
	 * Get all vehicules
	 */
/*	public List getAllVehicules(){
		Query query = em.createQuery("SELECT * FROM vehicule");
		List results = (List) query.getResultList();
		return results;
		
	}
	
	/**
	 * Get a vehicule by its id
	 * @param v
	 * @return
	 */
	/*public Vehicule getVehiculeById(int i){
		Query query = em.createQuery("SELECT * FROM vehicule WHERE id=" + i);
		Vehicule result= (Vehicule) query.getSingleResult();
		return result;
	}
	
	/**
	 * Get all vehicules of a particular model
	 * @param v
	 * @return list
	 */
/*	public List getVehiculesByModel(String model){
		Query query = em.createQuery("SELECT * FROM vehicule WHERE modele =" + model);
		List results = (List) query.getResultList();
		return results;
	}
	
	/**
	 * Get all vehicules of a particular price
	 * @param float
	 * @return list
	 */
/*	public List getVehiculesByPrice(float price){
		Query query = em.createQuery("SELECT * FROM vehicule WHERE price =" + price);
		List results = (List) query.getResultList();
		return results;
	}
	
	/**
	 * Get all vehicules of a particular price range
	 * @param float
	 * @return list
	 */
/*	public List getVehiculesByPriceRange(float price1, float price2){
		Query query = em.createQuery("SELECT * FROM vehicule WHERE price BETWEEN " + price1 + " AND " + price2);
		List results = (List) query.getResultList();
		return results;
	}
	
	/**
	 * Get all vehicles that are available 
	 * @param
	 * @return list
	 */
	/*	public List getVehiculesDisponible(){
		Query query = em.createQuery("SELECT * FROM vehicule WHERE disponibilite IS NOT NULL");
		List results = (List) query.getResultList();
		return results;
	} */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
				
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    Query q = em.createQuery("select v from Vehicule v");
	    List<Vehicule> vehiculeList = q.getResultList();
	    
	    for (Vehicule vehicule : vehiculeList) {
	      out.println("Vehicule: "+vehicule.getMarque()+" : "+vehicule.getModele()+" : " +vehicule.getCouleur());
	    }
	    
	    //viewVehiculeByID();
	    out.println("No de vehicule dans le DB: " + vehiculeList.size());
	    request.setAttribute("Vehicules", vehiculeList);
		
		RequestDispatcher dispatcher = getServletContext().
		getRequestDispatcher("/Vehicules.jsp"); 
		dispatcher.forward(request, response);
	  }
	
	
	public static void viewVehiculeByID(){
		  factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		  EntityManager em = factory.createEntityManager();		  
		  Query q = em.createQuery( "SELECT v FROM Vehicule v WHERE v.id = '3'");
		  Vehicule v = (Vehicule)q.getSingleResult();		 
		  System.out.println("Vehicule: " + v.getMarque()+" : "+v.getModele()+" : "+v.getCouleur());
		  
	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str=request.getParameter("SearchTxt");
		System.out.println(str);
		PrintWriter out = response.getWriter();
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    Query q = em.createQuery("select v from Vehicule v where v.modele like '%"+str+"%'");
	    List<Vehicule> vehiculeList = q.getResultList();
	    
	    for (Vehicule vehicule : vehiculeList) {
	      out.println("Vehicule: "+vehicule.getMarque()+" : "+vehicule.getModele()+" : " +vehicule.getCouleur());
	    }
	    
	    //viewVehiculeByID();
	    out.println("No de vehicule dans le DB: " + vehiculeList.size());
	    request.setAttribute("Vehicules", vehiculeList);
		
		RequestDispatcher dispatcher = getServletContext().
		getRequestDispatcher("/Vehicules.jsp"); 
		dispatcher.forward(request, response);
	}
}
