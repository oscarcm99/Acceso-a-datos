
public class Nif {
long numdni;

public Nif(long numdni) {
	super();
	this.numdni = numdni;
}

public long getNumdni() {
	return numdni;
}

public void setNumdni(long numdni) {
	this.numdni = numdni;
}
public char calcularLetra(long numdnis) {
	numdni = numdnis;
	String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
	int resto = (int)numdnis % 23;
	return cadena.charAt(resto);
}
}
