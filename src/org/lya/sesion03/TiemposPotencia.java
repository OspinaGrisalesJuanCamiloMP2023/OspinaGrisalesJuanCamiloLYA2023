package org.lya.sesion03;

import java.util.Arrays;

public class TiemposPotencia {
	
	public static void main(String[] args) {
		
		 long[] tiemposFuerzaBruta = new long[10];
		 long[] tiemposRecursivo = new long[10];
		
		 int base = 1;
		 int n = 32;
		
		 Potencia potencia = new Potencia(base, n);
		
		 System.out.println("Valor de exponente: " + n);
		
		 for (int i = 0; i < 10; i++) {
			 // FuerzaBruta
			 long tiempoInicial = System.nanoTime();
			 potencia.exponenFuerzaBruta();
			 long tiempoFinal = System.nanoTime();
			 tiemposFuerzaBruta[i] = tiempoFinal - tiempoInicial;
		
			 // Recursivo
			 tiempoInicial = System.nanoTime();
			 potencia.exponenRecursivoDyV();
			 tiempoFinal = System.nanoTime();
			 tiemposRecursivo[i] = tiempoFinal - tiempoInicial;
		 }
		
		 Arrays.sort(tiemposFuerzaBruta);
		 Arrays.sort(tiemposRecursivo);
		
		 double tiempoMedioFuerzaBruta = calcularMedia(tiemposFuerzaBruta);
		 double tiempoMedioRecursivo = calcularMedia(tiemposRecursivo);
		
		 System.out.println("Fuerza Bruta de base " + base + " y exponente " + n + "	calculado en "
		+ tiempoMedioFuerzaBruta + " nanosegundos");
		
		 System.out.println("Recursivo de base " + base + " y exponente " + n + " calculadoen " + tiempoMedioRecursivo
		 + " nanosegundos");
		
   }
		
		 public static double calcularMedia(long[] tiempo) {
		
			 double suma = 0;
			 for (int i = 0; i < tiempo.length - 1; i++) {
				 suma += tiempo[i];
		 }
		
		 double media = suma / (double) (tiempo.length - 1);
		 return media;
		 
		 }

}
