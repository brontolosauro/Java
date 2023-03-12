package exe20230201_uml1;

import utilita.input.Tastiera;

public class Contravvenzione {
	//---ATTRIBUTI---
	private int numVerbale;
	private String luogo;
	private Veicolo ve;
	
	//---COSTRUTTORE---
	public Contravvenzione() {
		/*Il costruttore viene invocato nel momento in cui Vigile
		 effettua una contravvenzione. 
		 */
		System.out.print("inserisci numero verbale: ");
		this.setNumVerbale(Tastiera.leggiInt());
		System.out.print("inserisci luogo:");
		this.setLuogo(Tastiera.leggiString());
		ve = new Veicolo(); // con il costruttore del veico andiamo ad inserire i dati necessari
		
	}	
	
	//---SETTER & GETTER---
	public int getNumVerbale() {
		return numVerbale;
	}
	
	public void setNumVerbale(int numVerbale) {
		this.numVerbale = numVerbale;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public Veicolo getVe() {
		return ve;
	}
	public void setVe(Veicolo ve) {
		this.ve = ve;
	}

	@Override
	public String toString() {
		return "Contravvenzione [numVerbale=" + numVerbale + ", luogo=" 
				+ luogo + ", veicolo=" + ve + "]";
	}
	
	

}
