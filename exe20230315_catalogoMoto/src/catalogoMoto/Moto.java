package catalogoMoto;

import java.util.Vector;

import catalogoAccessori.Accessori;

public abstract class Moto {
	protected String modello;
	protected Integer cilindrata;
	protected String motorizzazione;
	protected Double prezzo;
	protected Vector<Accessori> accessori = new Vector<Accessori>();
	
	abstract protected Double sconto();

}
