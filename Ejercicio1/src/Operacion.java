
public class Operacion {
public int num1;
public int num2;
public int den1;
public int den2;


public Operacion(int num1, int num2, int den1, int den2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
	this.den1 = den1;
	this.den2 = den2;
}


public double sumar(int nnum1, int nnum2, int dden1, int dden2) {
	num1 = nnum1;
	num2 = nnum2;
	den1 = dden1;
	den2 = dden2;
	
	return (double)(nnum1/dden1) + (nnum2/dden2);
}
public double restar(int nnum1, int nnum2, int dden1, int dden2) {
	num1 = nnum1;
	num2 = nnum2;
	den1 = dden1;
	den2 = dden2;
	
	return (double)(nnum1/dden1) - (nnum2/dden2);
}
public double multiplicar(int nnum1, int nnum2, int dden1, int dden2) {
	num1 = nnum1;
	num2 = nnum2;
	den1 = dden1;
	den2 = dden2;
	
	return (double)(nnum1/dden1) * (nnum2/dden2);
}
public double dividir(int nnum1, int nnum2, int dden1, int dden2) {
	num1 = nnum1;
	num2 = nnum2;
	den1 = dden1;
	den2 = dden2;
	
	return (double)(nnum1/dden1) / (nnum2/dden2);
}
}
