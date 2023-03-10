package exe20230803_ospedale;

import java.util.Vector;

import utilita.input.Tastiera;

public class GestioneOspedale {
	Vector<Persona> listaPersone = new Vector<Persona>();
	
	protected void esegui() {
		int scelta;
		do {
			stampaMenù();
			scelta = Tastiera.leggiInt();
			eseguiVoce(scelta);
		} while (scelta !=0 );
		
	}
	
	protected void stampaMenù() {
		System.out.println("1.    Inserisci Paziente");
		System.out.println("2.    Inserisci Medico");
		System.out.println("3.    Visualizza pazienti");
		System.out.println("4.    Visualizza medici");
		System.out.println("5.    Visualizza tutto");
		System.out.println("6.    Elimina medico [inserendo matricola]");
		System.out.println("7.    Elimina paziente [inserendo matricola]");
		System.out.println("8.    Cerca medico per specializzazione");
		System.out.println("9.    Cerca paziente per patologia");
		System.out.println("0.    Fine");
		
	}
	
	protected void eseguiVoce(int scelta) {
		switch (scelta) {
		case 1:
			System.out.println("nome: ");
			String nomeString = Tastiera.leggiString();
			System.out.println("cognome: ");
			String cognomeString = Tastiera.leggiString();
			System.out.println("patologia: ");
			String patString = Tastiera.leggiString();
			Paziente p = new Paziente(nomeString, cognomeString, patString);
			System.out.println("paziente inserito con matricola: " + p.getMatricola());
			listaPersone.add(p);
			break;
		case 2:
			System.out.println("nome: ");
			String nomeMedString = Tastiera.leggiString();
			System.out.println("cognome: ");
			String cognomeMedString = Tastiera.leggiString();
			System.out.println("specialità: ");
			String specString = Tastiera.leggiString();
			Medico med = new Medico(nomeMedString, cognomeMedString, specString);
			System.out.println("medico inserito con matricola: " + med.getMatricola());
			listaPersone.add(med);
			break;
		case 3:
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Paziente) {
					System.out.println(dummyPersona.toString());
				}
			}
			break;
		case 4:
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Medico) {
					System.out.println(dummyPersona.toString());
				}
			}
			break;
		case 5:
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Paziente) {
					System.out.println(dummyPersona.toString());
				}else if (dummyPersona instanceof Medico) {
					System.out.println(dummyPersona.toString());
				}
			}
			break;
		case 6:
			Boolean trovato = false;
			int index=listaPersone.capacity()+1;
			System.out.println("matricola medico: ");
			int matricola = Tastiera.leggiInt();
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Medico) {
					if (dummyPersona.matricola == matricola) {
						index = listaPersone.indexOf(dummyPersona);						
						trovato=true;
					}
				}
			}
			if(trovato) {
				listaPersone.remove(index);
			}else {
				System.out.println("non risultano medici con matricola: " + matricola);
			}
			break;
		case 7:
			trovato = false;
			index=listaPersone.capacity()+1;
			System.out.println("matricola paziente: ");
			matricola = Tastiera.leggiInt();
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Paziente) {
					if (dummyPersona.matricola == matricola) {
						index = listaPersone.indexOf(dummyPersona);
						trovato = true;
					}
				}
			}
			if(trovato) {
				listaPersone.remove(index);
			}else {
				System.out.println("non risultano pazienti con matricola: " + matricola);
			}
			break;
		case 8:
			System.out.println("cerca medico specialista: ");
			specString = Tastiera.leggiString();
			trovato = false;
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Medico) {
					if (specString.equalsIgnoreCase(((Medico) dummyPersona).getSpecialità())) {
						System.out.println(dummyPersona.toString());
						trovato = true;
					}
				}
			}
			if (!trovato) {
				System.out.println("non risultano medici con la specializzazione inserita");
			}
			break;
		case 9:
			System.out.println("cerca paziente affetto da: ");
			patString = Tastiera.leggiString();
			trovato = false;
			for (Persona dummyPersona : listaPersone) {
				if (dummyPersona instanceof Paziente) {
					if (patString.equalsIgnoreCase(((Paziente) dummyPersona).getPatologia())) {
						System.out.println(dummyPersona.toString());
						trovato = true;
					}
				}
			}
			if (!trovato) {
				System.out.println("non risultano pazienti affetti dalla patologia inserita");
			}
			break;
		case 0:
			System.out.println("programma terminato con successo");
			break;
		default:
			System.out.println(scelta + " è una opzione non valida. Ritenta.");
			break;
		}
	}
}
