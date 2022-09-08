package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append("Bonsoir Mes amis");
		*/
		
		// recuperer une variable
		String message = "Notre page est dediée jumeaux";
		request.setAttribute("variable", message);
		
		// recuperer un parametre avec get 
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		 this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
