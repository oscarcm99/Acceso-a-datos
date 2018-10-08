
public class Persona {
String nombre;
String apellidos;
Fecha fechaNacimiento;
Nif dni;
public Persona(String nombre, String apellidos, Fecha fechaNacimiento, Nif dni) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fechaNacimiento = fechaNacimiento;
	this.dni = dni;
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
public Fecha getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(Fecha fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public Nif getDni() {
	return dni;
}
public void setDni(Nif dni) {
	this.dni = dni;
}



}
