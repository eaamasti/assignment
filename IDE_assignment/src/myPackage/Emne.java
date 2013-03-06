package myPackage;

public class Emne {
	private int _nr;
	private String _navn;
	
	public Emne (int nr, String navn) {
		_nr = nr;
		_navn = navn;
	} // Emne ()

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format("Nr: %s\n", _nr));
		result.append(String.format("Name: %s\n", _navn));
		return result.toString();
	} // toString()

} // Class Emne
