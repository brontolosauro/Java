package exe20230301_scuola;

import java.util.Iterator;
import java.util.Vector;
import utilita.input.Tastiera;

public class GestioneArchivioScolastico {
	/**
	 * L’applicazione prevede un menù che da la possibilità di:
	 * -inserire docente
	 * -visualizzare docenti
	 * -inserire studenti
	 * -visualizzare studenti
	 * -stampare a video il numero di studenti e di docenti
	 * 	presenti nella scuola
	 * -stampare a video l'ammontare del reddito lordo annuo di un 
	 * 	docente
	 * -visualizzare tutto
	 * -esci
	 */
	
	private Vector<Persona> personaleScolastico = new Vector<Persona>();
	
	public void esegui() {
		int scelta;
		do {
			stampaMenù();
			scelta = Tastiera.leggiInt();
			eseguiOpzioneMenù(scelta);
			
		} while (scelta != 0);
	}
	
	public void stampaMenù() {
		System.out.println("1 -- inserisci docente");
		System.out.println("2 -- visualizza docenti");
		System.out.println("3 -- inserisci studente");
		System.out.println("4 -- visualizza studenti");
		System.out.println("5 -- stampa numero studenti e numero docenti");
		System.out.println("6 -- stampa reddito annuo docente");
		System.out.println("7 -- stampa personale scolastico");
		System.out.println("0 -- esci dal programma");
		
	}
	
	public void eseguiOpzioneMenù(int scelta) {
		switch (scelta) {
		case 1: {
			System.out.print("nome: ");
			String nomeString = Tastiera.leggiString();
			System.out.print("cognome: ");
			String cognomeString = Tastiera.leggiString();
			System.out.print("materia: ");
			String materiaString = Tastiera.leggiString();
			System.out.print("stipendio: ");
			double stipendio = Tastiera.leggiDouble();
			Docente prof = new Docente(nomeString, cognomeString, materiaString, stipendio);
			personaleScolastico.add(prof);
			break;
		}
		case 2: {
			for (Persona persona : personaleScolastico) {
				if (persona instanceof Docente) {
					//System.out.println(((Docente) persona).toString());
					System.out.println(persona.toString());
				}
			}
			break;
		}
		case 3: {
			System.out.print("nome: ");
			String nomeString = Tastiera.leggiString();
			System.out.print("cognome: ");
			String cognomeString = Tastiera.leggiString();
			System.out.print("matricola: ");
			String matricolaString = Tastiera.leggiString();
			System.out.print("voto medio: ");
			double votoMedio = Tastiera.leggiDouble();
			Studente studente = new Studente(nomeString, cognomeString, matricolaString, votoMedio);
			personaleScolastico.add(studente);
			break;
		}
		case 4: {
			for (Persona persona : personaleScolastico) {
				if (persona instanceof Studente) {
					//System.out.println(((Studente) persona).toString());
					System.out.println(persona.toString());
				}
			}
			break;
		}
		case 5: {
			int prof=0, stud=0;
			for (Persona persona : personaleScolastico) {
				if (persona instanceof Docente) {
					prof++;
				} else if (persona instanceof Studente) {
					stud++;
				}
			}
			System.out.println("Totale studenti = " + stud );
			System.out.println("Totale professori = " + prof);
			break;
		}
		case 6: {
			double stipendio=0;
			System.out.print("nome: ");
			String nomeString = Tastiera.leggiString();
			System.out.print("cognome: ");
			String cognomeString = Tastiera.leggiString();
			Docente prof = new Docente(nomeString, cognomeString);
			for (Persona persona : personaleScolastico) {
				if (persona instanceof Docente) {
					if (persona.equals(prof)) {
						 stipendio = ((Docente) persona).getStipendio();
					}
				}
			}
			double stipendioAnnuo = stipendio * 12;
			System.out.println("reddito annuo = " + stipendioAnnuo);
			break;
		}
		case 7: {
			for (Persona persona : personaleScolastico) {
				if (persona instanceof Docente) {
					System.out.println(((Docente) persona).toString());
				}else if (persona instanceof Studente) {
					System.out.println(((Studente) persona).toString());
				}
			}
			break;
		}
		case 0: {
			System.out.println("Programma terminato con successo.");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + scelta);
		}
	}

}
