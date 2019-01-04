package fr.PANGOT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Acteur {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "activ";
	
	private String a_id;
	private String a_nom;
	private String a_prenom;
	
	
	
	public Acteur(String a_id, String a_nom, String a_prenom) {
		super();
		this.a_id = a_id;
		this.a_nom = a_nom;
		this.a_prenom = a_prenom;
	}



	public String getA_id() {
		return a_id;
	}



	public void setA_id(String a_id) {
		this.a_id = a_id;
	}



	public String getA_nom() {
		return a_nom;
	}



	public void setA_nom(String a_nom) {
		this.a_nom = a_nom;
	}



	public String getA_prenom() {
		return a_prenom;
	}



	public void setA_prenom(String a_prenom) {
		this.a_prenom = a_prenom;
	}
	
	
	private static final void utiliserInsert() {
		try {
			Connection connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO Genre (G_type) VALUE (?)";
			PreparedStatement preparateur = connexion.prepareStatement(requete);
			preparateur.setString(1, "Drame");
			preparateur.execute();
			
			preparateur.setString(1, "Thriller");
			preparateur.execute();
			
			preparateur.setString(1, "Tragi-comique");
			preparateur.execute();
			
			preparateur.setString(1, "Comédie dramatique");
			preparateur.execute();
			
			preparateur.setString(1, "Médical");
			preparateur.execute();
						
			preparateur.setString(1, "Sitcom");
			preparateur.execute();
			
			
			preparateur.setString(1, "Fantastique");
			preparateur.execute();
			
			
			preparateur.setString(1, "Mystères");
			preparateur.execute();
			
			
			preparateur.setString(1, "Aventure");
			preparateur.execute();
			
			
			preparateur.setString(1, "Drame Historique");
			preparateur.execute();
			
			
			preparateur.setString(1, "Policier");
			preparateur.execute();
			
			
			preparateur.setString(1, "Action");
			preparateur.execute();
			
			
			preparateur.setString(1, "Science-Fiction");
			preparateur.execute();
			
			
			preparateur.setString(1, "Supernaturel");
			preparateur.execute();
			
			
			preparateur.setString(1, "Judiciaire");
			preparateur.execute();
			
			preparateur.setString(1, "Musical");
			preparateur.execute();
			
			preparateur.setString(1, "Horreur");
			preparateur.execute();
			
			preparateur.close();
			connexion.close();
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	
	

