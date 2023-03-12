package exe20221109inputUtente;

import utilita.array.Vettore;
import utilita.inTastiera.InTastiera;

public class MassimoMinimoMedia10_rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeriUtente;
		numeriUtente = new int[10];
		for (int i=0; i<numeriUtente.length; i++) {
			System.out.print("inserisci un numero: ");
			numeriUtente[i] = InTastiera.readInt();
		}
		Vettore.stampa(numeriUtente);
		System.out.println("valore massimo: "+Vettore.massimo(numeriUtente));
		System.out.println("valore minimo: "+Vettore.minimo(numeriUtente));
		System.out.println("media elementi: "+Vettore.media(numeriUtente));

	}

}
