package Amir.gl32;

import java.util.Calendar;

public class Vendeur extends RH {
	public int  year = Calendar.getInstance().get(Calendar.YEAR);
	private double commission_vente;
	private int annee_debut;
	public Vendeur(String nom, String prenom, int annee_debut, double commission_vente) {
		this.nom = nom;
		this.prenom = prenom;
		this.annee_debut = annee_debut;
		this.commission_vente = commission_vente;
	}
	@Override
	public double salaire() {
		return salaire+(year-this.annee_debut)*20+commission_vente;
	}
}
