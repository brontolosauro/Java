package exe20221102;

public class CostoBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float costoBase = 200.00f;
		float tassoScontoGiorno = 0.023f;
		int giorniAnticipo = 7;
		float costoBiglietto = costoBase;
		
		for (int i=0; i<giorniAnticipo; i++) {
			costoBiglietto -= costoBiglietto*tassoScontoGiorno;
		}
		
		System.out.print("Costo biglietto: ");
		System.out.format("%.2f", costoBiglietto);

	}

}
