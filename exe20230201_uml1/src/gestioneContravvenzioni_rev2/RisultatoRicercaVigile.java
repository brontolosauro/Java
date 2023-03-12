package gestioneContravvenzioni_rev2;

public class RisultatoRicercaVigile {
	/*effettuando ricerche all'interno di liste o simili
	 * se la ricerca ha successo si salva il risultato */
	private Vigile v;
	private Boolean trovato;
	public RisultatoRicercaVigile() {
		this.trovato = false;
	}
	public Vigile getV() {
		return v;
	}
	public void setV(Vigile v) {
		this.v = v;
	}
	public Boolean getTrovato() {
		return trovato;
	}
	public void setTrovato(Boolean trovato) {
		this.trovato = trovato;
	}
	
	

}
