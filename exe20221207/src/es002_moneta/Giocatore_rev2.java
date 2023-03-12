package es002_moneta;

import utilita.input.Tastiera;

public class Giocatore_rev2 {
	private String scelta;
	private int punteggio;
	
	public Giocatore_rev2() {
				
		this.punteggio = 0;
	}
	public String getScelta() {
		return scelta;
	}
	public void setScelta() {
				
			System.out.print("Testa o Croce? [t/c]");
			char utenteIn = Tastiera.leggiChar();
			if (utenteIn == 't' || utenteIn == 'T') {
				this.scelta = "testa";
			}else if (utenteIn == 'c' || utenteIn == 'C') {
				this.scelta = "croce";
			}
			
	}

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
