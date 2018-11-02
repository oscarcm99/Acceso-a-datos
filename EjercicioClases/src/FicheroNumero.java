import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroNumero {
	private String nombre;

	public FicheroNumero(String c) {
		// TODO Auto-generated constructor stub
		nombre = c;
	}

	public void leerFichero(int[] tablaLec) {
		// TODO Auto-generated method stub
		int n = 0;
		int i = 0;
		try {
			char numero = 0;
			String letrasNumero = "";
			File fichero = new File(nombre);
			FileReader freader = new FileReader(fichero);
			try {
				n = freader.read();
				while (n != -1) {
					if (n == '\n') {
						tablaLec[i++] = Integer.parseInt(letrasNumero);
						letrasNumero = "";
					} else
						letrasNumero += Character.toString((char) n);
					n = freader.read();
				}
				if(letrasNumero!=""){
					tablaLec[i] = Integer.parseInt(letrasNumero);
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

	public void escribirFichero(int[] tablaNumeros) {
		// TODO Auto-generated method stub

		try {
			String[] cadena = new String[tablaNumeros.length];
			File fichero = new File(nombre);
			FileWriter fwriter = new FileWriter(fichero);
			for (int i = 0; i < tablaNumeros.length; i++)
				cadena[i] = Integer.toString(tablaNumeros[i]);
			for (int i = 0; i < cadena.length; i++)
				fwriter.write(cadena[i] + "\n");
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
