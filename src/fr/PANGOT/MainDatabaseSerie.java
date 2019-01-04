package fr.PANGOT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDatabaseSerie {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "activ";
	
	public static void main(String[] args)
	{
		utiliserInsertRealisateur();
		utiliserSelect();
		

	}

	private static final void utiliserSelect()
	{
		try {
			Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "SELECT * FROM realisateur";
			
			Statement executeur = connection.createStatement();
			ResultSet resultat = executeur.executeQuery(requete);
			
			while (resultat.next())
			{
				//System.out.println(resultat.toString());
				System.out.println(resultat.getString("rea_nom"));
			}
			
			resultat.close();
			executeur.close();
			connection.close();
						
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public static final void utiliserInsertRealisateur()
	{
		try
		{
			Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO realisateur (rea_nom, rea_prenom) VALUE(?,?)";
			PreparedStatement preparateur = connection.prepareStatement(requete);
			
			// grey's anatomy et how to get away with murder 1
			preparateur.setString(1, "Shonda");
			preparateur.setString(2, "Rhimes");
			preparateur.execute();
			// la case de papel 2
			preparateur.setString(1, "Pina");
			preparateur.setString(2, "Alex");
			preparateur.execute();
			// sex and the city 3 
			preparateur.setString(1, "Star");
			preparateur.setString(2, "Darren");
			preparateur.execute();
			// desperate housewifes 4
			preparateur.setString(1, "King");
			preparateur.setString(2, "Michael");
			preparateur.execute();
			//big bang theory 5
			preparateur.setString(1, "Cendrowsky");
			preparateur.setString(2, "Mark");
			preparateur.execute();
			//charmed 6
			preparateur.setString(1, "Burge");
			preparateur.setString(2, "Constance");
			preparateur.execute();
			// 13 reasons why 7
			preparateur.setString(1, "Yorkey");
			preparateur.setString(2, "Brian");
			preparateur.execute();
			//black sails 8
			preparateur.setString(1, "Levine");
			preparateur.setString(2, "Robert");
			preparateur.execute();
			//lucifer 9
			preparateur.setString(1, "Kapinos");
			preparateur.setString(2, "Tom");
			preparateur.execute();
			// gotham 10
			preparateur.setString(1, "Heller");
			preparateur.setString(2, "Bruno");
			preparateur.execute();
			// the last ship 11
			preparateur.setString(1, "Steinberg");
			preparateur.setString(2, "Hank");
			preparateur.execute();
			// outlander 12
			preparateur.setString(1, "Moore");
			preparateur.setString(2, "Ronald");
			preparateur.execute();
			// The originals 13
			preparateur.setString(1, "Plec");
			preparateur.setString(2, "Julie");
			preparateur.execute();
			//the 100 14
			preparateur.setString(1, "Rothenberg");
			preparateur.setString(2, "Jason");
			preparateur.execute();
			// the good doctor 15
			preparateur.setString(1, "Shore");
			preparateur.setString(2, "David");
			preparateur.execute();
			// game of thrones 16 
			preparateur.setString(1, "Benioff");
			preparateur.setString(2, "David");
			preparateur.execute();
			// downtown abbey 17
			preparateur.setString(1, "Fellowes");
			preparateur.setString(2, "Julian");
			preparateur.execute();
			// empire 18
			preparateur.setString(1, "Strong");
			preparateur.setString(2, "Danny");
			preparateur.execute();
			// Izombie 19
			preparateur.setString(1, "Thomas");
			preparateur.setString(2, "Rob");
			preparateur.execute();
			
			
			
			
			
			preparateur.close();
			connection.close();
						
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	// upate mysql.user set password=password(toto!" where user = 'toto' and host = '%';
	
}
