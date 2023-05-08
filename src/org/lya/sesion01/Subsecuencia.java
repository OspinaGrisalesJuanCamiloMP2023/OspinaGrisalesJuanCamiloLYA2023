package org.lya.sesion01;

public class Subsecuencia {
	
	private int[] array;
	 private int primer;
	 private int ultimo;
	 private int suma;
	
	 public Subsecuencia(int numeroElementos) {
		 array = new int[numeroElementos];
	
		 for (int i = 0; i < numeroElementos; i++) {
			 array[i] = (int) (Math.random() * (80 - (-80 + 1) - 80));
		 }
	
	 }
	
	 public Subsecuencia(int[] arrayEnteros) {
		 this.array = new int[arrayEnteros.length];
	
		 for (int i = 0; i < arrayEnteros.length; i++) {
			 this.array[i] = arrayEnteros[i];
		 }
		 
	 }
	
	 public int getPrimer() {
		 return primer;
	 }
	
	 public int getUltimo() {
		 return ultimo;
	 }
	
	 public int getSuma() {
		 return suma;
	 }
	
	 public void SubsecuenciaFuerzaBruta() {
		 primer = 0;
		 ultimo = 0;
		 suma = 0;
	
		 for (int i = 0; i < array.length; i++) {
			 for (int j = i; j < array.length; j++) {
				 int sumaActual = 0;
				 for (int k = i; k <= j; k++) {
					 sumaActual += array[k];
				 }
				 if (sumaActual > suma) {
					 suma = sumaActual;
					 primer = i;
					 ultimo = j;
				 }
			 }
		 }
	 }
	 
	 public void SubsecuenciaMejorado() {
		  primer = 0;
		  ultimo = 0;
		  suma = 0;
		  
		  for (int i = 0; i < array.length; i++) {
			  for (int j = i; j < array.length; j++) {
				  int sumaActual = 0;
				  for (int k = i; k <= j; k++) 
					  sumaActual += array[j];
				  if (sumaActual > suma) {
					  suma = sumaActual;
					  primer = i;
					  ultimo = j;
				  }
			  	}
		  	}
		  }
		  
	  public void SubsecuenciaLineal() {
		   primer = 0;
		   ultimo = 0;
		   suma = 0;
		   int sumaActual = 0;
		  
		   for (int i = 0, j = 0; j < array.length; j++) {
			   sumaActual += array[j];
			   if (sumaActual > suma) {
				   suma = sumaActual;
				   primer = i;
				   ultimo = j;
			   } else if (sumaActual < 0) {
				   i = j + 1;
				   sumaActual = 0;
			   }
		   }
		 }  
	  }
		  
		 