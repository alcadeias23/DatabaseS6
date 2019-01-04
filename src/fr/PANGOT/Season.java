package fr.PANGOT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Season {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "activ";
	
	int s_number;
	String s_series_ID;
	int s_episode;
	int s_annee;
	
	
	public Season(int s_number, String s_series_ID, int s_episode, int s_annee) {
		super();
		this.s_number = s_number;
		this.s_series_ID = s_series_ID;
		this.s_episode = s_episode;
		this.s_annee = s_annee;
	}


	public int getS_number() {
		return s_number;
	}


	public void setS_number(int s_number) {
		this.s_number = s_number;
	}


	public String getS_series_ID() {
		return s_series_ID;
	}


	public void setS_series_ID(String s_series_ID) {
		this.s_series_ID = s_series_ID;
	}


	public int getS_episode() {
		return s_episode;
	}


	public void setS_episode(int s_episode) {
		this.s_episode = s_episode;
	}


	public int getS_annee() {
		return s_annee;
	}


	public void setS_annee(int s_annee) {
		this.s_annee = s_annee;
	}
	
	public static void ajouterEpisode (int nombresaison)
	{

		Connection connection;
		try {
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO episode (Sa_ID_serie) VALUE(?)";
			PreparedStatement preparateur = connection.prepareStatement(requete);
			for (int i=1; i<=nombresaison; i++)
			{
				preparateur.setString(1, "");
				preparateur.execute();
			}
			
			preparateur.close();
			connection.close();
						

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
