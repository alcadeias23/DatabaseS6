package fr.PANGOT;

public class Realisateur {

	private String rea_id;
	private String rea_nom;
	private String rea_prenom;
	
	public Realisateur(String rea_id, String rea_nom, String rea_prenom) {
		super();
		this.rea_id = rea_id;
		this.rea_nom = rea_nom;
		this.rea_prenom = rea_prenom;
	}

	public String getRea_id() {
		return rea_id;
	}

	public void setRea_id(String rea_id) {
		this.rea_id = rea_id;
	}

	public String getRea_nom() {
		return rea_nom;
	}

	public void setRea_nom(String rea_nom) {
		this.rea_nom = rea_nom;
	}

	public String getRea_prenom() {
		return rea_prenom;
	}

	public void setRea_prenom(String rea_prenom) {
		this.rea_prenom = rea_prenom;
	}

	
	
	
	
	
	
}

