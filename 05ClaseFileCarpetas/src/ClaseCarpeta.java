import java.io.*;

public class ClaseCarpeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File  	carpeta = new File("DAM2"), 
				fichero1 = new File("FicheroFuera.txt"),
				fichero2 = new File("FicheroDentro.txt"),
				fichero3 = new File("FicheroDentro2.txt");
		carpeta.mkdir();
		try {
			fichero1.createNewFile();
			fichero2.createNewFile();
			fichero3.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
