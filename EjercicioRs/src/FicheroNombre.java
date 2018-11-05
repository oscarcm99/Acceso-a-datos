import java.io.*;
public class FicheroNombre {
	private String fichero;
	private File file;
	private FileWriter fwriter;
	private BufferedWriter bwriter;
	private FileReader freader;
	private BufferedReader breader;
	private char modo;
	public FicheroNombre(String n) {
		fichero = n;
	}

	public void abrirFichero(char modo, String nombre) {
		this.modo = modo;
		this.fichero = nombre;
		if (modo == 'E') {
			file = new File(nombre);
			try {
				fwriter = new FileWriter(file);
				bwriter = new BufferedWriter(fwriter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (modo == 'L') {
			file = new File(nombre);
			try {
				freader = new FileReader(file);
				breader = new BufferedReader(freader);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Error");
		}
	}

	public void escribirFichero(Persona persona) {
			try {
					bwriter.write(persona.nombre);
					bwriter.newLine();
					bwriter.write(persona.apellidos);
					bwriter.newLine();
					bwriter.write(Integer.toString(persona.edad));
					bwriter.newLine();
					bwriter.write(persona.direccion);
					bwriter.newLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	/*public void leerFichero(Persona[] persona) {
		int i=0;
		String line;
		abrirFichero('L', fichero);
		try {
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
			cerrarFichero('L');
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	public Persona leerFichero() {
		String n="", a="",d="";
		int e=0;
		Persona p =  new Persona();
		try {
			n = breader.readLine();
			a = breader.readLine();
			e = Integer.parseInt(breader.readLine());
			d = breader.readLine();
			p = new Persona(n,a,e,d); 
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
		} catch (IOException e1) {
			// TODO Auto-generated catch block
		}
		return p;
	}
	public void cerrarFichero() {
		try {
		if(modo == 'E')
				bwriter.close();
		else
			if(modo == 'L')
				breader.close();
			else
				System.out.println("Error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
