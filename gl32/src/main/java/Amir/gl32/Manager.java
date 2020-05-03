package Amir.gl32;

import java.util.Calendar;

public class Manager  extends RH {
	private int nombre_subordonnee;
	private int annee_debut;
	public int  year = Calendar.getInstance().get(Calendar.YEAR);
	public Manager(String nom, String prenom, int annee_debut, int nombre_subordonnee){
		this.nom = nom;
		this.prenom = prenom;
		this.annee_debut = annee_debut;
		this.nombre_subordonnee = nombre_subordonnee;
	}
	@Override
	public double salaire() {
		return salaire+(year-this.annee_debut)*20+(100*nombre_subordonnee);
	}
}
