package Amir.gl32;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EntrepriseTest{
	
	@Test
	public void VendeurSalaire() {
		RH caissier = new Vendeur("Anakin","Skywalker", 2017, 40);
		assertTrue(caissier.salaire() ==1600);
	}
}