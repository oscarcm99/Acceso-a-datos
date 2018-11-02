
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FicheroNumero f1 = new FicheroNumero("oscar.txt");
		int[] tabla = {11,22,33,44,55,66,77,88,99,100};
		for(int i=0; i<tabla.length; i++)
			tabla[i] = 0;
		for(int num : tabla)
			System.out.println(num);
		f1.leerTabla(tabla);
		for(int num : tabla)
			System.out.println(num);
	}

}
