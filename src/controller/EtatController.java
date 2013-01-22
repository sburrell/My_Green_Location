package controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;

public class EtatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ServletOutputStream out = response.getOutputStream();
		
		Enumeration<String> dataNames = request.getParameterNames();
		while (dataNames.hasMoreElements()) {
			String dataName = dataNames.nextElement();
			String dataValue = request.getParameter(dataName);
			out.println(dataName + " : " + dataValue);
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}
}