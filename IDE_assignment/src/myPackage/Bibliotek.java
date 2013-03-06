package myPackage;

import java.util.ArrayList;

public class Bibliotek {

	private ArrayList <BogEksemplar> _bogBestand = new ArrayList <BogEksemplar>();
	private ArrayList <Person> _laanere = new ArrayList <Person>();
	private ArrayList <Ansat> _ansatte = new ArrayList <Ansat>();
	private String _navn;
	
	public Bibliotek(String navn) {
		_navn = navn;
	} // Bibliotek()
	
	public void addBog(BogEksemplar bog) {
		_bogBestand.add(bog);
	} // addBog()
	
	public void addAnsat(Ansat ansat) {
		_ansatte.add(ansat);
	} // addAnsat()
	
	public void addLaaner(Person laaner) {
		_laanere.add(laaner);
	} // addLaaner()
	
	public void udskrivBogListe(){
		for (Bog bog : _bogBestand)
			System.out.printf("%s\n\n", bog.toString());
	} // udskrivBogListe()
	
	public void udskrivLaanere(){
		for (Person laaner : _laanere)
			System.out.printf("%s\n\n", laaner.toString());
	} // udskrivLaanere()
	
	public void udskrivAnsatte(){
		for (Person ansat : _laanere)
			System.out.printf("%s\n\n", ansat.toString());
	} // udskrivAnsat()
	
	@Override
	public String toString(){
		return String.format("Navn: %s\n", _navn);
	}// toString()
		
} // class Bibliotek
