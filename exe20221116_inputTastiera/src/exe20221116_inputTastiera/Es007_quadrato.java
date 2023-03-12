package exe20221116_inputTastiera;

import utilita.input.Tastiera;

public class Es007_quadrato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lato;
		System.out.print("dimensione lato: ");
		lato = Tastiera.leggiInt();
		char carattereStamapa;
		System.out.print("carattere da stampare: ");
		carattereStamapa = Tastiera.leggiChar();
		String riempimento;
		System.out.print("il quadrato deve essere pieno?[s/N]: ");
		riempimento = Tastiera.leggiString();
		switch (riempimento) {
		case "s": case "S": {
			for (int i=0; i<lato;i++) {
				for (int j=0; j<lato-1; j++) {
					System.out.print(carattereStamapa);
				}
				System.out.println(carattereStamapa);
			}
			break;
			
		}
		default:
			for (int i=0; i<lato;i++) {
				if (i==0 || i==lato-1) {
					for (int j=0; j<lato-1; j++) {
						System.out.print(carattereStamapa);
					}
					System.out.println(carattereStamapa);
				}else {
					for (int j=0; j<lato; j++) {
						if (j==0) {
							System.out.print(carattereStamapa);
						}else if (j==(lato-1)) {
							System.out.println(carattereStamapa);
						}else {
							System.out.print(" ");
						}						
					}				
				}				
			}
		
		}
	}

}
