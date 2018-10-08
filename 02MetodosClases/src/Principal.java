
public class Principal {
	public static void cambiarFecha(Fecha f){
		f.day = f.day +1;
		f.month = f.month +2;
		f.year =  2000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fechita =  new Fecha();
		System.out.println(fechita.day);
		System.out.println(fechita.month);
		System.out.println(fechita.year);
		cambiarFecha(fechita);
		System.out.println(fechita.day);
		System.out.println(fechita.month);
		System.out.println(fechita.year);
	}

}
