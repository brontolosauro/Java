package es002_moneta;

import utilita.input.Tastiera;

public class Giocatore {
	private String scelta;
	private int punteggio;
	
	public Giocatore() {
		boolean diNuovo = false;
		do {			
			System.out.print("Testa o Croce? [t/c]");
			char utenteIn = Tastiera.leggiChar();
			if (utenteIn == 't' || utenteIn == 'T') {
				this.scelta = "testa";
			}else if (utenteIn == 'c' || utenteIn == 'C') {
				this.scelta = "croce";
			}else{
				diNuovo=true;
			}
			
			
		} while (diNuovo);
				
		this.punteggio = 0;
	}
	public String getScelta() {
		return scelta;
	}
//	private void setScelta(String scelta) {
//		this.scelta = scelta;
//	}
	public int getPunteggio() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	public void assegnaPunto() {
		this.punteggio++;
	}
	

}
