package utilita.array;

public class Vettore {
	
	public static int[] generaInt (int elementi) {
		int[] v = new int[elementi];
		for (int i=0; i<elementi; i++) {
			v[i] = (int) Math.rint(Math.random()*100);
		}
		return v;				
	}
	
	public static void stampa (int[] v) {
		int i;
		System.out.print("[");
		for (i=0; i<v.length-1; i++) {
			System.out.format("%3d, ", v[i]);
			}
		System.out.format("%3d]%n", v[i]);		
	}
	
	public static int massimo (int[] v) {
		int max = v[0];
		for (int i=0; i<v.length; i++) {
			if (v[i]>=max) {
				max = v[i];
			}
		}
		return max;
	}
	
	public static int minimo (int[] v) {
		int min = v[0];
		for (int i=0; i<v.length; i++) {
			if (v[i]<=min) {
				min = v[i];
			}
		}
		return min;
	}
	
	public static float media (int[] v) {
		float somma=0;
		float mean;
		for (int i=0; i<v.length; i++) {
			somma += v[i];
		}
		mean = somma / v.length;
		return mean;
	}
}
