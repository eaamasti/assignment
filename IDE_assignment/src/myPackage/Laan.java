package myPackage;

public class Laan {
	private Person _laaner;
	private BogEksemplar _bog;
	private NewGregorianCalendar _datoUd;
	private NewGregorianCalendar _datoHjem;
	private double _boede;

	public Laan(Person laaner, BogEksemplar bog, NewGregorianCalendar datoUd,
			NewGregorianCalendar datoHjem, double boede) {
		_laaner = laaner;
		_bog = bog;
		_datoUd = datoUd;
		_datoHjem = datoHjem;
		_boede = boede;
	} // Laan()

	public Person getLaaner() {
		return _laaner;
	}// getLaaner

	public NewGregorianCalendar returneresDato() {
		return _datoHjem;
	}// returneresDato()

	// TODO - I don't know what the body should be like
	public void returnerer() {

	} // returnerer() - overloaded method

	// TODO - I don't know what the body should be like
	public void returnerer(int yr, int mt, int dy) {

	} // public void returnerer() - - overloaded method

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format("Låner: %s\n", _laaner.toString()));
		result.append(String.format("Udlånt: %s\n", _datoUd.toString()));
		result.append(String.format("Returneres: %s\n", returneresDato()));
		result.append(String.format("Bøde: %,.2f\n", _boede));
		return result.toString();
	} // toString()

	// TODO: Calculate days
	private int antalDage() {
		int result = 0;
		return result;
	} // antalDage()

	// TODO: calculate
	private double beregnBoeder () {
		double result = 0;
		return result;
	} // beregnBoeder () 
	
} // Laan
