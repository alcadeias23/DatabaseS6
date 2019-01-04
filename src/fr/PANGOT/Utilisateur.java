package fr.PANGOT;

public class Utilisateur {

	private String u_pseudo;
	private String u_email;
	private String u_motdepasse;
	private String u_ID;
	
	public Utilisateur(String u_pseudo, String u_email, String u_motdepasse, String u_ID) {
		super();
		this.u_pseudo = u_pseudo;
		this.u_email = u_email;
		this.u_motdepasse = u_motdepasse;
		this.u_ID = u_ID;
	}

	public String getU_pseudo() {
		return u_pseudo;
	}

	public void setU_pseudo(String u_pseudo) {
		this.u_pseudo = u_pseudo;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_motdepasse() {
		return u_motdepasse;
	}

	public void setU_motdepasse(String u_motdepasse) {
		this.u_motdepasse = u_motdepasse;
	}

	public String getU_ID() {
		return u_ID;
	}

	public void setU_ID(String u_ID) {
		this.u_ID = u_ID;
	}
	
	
}

