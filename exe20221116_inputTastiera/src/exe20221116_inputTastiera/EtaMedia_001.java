package exe20221116_inputTastiera;

import utilita.array.Vettore;
import utilita.input.Tastiera;

public class EtaMedia_001 {
	
	//private int[] eta;
	//private int nPersone=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] eta;
		int nPersone=3;
		eta = new int[nPersone];
		for (int i=0; i<nPersone; i++) {
			System.out.print("età persona "+(i+1)+"/"+nPersone+": ");
			eta[i]=Tastiera.leggiInt();
		}
		System.out.println("età media: "+Vettore.media(eta));		

	}

}
