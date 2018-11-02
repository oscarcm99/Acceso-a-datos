import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int opcion = 0;
		FicheroNombre fp = new FicheroNombre("personas.txt");
		FicheroNombre fe = new FicheroNombre("edad.txt");
		FicheroNombre fn = new FicheroNombre("nombre.txt");
		Persona[] persona = new Persona[5];
		persona[0] = new Persona("Oscar", "Calderon", 19, "Escultura");
		persona[1] = new Persona("Juan", "Gonzalez", 12, "Gran via");
		persona[2] = new Persona("Jorge", "Garcia", 34, "Arcones gil");
		persona[3] = new Persona("Ramon", "Sanchez", 22, "Montera");
		persona[4] = new Persona("Luis", "Lopez", 11, "Mayor");
		while(opcion!=8) {
			System.out.println("1. Leer fichero personas");
			System.out.println("2. Escri+bir fichero personas");
			System.out.println("3. Escribir nombre de personas");
			System.out.println("4. Escribir apellidos de personas");
			System.out.println("5. Escribir personas mayores de edad");
			System.out.println("6. Ordenar fichero edad");
			System.out.println("7. Ordenar fichero nombre");
			System.out.println("8. Salir");
			System.out.print("Introduce opcion: ");
			opcion = t.nextInt();
			switch(opcion) {
				case 1:
					fp.leerFichero(persona);
					break;
				case 2:
					fp.escribirFichero(persona);
					break;
				case 3:
					for(int i=0; i<persona.length; i++)
						System.out.println(persona[i].nombre+" "+persona[i].apellidos);
					break;
				case 4:
					for(int i=0; i<persona.length; i++)
						System.out.println(persona[i].apellidos+" "+persona[i].nombre);
					break;
				case 5:
					for(int i=0; i<persona.length; i++)
						if(persona[i].mayorEdad())
							System.out.println(persona[i].getNombre()+" "+persona[i].getApellidos());
					break;
				case 6:
					fe.ordenarNumeros(persona);
					break;
				case 7:
					fn.ordenarNombres(persona);
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Nasti de plasti");
					break;
			}
		}
	}
}
