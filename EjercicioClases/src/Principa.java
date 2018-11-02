
public class Principa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FicheroNumero f1 = new FicheroNumero("n1.txt");
		FicheroNumero f2 = new FicheroNumero("n2.txt");
		FicheroNumero f3 = new FicheroNumero("n3.txt");
		
		int[] t1 = {11,22,33};
		int[] t2= {44,55,66};
		int[] t3 = {77,88,99};
		
		f1.escribirFichero(t1);
		f2.escribirFichero(t2);
		f3.escribirFichero(t3);
	}

}
