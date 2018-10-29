import java.util.Scanner;
import java.io.*;
public class Principal {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablaNumeros = {12,25,39,44,58,61,73,84,91,2};
		int[] tablaLec = new int[10];
		File ficheroEscritura = new File("escribir.txt");
		File ficheroLectura = new File("leer.txt");
		int opcion = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(opcion!=6) {
			escribirMenu();
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				escribirFichero(ficheroEscritura,tablaNumeros);
				break;
			case 2:
				leerFichero(ficheroLectura,tablaLec);
				break;
			case 3:
				for (int i=0; i<tablaLec.length;i++)
					System.out.println(tablaLec[i]);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	//Leer numeros de ficheros
	private static void leerFichero(File fichero, int[] tablaLec) {
		// TODO Auto-generated method stub
		int n = 0;
		int i = 0;
		try {
			char numero = 0;
			String letrasNumero = "";
			fichero = new File("leer.txt");
			FileReader freader = new FileReader(fichero);
			try {
				n =  freader.read();
				while(n!=-1) {
					if(n == '\n') { 
						tablaLec[i++] = Integer.parseInt(letrasNumero);
						letrasNumero = "";
					}
					else
						letrasNumero += Character.toString((char) n);
					n = freader.read();
				}
				freader.close();
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Imprimir menu
	private static void escribirMenu() {
		System.out.println("1.Escribir fichero");
		System.out.println("2.Leer fichero");
		System.out.println("3.Escribir los datos de la tabla");
		System.out.println("4.Modificar tabla.");
		System.out.println("5.Actualizar tabla fichero.");
		System.out.println("6.Salir.");
		System.out.println("Introduce opcion: ");
		}
	//Escribir en un fichero la tabla de enteros
	private static void escribirFichero(File fichero, int[] tablaNumeros) {
		// TODO Auto-generated method stub
		
		try {	
			String[] cadena = new String[tablaNumeros.length];
			fichero = new File("escribir.txt");
			FileWriter fwriter = new FileWriter(fichero);
			for(int i=0; i<tablaNumeros.length; i++)
				cadena[i] = Integer.toString(tablaNumeros[i]);
			for(int i=0; i<cadena.length; i++)
				fwriter.write(cadena[i]+"\n");
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
