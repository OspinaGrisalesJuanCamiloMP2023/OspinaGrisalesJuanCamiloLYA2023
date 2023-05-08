package org.lya.sesion01;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposMatrizEnterosCuadada {
		
	 public static void main(String[] args) {
		
		 long[] tiempos = new long[10];
		
		 MatrizEnterosCuadrada matrizInicial;
		 @SuppressWarnings("unused")
		MatrizEnterosCuadrada matrizOrdenada;
		 int n = 32;
		
		 Scanner entrada = new Scanner(System.in);
		 do {
			 System.out.print("Dimension de la matriz (Potencia de 2): ");
			 n = entrada.nextInt();
		 } while (n % 2 != 0);
		
		 matrizInicial = new MatrizEnterosCuadrada(n);
		
		 for (int i = 0; i < 10; i++) {
		
			 long tiempoInicial = System.currentTimeMillis();
			 matrizOrdenada = matrizInicial.matrizOrdenadaPorFilas();
			 long tiempoFinal = System.currentTimeMillis();
			 tiempos[i] = tiempoFinal - tiempoInicial;
		 }
		
		 Arrays.sort(tiempos);
		
		 double tiempoMedio = calcularMedia(tiempos);
		 System.out.printf("Matriz de dimension n = %6d \nTiempo medio = %10.4f milisegundos", n, tiempoMedio);
		
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
