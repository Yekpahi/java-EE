package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.octest.beans.Auteur;

/**
 * Servlet implementation class Accueil
 */
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Auteur auteur = new Auteur();
	        auteur.setPrenom("Mathieu");
	        auteur.setNom("Nebra");
	        auteur.setActif(true);
        
       
        request.setAttribute("auteur", auteur);
		
        //recuperer variable fullname
		String fullname = "Notre page est dediée jumeaux";
		request.setAttribute("fullname", fullname);
		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
