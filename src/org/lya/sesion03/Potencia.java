package org.lya.sesion03;

public class Potencia {
	
	 private int base;
	 private int exponente;
	
	 public Potencia() {
		 this.base = 1;
		 this.exponente = 0;
	 }
	
	 public Potencia(int a, int n) {
		 if (a > 0 && n >= 0) {
			 this.base = a;
			 this.exponente = n;
		 }
	 }
	
	 public int getBase() {
		 return base;
	 }
	
	 public void setBase(int base) {
		 this.base = base;
	 }
	
	 public int getExponente() {
		 return exponente;
	 }
	
	 public void setExponente(int exponente) {
		 this.exponente = exponente;
	 }
	
	 public double exponenFuerzaBruta() {
		 double resultado = 1.0;
		 for (int i = 0; i < exponente; i++) {
			 resultado = base * resultado;
	 }
	
	return resultado;
	 }
	
	 public double exponenRecursivoDyV() {
		 if (this.exponente == 0)
			 return 1.0;
	
	 return exponenRecursivoDyV(this.base, this.exponente);
	 }
	
	 private double exponenRecursivoDyV(int a, int n) {
	
	 if (n == 1)
		 return a;
	
	 if (n % 2 == 0) {
		 double valor = exponenRecursivoDyV(a, n / 2);
		 return valor * valor;
	 } else
		 return (a * exponenRecursivoDyV(a, n - 1));

	 }
}
