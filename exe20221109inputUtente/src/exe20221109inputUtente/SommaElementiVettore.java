package exe20221109inputUtente;

import utilita.array.Vettore;
import utilita.input.Tastiera;

public class SommaElementiVettore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("lunghezza vettore n: ");
		int n = Tastiera.readInt();
		int[] a = Vettore.generaInt(n);
		System.out.print("a: ");
		Vettore.stampa(a);
		int sommaPari=0, sommaDispari=0;
		for (int i : a) {
			if (i%2==0) {
				sommaPari += i;
			}
			else {
				sommaDispari += i;
			}
		}
		System.out.println("somma elementi pari = " +sommaPari);
		System.out.println("somma elementi dispari = " +sommaDispari);

	}

}
