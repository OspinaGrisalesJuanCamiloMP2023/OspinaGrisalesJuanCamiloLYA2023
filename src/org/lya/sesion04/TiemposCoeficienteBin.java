package org.lya.sesion04;

import java.util.Arrays;

public class TiemposCoeficienteBin {
	
	public static void main(String[] args) {
		
	 int n = 20;
	
	 CoeficienteBin coeficiente = new CoeficienteBin(2 * n, n);
	 long tiemposRecursivo[] = new long[10];
	 long tiemposDinamico[] = new long[10];
	
	 for (int i = 0; i < 10; i++) {
		 // Recursivo
		 long tiempoInicial = System.nanoTime();
		 coeficiente.coefBinomialRecursivo();
		 long tiempoFinal = System.nanoTime();
		 tiemposRecursivo[i] = tiempoFinal - tiempoInicial;
	
		 // Dinamico
		 tiempoInicial = System.nanoTime();
		 coeficiente.coefBinomialProgDinam();
		 tiempoFinal = System.nanoTime();
		 tiemposDinamico[i] = tiempoFinal - tiempoInicial;
	 }
	
	 Arrays.sort(tiemposRecursivo);
	 Arrays.sort(tiemposDinamico);
	
	 double tiempoMedioRecursivo = calcularMedia(tiemposRecursivo);
	 double tiempoMedioDinamico = calcularMedia(tiemposDinamico);
	
	 System.out.println("Tamaño de n = " + n);
	 System.out.println("Tiempo recursivo = " + tiempoMedioRecursivo + " nanosegundos");
	 System.out.println("Tiempo dinamico = " + tiempoMedioDinamico + " nanosegundos");
	
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
		

