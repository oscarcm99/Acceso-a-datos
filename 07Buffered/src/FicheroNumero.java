import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroNumero {
	private String nombre;
	
	public FicheroNumero(String uy) {
		nombre = uy;
	}
	public void escribirTabla(int[] tabla) {
		try {	
			String[] cadena = new String[tabla.length];
			File fichero = new File(nombre);
			FileWriter fwriter = new FileWriter(fichero);
			BufferedWriter bwriter =  new BufferedWriter(fwriter);
			for(int i=0; i<tabla.length; i++)
				cadena[i] = Integer.toString(tabla[i]);
			for(int i=0; i<cadena.length; i++) {
				bwriter.write(cadena[i]);
				bwriter.newLine();
			}
			bwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void leerTabla(int[] tabla) {
		String  linea;
		int     numeroEntero,
		        i;
		
		try
		{
			File fichero = new File(nombre);
			FileReader file = new FileReader(fichero);
			BufferedReader fLectura = new BufferedReader(file);
			
			i=0;
			linea = fLectura.readLine();
			while(linea!=null)
			{
				numeroEntero = Integer.parseInt(linea);
				tabla[i] = numeroEntero;
				i++;
				linea = fLectura.readLine();
			}
			fLectura.close();
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}	
	}
	
}
