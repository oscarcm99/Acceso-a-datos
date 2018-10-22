
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Con parametro ya inicializado
		/*Persona persona = new Persona();
     	int long_name = persona.medirNombre();
     	int long_surname = persona.medirApellidos();		
		persona.escribirNombre();
		persona.escribirDatos();
		if(persona.esMayorEdad())
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
		System.out.println("Nombre tiene: "+long_name+" letras y apellidos tiene: "+long_surname);*/
		//Con parametros sin inicializar
		Persona[] person = new Persona[3];
		person[0] = new Persona("Oscar","Calderon",18);
	    person[1] = new Persona("Pako","Sanz",19);
		person[2] = new Persona("Miguel","Lopes",20);
		
		for(int i=0; i<person.length; i++) {
			person[i].escribirNombre();
			person[i].escribirDatos();
			if(person[i].esMayorEdad())
				System.out.println("Es mayor de edad");
			else
				System.out.println("Es menor de edad");
			System.out.println("Letras: "+person[i].medirNombre()+" ,Apellidos: "+person[i].medirApellidos());
		}
		 	
	}

}
