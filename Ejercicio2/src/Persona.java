
public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
		nombre = "Oscar";
		apellidos = "Calderon Moran";
		edad = 18;
	}
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void escribirNombre() {
		System.out.println("Nombre: " +nombre);
	}
	public void escribirDatos(){
		System.out.println("Nombre: "+nombre+" ,Apellidos: "+apellidos+" ,Edad: "+edad);
	}
	public boolean esMayorEdad() {
		if(edad>=18)
			return true;
		else
			return false;
	}
	public int medirNombre() {
		return nombre.length();
	}
	public int medirApellidos() {
		return apellidos.length();
	}
}
