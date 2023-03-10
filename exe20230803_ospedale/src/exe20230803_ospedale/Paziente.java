package exe20230803_ospedale;

public class Paziente extends Persona {
	protected String patologia;
	
	public Paziente(String nome, String cognome, String patologia) {
		super(nome, cognome);
		this.patologia = patologia;
	}
	

	@Override
	public String toString() {
		return "Paziente [patologia=" + patologia + ", nome=" + nome + ", cognome=" + cognome + ", matricola="
				+ matricola + "]";
	}


	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
	
	
}
