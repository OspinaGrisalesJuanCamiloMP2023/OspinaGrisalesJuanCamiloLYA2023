package org.lya.sesion01;

public class MatrizEnterosCuadrada {
	
	private int[][] matriz;
	
	 public MatrizEnterosCuadrada(int numeroFilasCol) {
		 matriz = new int[numeroFilasCol][numeroFilasCol];
	
		 for (int i = 0; i < numeroFilasCol; i++) {
			 for (int j = 0; j < numeroFilasCol; j++) {
				 matriz[i][j] = (int) Math.random() * 81;
			 }
		 }
	 }
	
	 public MatrizEnterosCuadrada(int[][] m) {
		 matriz = new int[m[0].length][m.length];
	
		 for (int i = 0; i < m[0].length; i++) {
			 for (int j = 0; j < m.length; j++) {
				 matriz[i][j] = m[i][j];
			 }
		 }
	
	 }
	
	 public int[][] getMatriz() {
		 return matriz;
	 }
	
	 public int getNumeroDeFilas() {
		 return matriz.length;
	 }
	
	 public int getNumeroDeColumnas() {
	 return matriz[0].length;
	 }
	
	 public static void burbujaMejora(int[] array) {
		 boolean cambiado = true;
		 int i = 1;
	
		 while (cambiado && (i < array.length)) {
			 cambiado = false;
			 for (int j = 0; j < array.length - i; j++) {
				 if (array[j] > array[j + 1]) {
					 int aux = array[j];
					 array[j] = array[j + 1];
					 array[j + 1] = aux;
					 cambiado = true;
				 }
			 }
			 i++;
		 }
	 }
	
	 public MatrizEnterosCuadrada matrizOrdenadaPorFilas() {
	
		 int[][] matrizNueva = new int[matriz.length][matriz[0].length];
	
		 for (int i = 0; i < matriz.length; i++);
		 
		 		int i = 0 ;
				for (int j = 0; j < matriz[i].length; j++) {
		 			matrizNueva[i][j] = matriz[i][j];
		 		}
		  		 
		 for (int i1 = 0; i1 < matriz.length; i1++) {
			 burbujaMejora(matrizNueva[i1]);
		 }
	 
		 return new MatrizEnterosCuadrada(matrizNueva);
	 }
		 
	 public String toString() {
		  String salida = "Matriz:\n";
		  for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz[i].length; j++) {
				  if (j != matriz[i].length - 1)
					  salida += matriz[i][j] + "\t";
				  else
					  salida += matriz[i][j];
			  }
			  if (i != matriz.length - 1)
				  salida += "\n";
		  	}
		  	return salida;
		  
		 }

 }
