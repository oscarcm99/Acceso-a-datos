
public class Animal {
private String nombre;
private int edad;
private String especie;
private String categoria;

	public Animal(String nombre,int edad,String especie,String categoria) {
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		this.categoria = categoria;
	}
	public Animal() {
		this.nombre = "";
		this.edad = 0;
		this.especie = "";
		this.categoria = "";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
