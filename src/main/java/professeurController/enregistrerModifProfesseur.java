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
 * Servlet implementation class enregistrerModifProfesseur
 */
@WebServlet("/enregistrerModifProfesseur")
public class enregistrerModifProfesseur extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public enregistrerModifProfesseur() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
		
		String refProf = request.getParameter("refProfesseur");
		try {
			Professeur.modifierProfesseur(refProf,p);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher( "/listeProfesseurs" ).forward( request, response );
		
		
	}

}
