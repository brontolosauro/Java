package exe20230803_ospedale;

public class Medico extends Persona {
	protected String specialità;
	
	public Medico(String nome, String cognome, String specialità) {
		super(nome, cognome);
		this.specialità = specialità;
	}
	

	@Override
	public String toString() {
		return "Medico [specialità=" + specialità + ", nome=" + nome + ", cognome=" + cognome + ", matricola="
				+ matricola + "]";
	}


	public String getSpecialità() {
		return specialità;
	}

	public void setSpecialità(String specialità) {
		this.specialità = specialità;
	}
	
}
