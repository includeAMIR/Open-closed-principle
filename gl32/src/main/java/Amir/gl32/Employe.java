package Amir.gl32;

import java.util.Calendar;

public class Employe extends RH{
	public int  year = Calendar.getInstance().get(Calendar.YEAR);	
	private int annee_debut;
	public Employe(String nom, String prenom, int annee_debut) {
		this.nom = nom;
		this.prenom = prenom;
		this.annee_debut = annee_debut;
	}
	@Override
	public double salaire() {
	return salaire+(year-this.annee_debut)*20;
	}
}
