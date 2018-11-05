import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FicheroNombre {
	private String fichero;
	
	public FicheroNombre(String fic) {
		fichero = fic;
	}
	public void abrirFichero() {
		char opcion = 0;
		File fich;
		FileWriter fwriter;
		FileReader freader;
		BufferedWriter bwriter;
		BufferedReader breader;
		Scanner t = new Scanner(System.in);
		while(opcion!='E' || opcion!='L') {
			System.out.println("E: Abrir fichero escritura o L: Abrir fichero lectura");
			opcion = t.next().charAt(0);
			switch(opcion) {
			case 'E':
				fich = new File(fichero);
				try {
					fwriter = new FileWriter(fich);
					bwriter = new BufferedWriter(fwriter);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 'L':
				fich = new File(fichero);
				try {
					freader = new FileReader(fich);
					breader = new BufferedReader(freader);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Introduce una opcion valida");
				break;
			}
		}		
	}
	public void escribirFichero(Persona[] persona) {
		File fich = new File(fichero);
		String[] edad = new String[persona.length];
		try {
			FileWriter fwriter = new FileWriter(fich);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			for(int i=0; i<persona.length; i++)
				edad[i] = Integer.toString(persona[i].getEdad());
			for(int i=0; i<persona.length; i++) {
				bwriter.write(persona[i].getNombre());
				bwriter.newLine();
				bwriter.write(persona[i].getApellidos());
				bwriter.newLine();
				bwriter.write(edad[i]);
				bwriter.newLine();
				bwriter.write(persona[i].getDireccion());
				bwriter.newLine();
			}
			bwriter.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void leerFichero(Persona[] persona) {
		int i = 0;
		String line;
		File fic = new File(fichero);
		try {
			FileReader freader = new FileReader(fic);
			BufferedReader breader = new BufferedReader(freader);
			line = breader.readLine();
			while(line != null) {
				persona[i].nombre = line;
				line = breader.readLine();
				persona[i].apellidos = line;
				line = breader.readLine();
				persona[i].edad = Integer.parseInt(line);
				line = breader.readLine();
				persona[i].direccion = line;
				i++;
				line = breader.readLine();
			}
			breader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ordenarNumeros(Persona[] persona) {
		
		String[] linea = new String[persona.length];
		File fic = new File(fichero);
		try {
			FileWriter fwriter = new FileWriter(fic);
			BufferedWriter  bwriter = new BufferedWriter(fwriter);
			for(int i=0; i<persona.length; i++) 
				linea[i] = Integer.toString(persona[i].edad);
			Arrays.sort(linea);
			for(int i=0; i<persona.length; i++) {
				bwriter.write(persona[i].nombre);
				bwriter.newLine();
				bwriter.write(persona[i].apellidos);
				bwriter.newLine();
				bwriter.write(linea[i]);
				bwriter.newLine();
				bwriter.write(persona[i].direccion);
				bwriter.newLine();
			}
			bwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ordenarNombres(Persona[] persona) {
		File fic = new File(fichero);
		String[] linea = new String[persona.length];
		String[] edad = new String[persona.length];
		try {
			FileWriter fwriter = new FileWriter(fic);
			BufferedWriter  bwriter = new BufferedWriter(fwriter);
			for(int i=0; i<persona.length; i++) { 
				linea[i] = persona[i].nombre;
				edad[i] = Integer.toString(persona[i].edad);
			}
			Arrays.sort(linea);
			for(int i=0; i<persona.length; i++) {
				bwriter.write(linea[i]);
				bwriter.newLine();
				bwriter.write(persona[i].apellidos);
				bwriter.newLine();
				bwriter.write(edad[i]);
				bwriter.newLine();
				bwriter.write(persona[i].direccion);
				bwriter.newLine();
			}
			bwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
