package exe002_libro;

public class GestioneLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("signore anelli", 30.0, "tolkien", 1000);
		libro1.infoLibro();
		Libro libro2 = new Libro("non è un libro per haker", "fratepietro");
		libro2.infoLibro();
		libro2.setNoPagine(84);
		libro2.setPrezzo(9.99);
		System.out.println("autore: " + libro2.getAutore() +", titolo: " + libro2.getTitolo() + ", numero pagine: " + libro2.getNoPagine() + ", prezzo: " + libro2.getPrezzo());
		Libro libro3 = new Libro();
		libro3.infoLibro();
		libro3.setTitolo("il conte di montecristo");
		libro3.setAutore("dumas");
		libro3.setNoPagine(900);
		libro3.setPrezzo(19.99);
		libro3.infoLibro();
		
		

	}

}
