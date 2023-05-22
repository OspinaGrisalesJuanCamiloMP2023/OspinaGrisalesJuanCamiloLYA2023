package org.lya.sesion01;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposMatrizEnterosCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array para tiempos de las 10 ejecuciones
		long[] tiempos = new long[10];
		
		//Matrices inicial y odenada
		MatrizEnterosCuadrada matInicial;
		MatrizEnterosCuadrada matOrdenada;
		int dimN= 32;
		
		
		//Leer el tama�o de una matriz
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("\n Dimension de la matriz(potencia de 2): ");
			dimN =entrada.nextInt();
			
		}while (dimN%2!=0);
		
		//Creamos la matriz
		matInicial= new MatrizEnterosCuadrada(dimN);
		
		//Repetimos 10 veces el experimento
		for(int i=0; i<10;i++) {

			long startTime = System.currentTimeMillis();
			matOrdenada= matInicial.matrizOrdenadaPorFilas();
			long endTime = System.currentTimeMillis();
			tiempos[i] = endTime-startTime;
		}
		Arrays.sort(tiempos); //El m�ximo estar� al final, no lo considero para la media
		
		double tiempoMedioEmpleado = calcularMedia(tiempos);
		System.out.printf("Matriz de dimension n = %6d \t Tiempo medio = %10.4f milisegundos", dimN, tiempoMedioEmpleado);   ;
	}
	
	public static double calcularMedia(long[] tiempo) {
		//C�lculo de la media de todos los elementos excepto el �ltimo.
		double suma =0.;
		for(int i=0; i<tiempo.length-1;i++) {
			suma+= tiempo[i];
		}
		
		double media=suma/(double)(tiempo.length-1);
		return media;
		
	}


}


