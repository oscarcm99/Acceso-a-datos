import java.util.*;

public class ExcepcionCaptura {
	static public int  leerNumero(){
		Scanner teclado = new Scanner(System.in);
		int opcion;
		System.out.println("Introduce un numero: ");
		opcion = teclado.nextInt();
		return opcion;
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
