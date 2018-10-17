
public class TablaEntero {
	
	private int[] tabla;
    
	public TablaEntero() {
		tabla = new int[6];
		tabla[0] = 11;
		tabla[1] = 22;
		tabla[2] = 33;
		tabla[3] = 44;
		tabla[4] = 55;
		tabla[5] = 66;
	}
	
	public void imprimir() {
		for(int i=0; i<tabla.length; i++)
			System.out.println(tabla[i]);
	}
	
	public void imprimir(int numero) {
		for(int i=0; i<numero; i++)
			System.out.println(tabla[i]);
	}
}
