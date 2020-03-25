package Amir.gl32;

public class Vendeur extends Employe {
	private double commission_vente;
	public Vendeur(double commission_vente) {
		super(nom,prenom,annee_debut);
		this.commission_vente = commission_vente;
	}

}
