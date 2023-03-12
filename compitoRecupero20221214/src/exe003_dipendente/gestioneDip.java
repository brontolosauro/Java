package exe003_dipendente;

public class gestioneDip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente dip1 = new Dipendente("pippo", 1000.00);
		dip1.specializzatoNo();
		dip1.stampaDipendente();
		
		Dipendente dip2 = new Dipendente("pluto", 1200.00);
		dip2.specializzatoSi();
		dip2.stampaDipendente();
		dip2.aumentaStipendio(5);
		dip2.stampaDipendente();
		dip2.aumentaStipendio(55);
		dip2.stampaDipendente();
		dip2.aumentaStipendio(10);
		dip2.stampaDipendente();
				

	}

}
