import java.io.*;
public class FicheroRead {

	public static void main(String[] args){
		
		int n = 0;		
		try {
			//1.Apertura
			File fichero = new File("primero.txt");
			FileReader freader = new FileReader(fichero);
			//2. Leer del fichero los caracteres
			char[] letras  = new char[4];
			try {
				n = freader.read(letras);
				while(n!=-1) {
					//tratar los datos leidos
					for(int i=0; i<letras.length;i++)
						System.out.print(letras[i]);
					//lectura avanzada
				n =  freader.read(letras);
				}
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//3. Cerrar los ficheros
			try {
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

}
