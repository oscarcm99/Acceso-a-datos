
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Con parametro ya inicializado
		Persona persona = new Persona();
		boolean mayor = persona.esMayorEdad();
     	int long_name = persona.medirNombre();
     	int long_surname = persona.medirApellidos();
		
		persona.escribirNombre();
		persona.escribirDatos();
		if(mayor == true)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
		System.out.println("Nombre tiene: "+long_name+" letras y apellidos tiene: "+long_surname);
		//Con parametros sin inicializar
		String nombre, apellidos;
		int edad;
 	}

}
