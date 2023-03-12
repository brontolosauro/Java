package exe20221109inputUtente;

import utilita.array.Vettore;
import utilita.input.Tastiera;

public class SommaComponentiVettori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v1, v2, vSomma;
		v1 = new int[10];
		v2 = new int[10];
		vSomma = new int[10];
		for (int i=0; i<10; i++) {
			System.out.print("inserisci v1["+i+"]: ");
			v1[i]=Tastiera.readInt();
			System.out.print("inserisci v2["+i+"]: ");
			v2[i]=Tastiera.readInt();
			vSomma[i]=v1[i]+v2[i];
		}
		System.out.print("v1: ");
		Vettore.stampa(v1);
		System.out.print("v2: ");
		Vettore.stampa(v2);
		System.out.print("v1+v2: ");
		Vettore.stampa(vSomma);

	}

}
