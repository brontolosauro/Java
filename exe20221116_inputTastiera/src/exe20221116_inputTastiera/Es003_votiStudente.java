package exe20221116_inputTastiera;

import utilita.input.Tastiera;

public class Es003_votiStudente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float voto;
		int nVoti=10;
		for (int i=0;i<nVoti;i++) {
			System.out.print("inserisci voto "+(i+1)+"/"+nVoti+": ");
			voto = Tastiera.leggiFloat();
			if (voto<6) {
				System.out.println("insufficiente");
			}else if (voto>=6 && voto<7) {
				System.out.println("sufficiente");
			}else {
				System.out.println("positivo");
			}
		}

	}

}
