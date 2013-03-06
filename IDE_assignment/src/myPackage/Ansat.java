package myPackage;

public class Ansat extends Person {
	private String _stilling;
	private String _speciale;
	
	public Ansat(Cprnr cprnr, String navn, String adresse, double saldo,
			double saldoYtd, double saldoLtd, String stilling, String speciale){
		super(cprnr, navn, adresse, saldo, saldoYtd, saldoLtd);
		_stilling = stilling;
		_speciale = speciale;
	} // Ansat()
	
	public String getStilling(){
		return _stilling;
	} // getStilling()
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(super.toString());
		result.append(String.format("Stilling: %s\n", _stilling));
		result.append(String.format("Stilling: %s\n", _speciale));
		return result.toString();
	} // toString()
	
} // Class Ansat
