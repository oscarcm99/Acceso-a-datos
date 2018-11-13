import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroAnimal {
	private String nombre;
	private File fichero;
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	private char modo;
	public FicheroAnimal(String nombre) {
		this.nombre = nombre;
	}
	
	public void abrirFichero(char modo){
		this.modo = modo;
		if(modo == 'E') {
		fichero = new File(nombre);
		try {
			fw  = new FileWriter(fichero);
			bw = new BufferedWriter(fw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else
			if(modo == 'L') {
				fichero = new File(nombre);
				try {
					fr = new FileReader(fichero);
					br =  new BufferedReader(fr);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}
	public void escribirFichero(Animal animal) {
		try {
			bw.write(animal.getNombre());
			bw.newLine();
			bw.write(Integer.toString(animal.getEdad()));
			bw.newLine();
			bw.write(animal.getEspecie());
			bw.newLine();
			bw.write(animal.getCategoria());
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Animal leerFichero() {
		Animal animal = new Animal();
		String n,esp,cat; 
		int ed;
		try {
			n = br.readLine();
			ed = Integer.parseInt(br.readLine());
			esp = br.readLine();
			cat = br.readLine();
			animal = new Animal(n,ed,esp,cat);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return animal;
	}
	public void cerrarFichero() {
		if(modo == 'E') {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
			if(modo == 'L')
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
