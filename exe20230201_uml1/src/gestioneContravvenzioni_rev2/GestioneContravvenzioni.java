package gestioneContravvenzioni_rev2;

import java.util.Vector;

import utilita.input.Tastiera;

public class GestioneContravvenzioni {
	
	Vector<Vigile> listaVigili = new Vector<Vigile>(); //TODO questo deve diventare un Vector di vigili
	
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
		System.out.println("1--Inserisci nuovo vigile");
		System.out.println("2--Cerca vigile");//TODO voce per la ricerca del vigile
		System.out.println("3--Stampa lista Vigili");
		System.out.println("0--Esci dal programma.");
		
	}
	
	public void opzioniPrincipali(int scelta) {
		switch (scelta) {
		case 1:
			//TODO dal new vigile si passa ad un add to vector
			/*implementata a questo modo la verifica di unicità
			 * del vigile ho paura non funzioni; nel caso:
			 * TODO acquisire subito nome vigile e 
			 * creare nuovo costruttore*/
			String nome1;
			System.out.println("---Inserimento dati Vigile---");
			System.out.print("inserisci il nome del vigile: ");
			nome1=Tastiera.leggiString();
			RisultatoRicercaVigile risultato1;
			risultato1 = cercaVigile(nome1);
			if (risultato1.getTrovato()) {
				System.out.println("il nome inserito è già presente");
				
			}else {
				Vigile v = new Vigile(nome1);
				int sceltaVigile;
				do {
					menùVigile(v);
					sceltaVigile = Tastiera.leggiInt();
					opzioniMenùVigile(sceltaVigile, v);
				}while (sceltaVigile != 0);
				listaVigili.add(v);
			}
			
			break;		
		case 2: //TODO case per la ricerca vigile una volta trovato il menù vigile si ricicla
			RisultatoRicercaVigile risultato2;
			String nome2;
			System.out.print("inserisci il nome del vigile da cercare: ");
			nome2 = Tastiera.leggiString();
			risultato2 = cercaVigile(nome2);
			if (risultato2.getTrovato()) {
				int sceltaVigile;
				do {
					menùVigile(risultato2.getV());
					sceltaVigile = Tastiera.leggiInt();
					opzioniMenùVigile(sceltaVigile, risultato2.getV());
				}while (sceltaVigile != 0);
			}else {
				System.out.println("nessuna corrispondenza per il nome inserito");
			}
			break; 
		case 3:
			for (int i=0; i<listaVigili.size(); i++) {
				System.out.println(listaVigili.get(i));
			}
		case 0:
			break;
		default:
			System.out.println("si è verificato un errore.");
			
		}		
			
	}
	
	public RisultatoRicercaVigile cercaVigile(String nome) {/*rispetto a cercaContravvenzione
	penso sia il coso di avere come valore di ritorno il vigile ,
	se lo trovo, od un null	*/
	/* peccato che non possa esistere una istanza di un oggegto
	 * nulla....
	 * a questo punto mi vado a costruire una classe RisultatoRicerca*/
		//String nome;
		Vigile vigileAppoggio;
		RisultatoRicercaVigile risultato = new RisultatoRicercaVigile();
		
		//System.out.print("inserisci il nome del vigile da cercare: ");
		//nome = Tastiera.leggiString();
		for (int i=0; i<listaVigili.size(); i++) {
			vigileAppoggio = listaVigili.get(i);
			if (nome.equalsIgnoreCase(vigileAppoggio.getNome())) {
				risultato.setV(vigileAppoggio);
				risultato.setTrovato(true);
			}
		}
		
		return risultato;
	}
	
	public void menùVigile(Vigile v) {
		//TODO qualcosa andrà modificato magari prevedendo come parametro il vigile su cui lavorare
		System.out.println("---Gestione contravvensioni - Vigile: " + v.getNome() + 
				" ---");
		System.out.println("1--inserisci contravvenzione");
		System.out.println("2--elimina contravvenzione");
		System.out.println("3--stampa dati Vigile");
		System.out.println("4--stampa dati contravvenzioni Effettuate");
		System.out.println("0--torna al menù principale");
		
	}
	
	public void opzioniMenùVigile(int scelta, Vigile v) {
		switch (scelta) {
		case 1: //inserisci contravvenzione
			v.effettuaContravvenzione();
			break;
		case 2: //elimina contravvenzione			
			eliminaContravvenzione(v);
			break;
		case 3: //stampa dati 
			System.out.println(v);
			break;
		case 4:
			stampaContravvenzioniEffettuate(v);
		case 0: //torna al menù principale
			break;
		default:
			System.out.println("si è verificato un errore");
		}
			
	}
	
	public void stampaContravvenzioniEffettuate(Vigile v) {
		Vector<Contravvenzione> listaContravvenzioniAppoggio;
		listaContravvenzioniAppoggio = v.getListaContravvenzioni();
		for (int i=0; i<listaContravvenzioniAppoggio.size(); i++) {
			System.out.println(listaContravvenzioniAppoggio.get(i).toString());
		}
	}
	
	public void eliminaContravvenzione(Vigile v) {
		/*la richiesta è quella di fare la ricerca attraverso la targa;
		 * con la targa si effettua la ricerca e si stampano a video tutte le 
		 * ricorrenze;
		 * per eliminare la contravvenzione è richiesto l'id ovvero la posizione
		 * nel Vector della contravvenzione*/
		int sceltaContravvenzione;
		do  {
			menùEliminaContravvenzione();
			sceltaContravvenzione = Tastiera.leggiInt();
			opzioniMenùEliminaContravvenzione(sceltaContravvenzione, v);
		}while (sceltaContravvenzione != 0);
	}
	
	public void menùEliminaContravvenzione() {
		System.out.println("---Gestione Contravvenzione - Menù Elimina Contravvenzioni ---");
		System.out.println("1--Cerca contravvenzione");
		System.out.println("0--Torna al menù Vigile");
	}
	
	public void opzioniMenùEliminaContravvenzione(int scelta, Vigile v) {
		int idContravvenzione;
		Vector<Contravvenzione> listaContravvenzioniAppoggio;
		listaContravvenzioniAppoggio = v.getListaContravvenzioni();	
		
		switch (scelta) {
		case 1:
			if (cercaContravvenzione(v)) {
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
	
	public boolean cercaContravvenzione(Vigile v) {
		String targa;
		Vector<Contravvenzione> listaContravvenzioniAppoggio;
		Contravvenzione contravvenzioneAppoggio;
		Veicolo veicoloAppoggio;
		Boolean trovato=false;
		
		System.out.println("inserisci targa del veicolo: ");
		targa = Tastiera.leggiString();
		listaContravvenzioniAppoggio = v.getListaContravvenzioni();		
		for (int i=0; i<listaContravvenzioniAppoggio.size(); i++) {
			contravvenzioneAppoggio = listaContravvenzioniAppoggio.get(i);
			veicoloAppoggio = contravvenzioneAppoggio.getVe();
			if (targa.equalsIgnoreCase(veicoloAppoggio.getTarga())){
				System.out.println("id: " + i + " " + contravvenzioneAppoggio);
				trovato=true;
			}
		}
		return trovato;
		
	}
}
