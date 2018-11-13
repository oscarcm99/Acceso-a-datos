import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = {"oscar","pepe","luis","ana"};
		//escribir(nombres);
		leer(nombres);
		nombres[0] = "pili";
		escribir(nombres);
	}
	public static void escribir(String[] tabla) {
		File fichero = new File("repaso.txt");
		try {
			FileWriter fw = new FileWriter(fichero);
			for(int i=0; i<tabla.length; i++) {
				fw.write(tabla[i]+",");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void leer(String[] tabla){
		File fichero = new File("repaso.txt");
		String cadena = "";
		int n = 0;
		int i = 0;
		try {
			FileReader fr = new FileReader(fichero);	
			n = fr.read();
			while(n!=-1) {
				if(n == ',') {
					tabla[i++] = cadena;
					cadena = "";
				}else {
					cadena+= Character.toString((char)n);
				}
				if(cadena!=""){
					tabla[i] = cadena;
				}
			n= fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
