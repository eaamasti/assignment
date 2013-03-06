package myPackage;

import java.util.ArrayList;

public class Person {

	private Cprnr _cprnr;
	private String _navn;
	private String _adresse;
	private double _saldo;
	private double _saldoYtd;
	private double _saldoLtd;
	private ArrayList<Laan> _laan = new ArrayList<Laan>();
	private ArrayList<Reservation> _reservationer = new ArrayList<Reservation>();

	public Person(Cprnr cprnr, String navn, String adresse, double saldo,
			double saldoYtd, double saldoLtd) {
		_cprnr = cprnr;
		_navn = navn;
		_adresse = adresse;
		_saldo = saldo;
		_saldoYtd = saldoYtd;
		_saldoLtd = saldoLtd;
	} // Person()

	public void reserver(Bog titel) {
		Reservation reservation = new Reservation(null, null, this);
		_reservationer.add(reservation);
	} // reserver()

	public String getNavn() {
		return _navn;
	} // getNavn()

	public void laaner(BogEksemplar bog) {
		Laan laan = new Laan(this, bog, null, null, 0);
		_laan.add(laan);
	} // addLaan()

	// TODO
	public void regulerSaldo(double belob) {

	}// regulerSaldo()

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format("Cpr nr: %s\n", _cprnr.getCprnr()));
		result.append(String.format("Navn: %s\n", _navn));
		result.append(String.format("Adresse: %s\n", _adresse));
		result.append(String.format("Saldo: %s\n", _saldo));
		result.append(String.format("SaldoYtd: %,.2f\n", _saldoYtd));
		result.append(String.format("SaldoLtd: %,.2f\n", _saldoLtd));
		return result.toString();
	}// toString()

}// Person
