package exe20230803_ospedale;

public abstract class Persona {
	protected String nome;
	protected String cognome;
	protected int matricola;
	protected static int nextMatricola=1;
	
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = nextMatricola++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	
}
