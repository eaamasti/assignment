package myPackage;

public class Reservation {
	private Bog _bog;
	private NewGregorianCalendar _dato;
	private Person _laaner;
	
	public Reservation(Bog bog, NewGregorianCalendar dato, Person laaner) {
		_bog = bog;
		_dato = dato;
		_laaner = laaner;
	} // Reservation()

	// TODO
	/*
	public GregorianCalendar getDato() {
		return _dato;
	} // getDato()
	*/
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("Laaner: %s\n", _laaner.toString()));
		result.append(String.format("Bog: %s\n", _bog.toString()));
		// TODO
		//result.append(String.format("Reserveret  %s\n", getDato()));
		
		return result.toString();				
	} //  toString()
	
} // Class Reservation
