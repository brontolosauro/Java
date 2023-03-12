package exe20221102;


public class Trova50 {
	
	public static int[] generaVettore(int dim){
		int[] array;
		array = new int[dim];
		for (int i=0; i<dim; i++) {
			array[i] = (int) Math.rint(Math.random()*100);
		}
		return array;
	}
	
	public static void stampaVettore(int[] v) {
		int i;
		System.out.format("[");
		for (i=0; i<(v.length-1); i++) {
			System.out.format("%3d, ",v[i] );
		}
		System.out.format("%3d]%n", v[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v;
		boolean trovato = false;
		v = generaVettore(30);
		stampaVettore(v);
		for (int i=0; i<v.length; i++) {
			if (v[i]==50) {
				System.out.println("il vettore contiene il numero 50 nella cella di indice " + (i+1) +".");
				trovato = true;
			}
			
		}
		if (!trovato) {
			System.out.println("il vettore non contiene il numero 50.");
		}
		

	}

}
