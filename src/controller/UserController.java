package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConnectionDB;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnectionDB db;

	protected void view(String jspFile, HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		RequestDispatcher rd = request.getRequestDispatcher("/user/" + jspFile);
		rd.forward(request, response);
	}
	
	protected void authentification(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		response.getWriter().println("authentification");
	}
	
	protected void inscription(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		response.getWriter().println("inscription");
	}
	
	protected void myReservations(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		response.getWriter().println("myReservation");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		 response.getWriter().println("hsqfey");
		response.getWriter().println(request.getPathInfo());
		/*if (request.getPathInfo().substring(0, 12).equals("/inscription")) {
			inscription(request, response);
		} else if (request.getPathInfo().substring(0, 14).equals("/myReservation")) {
			myReservations(request, response);
		} */
		//view("authentification.jsp", request, response);
	}
}

