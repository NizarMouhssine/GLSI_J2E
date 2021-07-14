

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import beans.Professeur;
/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public test() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		/*
		ArrayList<Professeur> p;
		try {
			p = Professeur.getProfesseurs();
			for(int i = 0 ; i < p.size() ;i++) {
				System.out.println(p.get(i).toString());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		*/
		
		/*
		Professeur p = new Professeur();
		p.setRefProfesseur("4");
		p.setNomProfesseur("Soulaimani");
		p.setPrenomProfesseur("Hajar");
		
		
		try {
			Professeur.modifierProfesseur("4", p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
		
		
		*/
		
		/*
		
		try {
			Professeur.supprimerProfesseur("A05");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		
	}
	
	
	
	
	public void insertProf() {
		Professeur p = new Professeur();
		p.setNomProfesseur("Mouhssine");
		p.setPrenomProfesseur("Nizar");
		p.setRefProfesseur("A05");

		try {
			p.ajoutProfesseur();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
