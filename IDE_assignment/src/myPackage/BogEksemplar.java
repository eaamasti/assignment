package myPackage;

public class BogEksemplar extends Bog {
	private int _eksplNr;

	public BogEksemplar(String titel, Emne emne, int aar, int eksplNr) {
		super(titel, emne, aar);
		_eksplNr = eksplNr;
	} // BogEksemplar ()

	public int getEksemplar() {
		return _eksplNr;
	} // getEksemplar()

	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("%s", super.toString()));
		result.append(String.format("Eksemplar nr: %s\n", _eksplNr));
		
		return result.toString();
	}// toString()
	
} // class BogEksemplar
