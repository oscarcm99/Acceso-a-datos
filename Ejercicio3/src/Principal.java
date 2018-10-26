import java.io.*;

public class Principal {
	
	public static void crearCarpetas(String[] paths) {
		File[] carpeta = new File[paths.length];
		for(int i=0; i<paths.length; i++) {
			String path = paths[i];
			String[] partes = path.split("\\\\");
			for(int j=0;j<partes.length;j++) {
				partes[i] += partes[i];
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rutas = {"Proyecto\\bin\\bytecode","Proyecto\\bin\\object","Proyecto\\src\\clases","Proyecto\\doc\\html","Proyecto\\doc\\pdf"};
		File[] dir = new File[rutas.length];
		
	}
}