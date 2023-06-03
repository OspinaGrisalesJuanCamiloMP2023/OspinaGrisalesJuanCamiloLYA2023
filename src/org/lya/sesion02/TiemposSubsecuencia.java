package org.lya.sesion02;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposSubsecuencia {
	
	public static void main(String[] args) {
		
		 long[] tiemposFuerzaBruta = new long[10];
		 long[] tiemposMejorado = new long[10];
		 long[] tiemposLineal = new long[10];
		 int n = 32;
		
		 Scanner entrada = new Scanner(System.in);
		 do {
			 System.out.print("Dimension del array (Potencia de 2): ");
			 n = entrada.nextInt();
		 } while (n % 2 != 0);
		
		 Subsecuencia array = new Subsecuencia(n);
		 System.out.println("Array de " + n + " elementos");
		
		 for (int i = 0; i < 10; i++) {
			 // FuerzaBruta
			 long tiempoInicial = System.nanoTime();
			 array.SubsecuenciaFuerzaBruta();
			 long tiempoFinal = System.nanoTime();
			 tiemposFuerzaBruta[i] = tiempoFinal - tiempoInicial;
		
			 // Mejorado
			 tiempoInicial = System.nanoTime();
			 array.SubsecuenciaMejorado();
			 tiempoFinal = System.nanoTime();
			 tiemposMejorado[i] = tiempoFinal - tiempoInicial;
		
			 // Lineal
			 tiempoInicial = System.nanoTime();
			 array.SubsecuenciaLineal();
			 tiempoFinal = System.nanoTime();
			 tiemposLineal[i] = tiempoFinal - tiempoInicial;
		}
		
		 Arrays.sort(tiemposFuerzaBruta);
		 Arrays.sort(tiemposMejorado);
		 Arrays.sort(tiemposLineal);
		
		 double tiempoMedioFuerzaBruta = calcularMedia(tiemposFuerzaBruta);
		 double tiempoMedioMejorado = calcularMedia(tiemposMejorado);
		 double tiempoMedioLineal = calcularMedia(tiemposLineal);
		
		 System.out.printf("Tiempo medio Fuerza Bruta = %10.4f nanosegundos \t Tiempo medio Mejorado = %10.4f nanosegundos \t Tiempo medio Lineal = %10.4f nanosegundos \t",  tiempoMedioFuerzaBruta, tiempoMedioMejorado, tiempoMedioLineal);
		
		 entrada.close();
		
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
		
		

