package professeurController;


import java.io.IOException;
import java.sql.SQLException;

import beans.Professeur;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ajouterProfesseur
 */
@WebServlet("/ajouterProfesseur")
public class ajouterProfesseur extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ajouterProfesseur() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Professeur p = new Professeur();
		p.setRefProfesseur(request.getParameter("refProfesseur"));
		p.setNomProfesseur(request.getParameter("nomProfesseur"));
		p.setPrenomProfesseur(request.getParameter("prenomProfesseur"));
		
		
		
		
				try {
					p.ajoutProfesseur();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					request.setAttribute( "messageErreur", "Impossible d'ajouter le professeur " + p.getNomProfesseur() + " , D�tails : " + e.getMessage());
					this.getServletContext().getRequestDispatcher( "/pageErreur.jsp" ).forward( request, response );

				}
			
	
		this.getServletContext().getRequestDispatcher( "/listeProfesseurs" ).forward( request, response );
	}

}