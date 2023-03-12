package exe20221109inputUtente;

import utilita.array.Vettore;
import utilita.input.Tastiera;

public class VettorePotenza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a, b, c;
		a = new int[15];
		b = new int[15];
		c = new int[15];
		for (int i=0; i<15; i++) {
			System.out.print("inserisci a["+i+"]: ");
			a[i]=Tastiera.readInt();
			b[i]= a[i]*a[i];
			c[i]= b[i]*a[i];
		}
		System.out.print("a: ");
		Vettore.stampa(a);
		System.out.print("b: ");
		Vettore.stampa(b);
		System.out.print("c: ");
		Vettore.stampa(c);
		

	}

}
