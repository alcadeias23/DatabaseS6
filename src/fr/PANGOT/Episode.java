package fr.PANGOT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Episode {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "activ";
	
	private int e_number;
	private String e_season;
	private boolean e_vu;
	private Date e_temps;
	
	public Episode(int e_number, String e_season, boolean e_vu, Date e_temps) {
		super();
		this.e_number = e_number;
		this.e_season = e_season;
		this.e_vu = e_vu;
		this.e_temps = e_temps;
	}

	public int getE_number() {
		return e_number;
	}

	public void setE_number(int e_number) {
		this.e_number = e_number;
	}

	public String getE_season() {
		return e_season;
	}

	public void setE_season(String e_season) {
		this.e_season = e_season;
	}

	public boolean isE_vu() {
		return e_vu;
	}

	public void setE_vu(boolean e_vu) {
		this.e_vu = e_vu;
	}

	public Date getE_temps() {
		return e_temps;
	}

	public void setE_temps(Date e_temps) {
		this.e_temps = e_temps;
	}
	
	
	public static void ajouterEpisode (int nombreepisode)
	{

		Connection connection;
		try {
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO episode (ep_ID_serie, ep_ID_Saison, ep_temps, ep_vu) VALUE(?,?,?,?)";
			PreparedStatement preparateur = connection.prepareStatement(requete);
			for (int i=1; i<=nombreepisode; i++)
			{
				preparateur.setString(1, "");
				preparateur.setString(2, "");
				preparateur.setString(3, "");
				//episode non vu par defaut
				preparateur.setString(4, "0");
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
