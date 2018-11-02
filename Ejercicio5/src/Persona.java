
public class Persona {
	String nombre;
	String apellidos;
	int edad;
	String direccion;
	
	public Persona(String nom, String ap, int ed, String dir) {
		nombre = nom;
		apellidos = ap;
		edad = ed;
		direccion = dir;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean mayorEdad() {
		if(edad>=18)
			return true;
		else
			return false;
	}
	public String escribirNombre() {
		return nombre+"\n"+apellidos+"\n"+direccion+"\n"+edad+"\n";
	}
	public String  escribirApellidos() {
		return apellidos+"\n"+nombre+"\n"+direccion+"\n"+edad+"\n";
	}


}
