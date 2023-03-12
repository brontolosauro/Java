package gestioneContravvenzioni_rev2;

public class RisultatoRicercaContravvenzione {
	private Contravvenzione c;
	private Boolean trovato;
	public RisultatoRicercaContravvenzione() {
		this.trovato = false;
	}
	public Contravvenzione getC() {
		return c;
	}
	public void setC(Contravvenzione c) {
		this.c = c;
	}
	public Boolean getTrovato() {
		return trovato;
	}
	public void setTrovato(Boolean trovato) {
		this.trovato = trovato;
	}
}
