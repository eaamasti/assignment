package myPackage;

import java.util.ArrayList;

public class Bog {
	private String _titel;	
	private Emne _emne;
	private int _aar;
	private ArrayList<Forfatter> _forfattere = new ArrayList<Forfatter>();
			
	public Bog (String titel, Emne emne, int aar) {
		_titel = titel;
		_emne = emne;
		_aar = aar;
	} // Bog
	
	public void addForfatter(Forfatter forfatter) {
		_forfattere.add(forfatter);
	} // addForfatter()
	
	public String getForfatter() {
		StringBuilder result = new StringBuilder();
		for (Forfatter forfatter : _forfattere)
			result.append(String.format("%s\n", forfatter.getForfatter()));
		return result.toString();
	} // getForfatter()
	
	public String getTitel() {
		return _titel;
	} // getTitel() 
	
	public int getAar() {
		return _aar;
	} // getAar()
	
	public Emne getEmne() {
		return _emne;
	} // getEmne()
	
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("Forfatter: %s\n", getForfatter()));
		result.append(String.format("Titel: %s\n", getTitel()));
		result.append(String.format("Udgivet: %s\n", getAar()));
		result.append(String.format("Emne: %s\n", getEmne()));						
		return result.toString();
	} // toString()
	
} // Class Bog
