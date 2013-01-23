package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConnectionDB;

public class ReservationController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private ConnectionDB db;

	/**
	 * Constructor
	 */
	public ReservationController(){
		db = new ConnectionDB("LocationVoitureDB");
	}
	
	/**
	 * List all vehicles
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void listMyReservations(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List myReservations = db.get("Reservation", "clientID", "1");
		request.setAttribute("Reservations", myReservations);
		//redirect vers vue jsp (@param myReservations)
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/myReservations"); 
		dispatcher.forward(request, response);
		
	}
}