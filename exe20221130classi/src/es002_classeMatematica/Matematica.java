package es002_classeMatematica;

public class Matematica {
	
	public static int max(int a, int b) {
		int max;
		if (a>=b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static int min(int a, int b) {
		int min;
		if (a<b) {
			min = a;
		}else {
			min = b;
		}
		return min;
	}
	
	public static int fattoriale(int n) {
		if (n==0) {
			return (1);
		}else {
			return (n*Matematica.fattoriale(n-1));
		}
	}

}
