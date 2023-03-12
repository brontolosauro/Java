package es001_libri;

import utilita.input.Tastiera;

public class GestioneLibri {

	Libro[] libreria;
	
	public void esegui() {
		
		libreria = new Libro[10];
		for (int i = 0; i < libreria.length; i++) {
			System.out.println("Dati libro " + (i+1));
			libreria[i] = inserisciLibro();
		}
		stampaLibreria(libreria);
		stampaLibri100(libreria);
	}
	
	public static Libro inserisciLibro() {
		Libro dummy = new Libro();
		System.out.print("Titolo: ");
		dummy.setTitolo(Tastiera.leggiString());
		System.out.print("Autore: ");
		dummy.setAutore(Tastiera.leggiString());
		System.out.print("Numero di pagine:");
		dummy.setNoPagine(Tastiera.leggiInt());
		return dummy;
	}
	
	public static void stampaLibreria(Libro[] libreria) {
		for (int i = 0; i < libreria.length; i++) {
			System.out.println("Libro "+(i+1)+": "+libreria[i].getTitolo()+", "
								+libreria[i].getAutore()+", "
								+libreria[i].getNoPagine()+".");
			}
	}
	
	public static void stampaLibri100(Libro[] libreria) {
		System.out.println("questi i libri che hanno più di 100 pagine: ");
		for (int i = 0; i < libreria.length; i++) {
			if (libreria[i].getNoPagine()>100) {
				System.out.println(libreria[i].getTitolo());
			}
		}
	}

}
