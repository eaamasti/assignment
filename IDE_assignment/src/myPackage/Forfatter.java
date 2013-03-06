package myPackage;

public class Forfatter {
	private String _navn;
	private int _born;
	private int _deceased;
	private String _bornWhere;	
	
	public Forfatter(String navn, int born, int deceased, String bornWhere) {
		_navn = navn;
		_born = born;
		_deceased = deceased;
		_bornWhere = bornWhere;
	} // Forfatter()
	
	public String getForfatter() {
		return _navn;
	} //getForfatter()
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format(String.format("Name: %s\n", _navn)));
		result.append(String.format(String.format("Borned: %s\n", _born)));
		result.append(String.format(String.format("Deceased: %s\n", _deceased)));
		result.append(String.format(String.format("Born where: %s\n", _bornWhere)));
		return result.toString();		
	}// toString()
	
} // Class Forfatter
