import java.text.FieldPosition;
import java.util.ArrayList;

public class Prin {

	public static void main(String[] args) throws NumberFormatException{
		// TODO Auto-generated method stub
		Animal[] animal = new Animal[3];
		Animal an;
		FicheroAnimal fa = new FicheroAnimal("animal.txt");
		animal[0] = new Animal("Jake", 11, "loro", "ave");
		animal[1] = new Animal("Sniky", 20, "serpiente", "reptil");
		animal[2] = new Animal("Piggy", 5, "cerdo", "mamifero");
		ArrayList<Animal> tanimal = new ArrayList<Animal>();
		fa.abrirFichero('E');
		for(int i=0; i<animal.length; i++)
		fa.escribirFichero(animal[i]);
		fa.cerrarFichero();
		fa.abrirFichero('L');
		try {
		do{
			an = fa.leerFichero();
			if(an.getNombre() != "fin")
			tanimal.add(an);
		}while(an.getNombre()!="fin");
		}catch(NumberFormatException ex) {
			throw new NumberFormatException("F");
		}
		fa.cerrarFichero();
	}

}
