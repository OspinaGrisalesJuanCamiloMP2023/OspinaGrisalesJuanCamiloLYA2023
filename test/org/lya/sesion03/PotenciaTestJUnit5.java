package org.lya.sesion03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PotenciaTestJUnit5 {
	
	private Potencia solEXP;
	
	 @Before
	
	
	 @Test
	 public void testExponenCero() {
		 solEXP = new Potencia(4,0);
		 assertTrue(solEXP.exponenFuerzaBruta() == 1.0);
		 assertTrue(solEXP.exponenRecursivoDyV() == 1.0);
	 }
	
	 @Test
	 public void testExponenUno() {
		 solEXP = new Potencia(4,1);
		 assertTrue(solEXP.exponenFuerzaBruta() == 4 );
		 assertTrue(solEXP.exponenRecursivoDyV() == 4);
	 }
	
	 @Test
	 public void testExponenFuerzaBruta() {
		 solEXP = new Potencia(3,10);
		 assertTrue(solEXP.exponenFuerzaBruta() == 59049);
	 }
	
	 @Test
	 public void testExponenRecursivoDyVExponente() {
		 solEXP = new Potencia(3,10);
		 assertTrue(solEXP.exponenRecursivoDyV() == 59049);
	 }
	
	 @Test
	 public void testExponenTwoPowers() {
		 solEXP = new Potencia(2, 2);
	
		 for (int expon=2; expon<=30; expon++){
			 solEXP.setExponente(expon);
			 assertTrue(solEXP.exponenRecursivoDyV() == Math.pow(2, expon));
		 	
		 }
	 }

}
