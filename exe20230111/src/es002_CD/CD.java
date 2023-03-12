package es002_CD;

import utilita.input.Tastiera;

public class CD {
	
	Canzone[] album = new Canzone[10];
	
	public void modificaTitolo(Canzone[] album) {
		System.out.print("modifica titolo della traccia no: ");
		int traccia = Tastiera.leggiInt();
		System.out.print("cambia \""+album[traccia].getTitolo()+"\" con: ");
		album[traccia].setTitolo(Tastiera.leggiString());
	}
	
	public void modificaDurata(Canzone[] album) {
		System.out.print("modifica durata della traccia no: ");
		int traccia = Tastiera.leggiInt();
		System.out.print("cambia \""+album[traccia].getDurataSecondi()+"\" con: ");
		album[traccia].setDurataSecondi(Tastiera.leggiInt());
	}
	
	public void durataCanzone(Canzone[] album) {
		System.out.print("titolo canzone: ");
		String titolo = Tastiera.leggiString();
		for (int i = 0; i < album.length; i++) {
			if (titolo == album[i].getTitolo()) {
				System.out.println("durata in secondi: "+album[i].getDurataSecondi());
			}else {
				System.out.println("la canzone non è presente.");
			}
		}
	}

}
