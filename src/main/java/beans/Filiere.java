package beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Filiere {
	String refFiliere;
	String nomDepartement;
	String intuteleFiliere;
	Professeur responsableFiliere;
	
	
	
	public String getRefFiliere() {
		return refFiliere;
	}



	public void setRefFiliere(String refFiliere) {
		this.refFiliere = refFiliere;
	}



	public String getNomDepartement() {
		return nomDepartement;
	}



	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}



	public String getIntuteleFiliere() {
		return intuteleFiliere;
	}



	public void setIntuteleFiliere(String intuteleFiliere) {
		this.intuteleFiliere = intuteleFiliere;
	}



	public Professeur getResponsableFiliere() {
		return responsableFiliere;
	}



	public void setResponsableFiliere(Professeur responsableFiliere) {
		this.responsableFiliere = responsableFiliere;
	}



	public Filiere() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	@Override
	public String toString() {
		return "Filiere [refFiliere=" + refFiliere + ", nomDepartement=" + nomDepartement + ", intuteleFiliere="
				+ intuteleFiliere + ", responsableFiliere=" + responsableFiliere + "]";
	}



	public void ajoutFiliere() throws ClassNotFoundException, SQLException  {
		DB db = new DB();
		String query = "INSERT INTO `test`.`filiere` (`refFiliere`, `nomDepartement`, `intuteleFiliere`, `responsableFiliere`) VALUES (?, ?, ?, ?);";
	    PreparedStatement preparedStmt = db.connexion.prepareStatement(query);
	    preparedStmt.setString(1, this.refFiliere);
	    preparedStmt.setString(2, this.nomDepartement);
	    preparedStmt.setString(3, this.intuteleFiliere);
	    preparedStmt.setString(4, this.responsableFiliere.getRefProfesseur());	
	    preparedStmt.executeUpdate();
	    db.connexion.close();
	}
	
	public static Filiere getFiliere(String ref) throws ClassNotFoundException, SQLException {
		DB db = new DB();
		Filiere f = new Filiere();
		String query = "SELECT * FROM phpmyadmin.filiere WHERE refFiliere =  ? ;";
		PreparedStatement ps = db.connexion.prepareStatement(query);
		ps.setString(1, ref);
		ResultSet rs = ps.executeQuery(); 
		
		while (rs.next()) { 
			f.setRefFiliere(rs.getString(1));
			f.setNomDepartement(rs.getString(2));
			f.setIntuteleFiliere(rs.getString(3));
			f.setResponsableFiliere(Professeur.getProfesseur(rs.getString(4)));
		}
		rs.close();
		ps.close();
		db.connexion.close();
		return f;
	}
	
	
	public static ArrayList<Filiere> getFilieres() throws ClassNotFoundException, SQLException {
		ArrayList<Filiere> listeFilieres = new ArrayList<Filiere>();
		DB db = new DB();
		String query = "SELECT * FROM phpmyadmin.filiere;";
	    Statement st = db.connexion.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    while(rs.next()) {
	    	Filiere f = Filiere.getFiliere(rs.getString(1));
	    	listeFilieres.add(f);
	    }
		return listeFilieres;
		
	}
	
	
	public static void modifierFiliere(String ref , Filiere f) throws SQLException, ClassNotFoundException {
		DB db = new DB();
		String query = "UPDATE `phpmyadmin`.`filiere` SET `nomDepartement` = ?, `intuteleFiliere` = ?, `responsableFiliere` = ? WHERE (`refFiliere` = ?);";
	    PreparedStatement preparedStmt = db.connexion.prepareStatement(query);
	    preparedStmt.setString(1, f.nomDepartement);
	    preparedStmt.setString(2, f.intuteleFiliere);
	    preparedStmt.setString(3, f.responsableFiliere.getRefProfesseur());
	    preparedStmt.setString(4, ref);
	    System.out.println("Update Prepared");
	    preparedStmt.executeUpdate();
	    System.out.println("Update Exectured -> " + preparedStmt.toString());
	    db.connexion.close();
	}
	
	public static void supprimerFilierer(String ref) throws SQLException, ClassNotFoundException  {
		DB db = new DB();
		String query = "DELETE FROM `phpmyadmin`.`filiere` WHERE (`refFiliere` = ?);";
	    PreparedStatement preparedStmt = db.connexion.prepareStatement(query);
	    preparedStmt.setString(1, ref);
	    preparedStmt.executeUpdate();
	    db.connexion.close();
	}
	
	
}
