package Amir.gl32;

import java.util.Calendar;

public class Employe {
	protected static String nom;
	protected static String prenom;
	protected double salaire;
	protected static int annee_debut;
	public int  year = Calendar.getInstance().get(Calendar.YEAR);

	public Employe(String nom, String prenom, int annee_debut) {
		this.nom = nom;
		this.prenom = prenom;
		this .annee_debut = annee_debut;
		this.salaire = salaire + (20 * (year - annee_debut));
	}
	
}
