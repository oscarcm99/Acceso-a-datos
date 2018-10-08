
public class Fecha {
int day;
int month;
int year;

public Fecha(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
public String  escribirCorta(int nday, int nmonth, int nyear) {
	
    day = nday;
    month  = nmonth;
    year  = nyear;
	String cadena;
	cadena = "Hoy es "+nday+"/"+nmonth+"/"+nyear;
	return cadena;
}
public String escribirLarga(int nday, int nmonth, int nyear) {
	day = nday;
    month  = nmonth;
    year  = nyear;
	String cadena;
	cadena = "Hoy es el dia: "+nday+"del mes: "+nmonth+"del año: "+nyear;
	return cadena;
}
public boolean esCorrecta(int nday, int nmonth, int nyear) {
	boolean valida;
	day = nday;
    month  = nmonth;
    year  = nyear;
    if( (nday<1 || nday>31) && (nmonth<1 || nmonth > 12) && (nyear<0 || nyear>2018) ) {
    		valida = false;
    		return valida;
    	}
    else {
    	valida = true;
    	return valida;
    }
	}
	
}
