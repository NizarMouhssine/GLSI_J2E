package beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {


	
	String url = "jdbc:mysql://localhost:3306/test";
	String utilisateur = "root";
	String motDePasse = "";
	Connection connexion = null;
	
	
	public DB() throws ClassNotFoundException {
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
			connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

		} catch ( SQLException e ) {
			System.out.println("Database Class " + e.getMessage());
		} 
		
	}

}
