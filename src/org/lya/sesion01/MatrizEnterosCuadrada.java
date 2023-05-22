package org.lya.sesion01;

public class MatrizEnterosCuadrada {
   
	private int[][] matriz;
	
	//Lo pimero de todo ser� implentar las construcciones de las matrices
	//Para ello, crearems una matriz con valores aleatorios comprendidos entre el 0 y 10

	public  MatrizEnterosCuadrada(int numeroFilasCol) {
		int N = 51;
		matriz = new int [numeroFilasCol][numeroFilasCol];
		for (int  i= 0; i <matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.random()*N;
			}
		}
	}
	
	public  MatrizEnterosCuadrada(int[][]matriz) {
		this.matriz = new int[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				this.matriz[i][j] = matriz [i][j];
			}
		}
	//DECLARO CLASES
	}
public int [][] getMatriz() {
	return matriz;
}
public int getNumeroDeFilas() {
	return matriz.length;
}
public int getNumeroDeColumnas() {
	return matriz[0].length;
}

//Ahora hago uso del m�todo de burbuja mejorada, que consiste en la ordenaci�n por m�todo de insercci�n public static void insercion

public static void burbujaMejora(int[]array) {
	boolean cambiado = true;
	int i = 1;
	
	while (cambiado && (i < array.length)) {
		cambiado = false;
		for (int j = 0; j < array.length - i; j++) {
			if (array[j] > (array[j + 1])) {
				
				int aux = array[j];
				array[j] = array [j +1];
				array[j + 1] = aux;
				cambiado = true;
			}
		}
		i++;
	}
}

public MatrizEnterosCuadrada matrizOrdenadaPorFilas(){

	int[][] nuevaMatriz = new int [matriz.length][matriz[0].length];
	for(int i = 0; i<matriz.length; i++) {
		for(int j=0;j<matriz.length;j++) {
			nuevaMatriz[i][j]= matriz[i][j];
		}
		
	}
	
	for(int i =0;i<matriz.length;i++) {
		burbujaMejora(nuevaMatriz[i]);
		}
	return new MatrizEnterosCuadrada(nuevaMatriz);
	}
public String toString() {
	String salida="Matriz:\n";
	for(int i =0;i<matriz.length;i++) {
		for(int j=0;j<matriz[i].length;j++) {
			if(j!=matriz[i].length-1) {
				salida +=matriz[i][j]+ "\t";
				
			}
			else {
				salida+=matriz[i][j];
			}
		}
		if(i!=matriz.length-1) {
			salida+="\n";
		}
		
	}
	return salida;
	
}
	}
