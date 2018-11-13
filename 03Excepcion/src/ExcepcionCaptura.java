import java.util.*;
import java.io.IOException;
public class ExcepcionCaptura {
	 public static int  leerNumero() throws IOException{
		try {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		System.out.println("Introduce un numero: ");
		opcion = teclado.nextInt();
		return opcion;
		}
		catch(Exception ex) {
			throw new IOException("ERROR AL LEER");
		}
	}
	 public static int leerNumero2() throws NumeroErroneo {
		int opcion = 0;

		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			opcion = teclado.nextInt();
			return opcion;	
		}catch(Exception ex) {
			throw new NumeroErroneo("Error formato", opcion);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean tick = false;
		try {
			int number = leerNumero();
			number = leerNumero2();
			tick = true;
			System.out.printf("El cuadrado de tu numero es %i",( number*number));
		}catch(NumeroErroneo ex) {
			System.out.println(ex.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
