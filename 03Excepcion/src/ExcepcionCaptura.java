import java.util.*;

public class ExcepcionCaptura {
	static public int  leerNumero(){
		Scanner teclado = new Scanner(System.in);
		int opcion;
		System.out.println("Introduce un numero: ");
		opcion = teclado.nextInt();
		return opcion;
	}
	static public int leerNumero2() throws NumeroErroneo {
		int opcion = 0;

		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			opcion = teclado.nextInt();
			return opcion;	
		}catch(NumeroErroneo ex) {
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int numero  = leerNumero();
		System.out.printf("El cuadrado de tu numero es %i\n", (numero * numero));
		} catch (InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}catch(NoSuchElementException ex) {
			System.out.println(ex.getMessage());
		}catch(UnknownFormatConversionException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
