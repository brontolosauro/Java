package exe20230201_uml1;

import java.util.Vector;

import utilita.input.Tastiera;

public class GestioneContravvenzioni {
	
	Vigile v;
	
	public  void esegui() {
		int scelta;
		do {
			menùPrincipale(); //mostra a video il primo menù
			scelta = Tastiera.leggiInt();
			opzioniPrincipali(scelta);	
			
		}while (scelta != 0);
		System.out.println("programma terminato con successo");
		
	}
	
	public void menùPrincipale() {
		System.out.println("---Gestione Contravvenzioni - Menù Principale---");
		System.out.println("1--Inserisci vigile");
		System.out.println("0--Esci dal programma.");
		
	}
	
	public void opzioniPrincipali(int scelta) {
		switch (scelta) {
		case 1:
			v = new Vigile();
			int sceltaVigile;
			do {
				menùVigile();
				sceltaVigile = Tastiera.leggiInt();
				opzioniMenùVigile(sceltaVigile);
			}while (sceltaVigile != 0);
			break;
		case 0:
			break;
		default:
			System.out.println("si è verificato un errore.");
			
		}		
			
	}
	
	public void menùVigile() {
		System.out.println("---Gestione contravvensioni - Vigile: " + v.getNome() + 
				" ---");
		System.out.println("1--inserisci contravvenzione");
		System.out.println("2--elimina contravvenzione");
		System.out.println("3--stampa dati");
		System.out.println("0--torna al menù principale");
		
	}
	
	public void opzioniMenùVigile(int scelta) {
		switch (scelta) {
		case 1: //inserisci contravvenzione
			v.effettuaContravvenzione();
			break;
		case 2: //elimina contravvenzione			
			eliminaContravvenzione();
			break;
		case 3: //stampa dati 
			System.out.println(v);
			break;
		case 0: //torna al menù principale
			break;
		default:
			System.out.println("si è verificato un errore");
		}
			
	}
	
	public void eliminaContravvenzione() {
		/*la richiesta è quella di fare la ricerca attraverso la targa;
		 * con la targa si effettua la ricerca e si stampano a video tutte le 
		 * ricorrenze;
		 * per eliminare la contravvenzione è richiesto l'id ovvero la posizione
		 * nel Vector della contravvenzione*/
		int sceltaContravvenzione;
		do  {
			menùEliminaContravvenzione();
			sceltaContravvenzione = Tastiera.leggiInt();
			opzioniMenùEliminaContravvenzione(sceltaContravvenzione);
		}while (sceltaContravvenzione != 0);
	}
	
	public void menùEliminaContravvenzione() {
		System.out.println("---Gestione Contravvenzione - Menù Elimina Contravvenzioni ---");
		System.out.println("1--Cerca contravvenzione");
		System.out.println("0--Torna al menù Vigile");
	}
	
	public void opzioniMenùEliminaContravvenzione(int scelta) {
		int idContravvenzione;
		Vector<Contravvenzione> listaContravvenzioniAppoggio = 
				new Vector<Contravvenzione>();
		listaContravvenzioniAppoggio = v.getListaContravvenzioni();	
		
		
		switch (scelta) {
		case 1:
			if (cercaContravvenzione()) {
				System.out.println("inserisci id contravvenzione da eliminare: ");
				idContravvenzione = Tastiera.leggiInt();
				listaContravvenzioniAppoggio.remove(idContravvenzione);
				v.setListaContravvenzioni(listaContravvenzioniAppoggio);				
			} else {
				System.out.println("nessuna corrispondenza per la targa inserita");
			}
			break;
		case 0:
			break;
		default:
			System.out.println("si è verificato un errore");
		}
	}
	
	public boolean cercaContravvenzione() {
		String targa;
		Vector<Contravvenzione> listaContravvenzioniAppoggio = 
				new Vector<Contravvenzione>();
		Contravvenzione contravvenzioneAppoggio = new Contravvenzione();
		Veicolo veicoloAppoggio = new Veicolo();
		Boolean trovato=false;
		
		System.out.println("inserisci targa del veicolo: ");
		targa = Tastiera.leggiString();
		listaContravvenzioniAppoggio = v.getListaContravvenzioni();		
		for (int i=0; i<listaContravvenzioniAppoggio.size(); i++) {
			contravvenzioneAppoggio = listaContravvenzioniAppoggio.get(i);
			veicoloAppoggio = contravvenzioneAppoggio.getVe();
			if (targa == veicoloAppoggio.getTarga()) {
				System.out.println("id: " + i + contravvenzioneAppoggio);
				trovato=true;
			}
		}
		return trovato;
		
	}
}
