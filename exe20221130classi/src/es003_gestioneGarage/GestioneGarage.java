package es003_gestioneGarage;

import utilita.input.Tastiera;

public class GestioneGarage {
	
	//private static void aggiornaCarburanteRimanente(int scelta, float percorrenza) {
	//		
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO capire come rendere disponibili getter e setter in un metodo esterno
		Automobile a = new Automobile();
		a.setMarca("toyota");
		a.setModello("yaris");
		Automobile b = new Automobile();
		b.setMarca("wolkswagen");
		b.setModello("scirocco");
		
		//a.stampaAutomobile();
		//b.stampaAutomobile();
		boolean continua = true;
		int scelta;
		double percorrenza;
		String continuare;
		
		
		while (continua) {
			System.out.println("Quale auto hai utilizzato?");
			System.out.println("1)"+a.getMarca()+" "+a.getModello());
			System.out.println("2)"+b.getMarca()+" "+b.getModello());
			System.out.print("scelta: ");
			scelta = Tastiera.leggiInt();
			System.out.print("kilometri percorsi: ");
			percorrenza = Tastiera.leggiFloat();
			//aggiornaCarburanteRimanente(scelta, percorrenza);
			switch (scelta) {
			case 1: {
				a.setCarburanteRimanente(a.getCarburanteRimanente()-0.041*percorrenza);
				System.out.println("carburante rimanente "+a.getMarca()+" "+a.getModello()+": "+a.getCarburanteRimanente());
				if (a.getCarburanteRimanente()<=2.0) {
					System.out.println("effettuare rifornimento");
				}
				break;
			}
			case 2: {
				b.setCarburanteRimanente(b.getCarburanteRimanente()-0.064*percorrenza);
				System.out.println("carburante rimanente "+b.getMarca()+" "+b.getModello()+": "+b.getCarburanteRimanente());
				if (a.getCarburanteRimanente()<=2.0) {
					System.out.println("effettuare rifornimento");
				}
				break;
			}
			}
			System.out.print("continuare?[s/N]: ");
			continuare = Tastiera.leggiString();
			switch (continuare) {
			case "s": case "S": {
				continua = true;
				break;
			}
			default:
				continua = false;
				System.out.println("arrivederci!");
			}
		}
		
		
		
	}

}
