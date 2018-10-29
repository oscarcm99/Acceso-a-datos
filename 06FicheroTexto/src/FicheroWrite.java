import java.io.*;
public class FicheroWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File fichero = new File("segundo.txt");
			FileWriter fwriter = new FileWriter(fichero,true);
			
			String letras = " Y ANA IGUAL";
			fwriter.write(letras);
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
