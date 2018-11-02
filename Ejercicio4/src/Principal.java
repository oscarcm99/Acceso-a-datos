import java.util.Scanner;
import java.io.*;
public class Principal {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablaNumeros = {12,25,39,44,58,61,73,84,91,2};
		int[] tablaLec = new int[10];
		int opcion = 0;
		int posicion = 0;
		int numero = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(opcion!=5) {
			escribirMenu();
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				escribirFichero(tablaNumeros);
				break;
			case 2:
				leerFichero(tablaLec);
				break;
			case 3:
				imprimirContenido(tablaLec);
				break;
			case 4:
				modificarFichero(tablaNumeros,posicion,numero);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	//modificar fichero 
	private static void modificarFichero(int[] tablaNumeros, int posicion, int numero) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n=0;
		int i=0;
		try {
			File ficheroEscritura = new File("escribir.txt");
			FileReader freader = new FileReader(ficheroEscritura);
			String[] cadena = new String[tablaNumeros.length];
			cadena[0] = "";
			System.out.println("Que posicion vas a modificar: ");
			posicion = teclado.nextInt();
			posicion = posicion-1;
			System.out.println("Introduce número: ");
			numero = teclado.nextInt();
			String cad = Integer.toString(numero);
			n = freader.read();
			while(n!=-1) {
				if(n == '\n') {
					if(i == posicion) {
						FileWriter fwriter = new FileWriter(ficheroEscritura,true);
						cadena[i] = cad;
						fwriter.write(cadena[i]);
						fwriter.close();
					}else {
						cadena[i++] = "";
					}
						
				}
				else {
					cadena[i++] += Character.toString((char)n);
				}
				n = freader.read();
			}
			freader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Imprimir valor de la tabla
	private static void imprimirContenido(int[] tablaLec) {
		// TODO Auto-generated method stub
		for (int i=0; i<tablaLec.length;i++)
			System.out.println(tablaLec[i]);
	}
	//Leer numeros de ficheros
	private static void leerFichero( int[] tablaLec) {
		// TODO Auto-generated method stub
		int n = 0;
		int i = 0;
		try {
			char numero = 0;
			String letrasNumero = "";
			File fichero = new File("leer.txt");
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
		System.out.println("5.Salir.");
		System.out.println("Introduce opcion: ");
		}
	//Escribir en un fichero la tabla de enteros
	private static void escribirFichero( int[] tablaNumeros) {
		// TODO Auto-generated method stub
		
		try {	
			String[] cadena = new String[tablaNumeros.length];
			File fichero = new File("escribir.txt");
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
