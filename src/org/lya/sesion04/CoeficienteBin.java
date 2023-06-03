package org.lya.sesion04;

public class CoeficienteBin {
	
	private int cbN;
	 private int cbK;
	
	 public CoeficienteBin(int n, int k) {
		 if (n < k)
			 throw new IllegalArgumentException("El valor N no puede ser menor que el valor K");
		 cbN = n;
		 cbK = k;
	 }
	
	 public int getN() {
		 return cbN;
	 }
	
	 public void setN(int cbN) {
		 this.cbN = cbN;
	 }
	
	 public int getK() {
		 return cbK;
	 }
	
	 public void setK(int cbK) {
		 this.cbK = cbK;
	 }
	
	 public int coefBinomialRecursivo() {
		 if ((this.cbK > this.cbN) || (this.cbK < 0))
			 return 0;
	
		 return coefBinomialRecursivo(this.cbN, this.cbK);
	
	 }
	
	 public int coefBinomialRecursivo(int n, int k) {
		 if (k == 0 || k == n)
			 return 1;
		 if (n == 0)
			 return 0;
		 return coefBinomialRecursivo(n - 1, k - 1) + coefBinomialRecursivo(n - 1, k);
	 }
	
	 public int coefBinomialProgDinam() {
		 int n;
		 int k;
	
	 int[][] matriz = new int[cbN + 1][cbK + 1];
	
	 for (n = 0; n <= cbN; n++) {
		 matriz[n][0] = 1;
	 }
	
	 for (k = 1; k <= cbK; k++) {
		 matriz[0][k] = 0;
	 }
	
	 for (n = 1; n <= cbN; n++) {
		 for (k = 1; k <= cbK; k++) {
			 matriz[n][k] = matriz[n - 1][k - 1] + matriz[n-1][k];
		 }
	 }

	 return matriz[cbN][cbK];
	 
	 }

}
