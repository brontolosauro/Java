package utilita.input;

import java.io.InputStreamReader; 
import java.io.BufferedReader;
import java.io.IOException;

public class Tastiera {
	
	private static BufferedReader br;
	private static String _String;
	private static int _int;
	private static char _char;
	private static float _float;
	private static double _double;
	
	public static String leggiString() {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			_String = br.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("errore di flusso" +e.getMessage());
		}
		return (_String);
		
	}
	
	public static int leggiInt () {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			_String = br.readLine();
			_int = Integer.parseInt(_String);
		}
		catch (IOException e1) {
			// TODO: handle exception
			System.out.println("errore flusso" +e1.getMessage());
		}
		catch (NumberFormatException e2) {
			// TODO: handle exception
			System.out.println("errore di input da tastiera" +e2.getMessage());
			return (0);
		}
		return _int;
	}
	
	public static float leggiFloat () {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			_String = br.readLine();
			_float = Float.parseFloat(_String);
		}
		catch (IOException e1) {
			// TODO: handle exception
			System.out.println("errore flusso" +e1.getMessage());
		}
		catch (NumberFormatException e2) {
			// TODO: handle exception
			System.out.println("errore di input da tastiera" +e2.getMessage());
			return (0);
		}
		return _float;
	}
	
	public static double leggiDouble () {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			_String = br.readLine();
			_double = Double.parseDouble(_String);
		}
		catch (IOException e1) {
			// TODO: handle exception
			System.out.println("errore flusso" +e1.getMessage());
		}
		catch (NumberFormatException e2) {
			// TODO: handle exception
			System.out.println("errore di input da tastiera" +e2.getMessage());
			return (0);
		}
		return _double;
	}
	
	public static char leggiChar () {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			_String = br.readLine();
			_char = _String.charAt(0);
		}
		catch (IOException e1) {
			// TODO: handle exception
			System.out.println("errore flusso" +e1.getMessage());
			return (0);
		}
		return _char;
	}

}
