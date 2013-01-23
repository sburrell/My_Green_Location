package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConnectionDB;
import model.Vehicule;

public class VehiculeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private ConnectionDB db;

	/**
	 * Constructor
	 */
	public VehiculeController(){
		db = new ConnectionDB("LocationVoitureDB");
	}
	
	/**
	 * List all vehicles
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void listVehicles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//get all vehicles
		/* if(request.getMethod().equals("GET")){
			List myVehicules = db.getAll("vehicules");
		}else{
			// get vehicles by search
			String modeleStr = request.getParameter("ModeleTxt");
			String marqueStr = request.getParameter("MarqueTxt");
			String prixStr = request.getParameter("PrixTxt");
			PrintWriter out = response.getWriter();
			try { 
				int i = Integer.parseInt(prixStr); 
			} 
			catch (Exception e) { 
				prixStr="999999"; 
			}
			String query = "select v from Vehicule v " +
					"where lower(v.modele) like lower('%"+modeleStr+"%') " +
							"and lower(v.marque) like lower('%"+marqueStr+"%') " +
									"and v.prix<="+prixStr;
			List myVehicles = db.get(query);
		    request.setAttribute("Vehicules", myVehicles); 
		
		}*/
		//redirect vers vue jsp (@param myVehicles)
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list.jsp"); 
		dispatcher.forward(request, response);
		
	}
	
	/**
	 * Get a vehicule 
	 * @param : int id
	 */
	protected void viewVehiculeByID(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  if(request.getMethod().equals("POST")){
			  
		  }else
		  {
			  String VehicleID = request.getParameter("id");
			  Vehicule myVehicle = (Vehicule) db.get("Vehicule", "id", VehicleID).get(0);
			  request.setAttribute("myVehicle", myVehicle);
		  } 
		  RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vehicules/Details.jsp"); 
		  dispatcher.forward(request, response);
	  }
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Salut");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
