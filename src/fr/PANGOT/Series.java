package fr.PANGOT;

public class Series {

	private String s_id;
	private String s_titre;
	private String s_realisateur;
	private int s_anneesortie;
	private int s_anneefin;
	private String s_acteurs;
	private String s_genre;
	
	
	public Series(String s_id, String s_titre, String s_realisateur, int s_anneesortie, int s_anneefin,
			String s_acteurs, String s_genre) {
		super();
		this.s_id = s_id;
		this.s_titre = s_titre;
		this.s_realisateur = s_realisateur;
		this.s_anneesortie = s_anneesortie;
		this.s_anneefin = s_anneefin;
		this.s_acteurs = s_acteurs;
		this.s_genre = s_genre;
	}


	public String getS_id() {
		return s_id;
	}


	public void setS_id(String s_id) {
		this.s_id = s_id;
	}


	public String getS_titre() {
		return s_titre;
	}


	public void setS_titre(String s_titre) {
		this.s_titre = s_titre;
	}


	public String getS_realisateur() {
		return s_realisateur;
	}


	public void setS_realisateur(String s_realisateur) {
		this.s_realisateur = s_realisateur;
	}


	public int getS_anneesortie() {
		return s_anneesortie;
	}


	public void setS_anneesortie(int s_anneesortie) {
		this.s_anneesortie = s_anneesortie;
	}


	public int getS_anneefin() {
		return s_anneefin;
	}


	public void setS_anneefin(int s_anneefin) {
		this.s_anneefin = s_anneefin;
	}


	public String getS_acteurs() {
		return s_acteurs;
	}


	public void setS_acteurs(String s_acteurs) {
		this.s_acteurs = s_acteurs;
	}


	public String getS_genre() {
		return s_genre;
	}


	public void setS_genre(String s_genre) {
		this.s_genre = s_genre;
	}
	
	
	
	
}
