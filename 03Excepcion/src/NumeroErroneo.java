
public class NumeroErroneo extends Exception {
	private String message;
	private int numero;

	public NumeroErroneo(String m, int n) {
		message = m;
		numero = n;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The error is" +message +"of the number" +numero;
	}
	
}
