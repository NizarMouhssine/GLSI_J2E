package beans;
import com.mysql.*;
import java.sql.*;
import java.util.ArrayList;

public class Professeur {
	
	
	
	private String nomProfesseur;
	private String prenomProfesseur;
	private String refProfesseur;
	
	
	public Professeur() {
		// TODO Auto-generated constructor stub
	}




	public String getNomProfesseur() {
		return nomProfesseur;
	}



	public void setNomProfesseur(String nomProfesseur) {
		this.nomProfesseur = nomProfesseur;
	}



	public String getPrenomProfesseur() {
		return prenomProfesseur;
	}



	public void setPrenomProfesseur(String prenomProfesseur) {
		this.prenomProfesseur = prenomProfesseur;
	}
	
	
	
	
	public String getRefProfesseur() {
		return refProfesseur;
	}




	public void setRefProfesseur(String refProfesseur) {
		this.refProfesseur = refProfesseur;
	}




	public void ajoutProfesseur() throws ClassNotFoundException, SQLException  {
		DB db = new DB();
		String query = "INSERT INTO `phpmyadmin`.`professeur` (`refProfesseur`, `nom`, `prenom`) VALUES (?, ?, ?)";
	    PreparedStatement preparedStmt = db.connexion.prepareStatement(query);
	    preparedStmt.setString(1, this.refProfesseur);
	    preparedStmt.setString(2, this.nomProfesseur);
	    preparedStmt.setString(3, this.prenomProfesseur);	
	    preparedStmt.executeUpdate();
	    db.connexion.close();
	}
	
	
	public static void supprimerProfesseur(String refProf) throws SQLException, ClassNotFoundException  {
		DB db = new DB();
		String query = "DELETE FROM `phpmyadmin`.`professeur` WHERE (`refProfesseur` = ?);";
	    PreparedStatement preparedStmt = db.connexion.prepareStatement(query);
	    preparedStmt.setString(1, refProf);
	    preparedStmt.executeUpdate();
	    db.connexion.close();
	}
	
	
	public static Professeur getProfesseur(String refProfesseur) throws ClassNotFoundException, SQLException {
		DB db = new DB();
		Professeur p = new Professeur();
		String query = "SELECT * FROM phpmyadmin.professeur WHERE refProfesseur =  ? ;";
		PreparedStatement ps = db.connexion.prepareStatement(query);
		ps.setString(1, refProfesseur);
		ResultSet rs = ps.executeQuery(); 
		
		while (rs.next()) { 
			p.setRefProfesseur(rs.getString(1));
			p.setNomProfesseur(rs.getString(2));
			p.setPrenomProfesseur(rs.getString(3));
		}
		rs.close();
		ps.close();
		db.connexion.close();
		return p;
	}
	
	
	
	public static void modifierProfesseur(String refProfesseur , Professeur newProf) throws SQLException, ClassNotFoundException {
		DB db = new DB();
		String query = "UPDATE `phpmyadmin`.`professeur` SET `refProfesseur` = ?, `nom` = ?, `prenom` = ? WHERE (`refProfesseur` = ?);";
	    PreparedStatement preparedStmt = db.connexion.prepareStatement(query);
	    preparedStmt.setString(1, newProf.refProfesseur);
	    preparedStmt.setString(2, newProf.nomProfesseur);
	    preparedStmt.setString(3, newProf.prenomProfesseur);
	    preparedStmt.setString(4, refProfesseur);
	    System.out.print("Update Prepared");
	    preparedStmt.executeUpdate();
	    System.out.print("Update Exectured -> " + preparedStmt.toString());
	    db.connexion.close();
	}
	
	
	public static ArrayList<Professeur> getProfesseurs() throws ClassNotFoundException, SQLException {
		ArrayList<Professeur> listeProfesseurs = new ArrayList<Professeur>();
		DB db = new DB();
		String query = "SELECT * FROM phpmyadmin.professeur;";
	    Statement st = db.connexion.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    while(rs.next()) {
	    	Professeur p = new Professeur();
	    	p.setRefProfesseur(rs.getString(1));
	    	p.setNomProfesseur(rs.getString(2));
	    	p.setPrenomProfesseur(rs.getString(3));
	    	System.out.println("From Method " + p.toString());
	    	listeProfesseurs.add(p);
	    }
		return listeProfesseurs;
		
	}


	public static ArrayList<String> getProfesseursNoms() throws ClassNotFoundException, SQLException {
		ArrayList<Professeur> listeProfesseurs = getProfesseurs();
		ArrayList<String> noms = new ArrayList<String>();
		for(Professeur p : listeProfesseurs) {
			noms.add(p.getNomProfesseur());
		}
	return noms;
	}

	@Override
	public String toString() {
		return "Professeur [nomProfesseur=" + nomProfesseur + ", prenomProfesseur=" + prenomProfesseur
				+ ", refProfesseur=" + refProfesseur + "]";
	}

	
	
	
	
}
