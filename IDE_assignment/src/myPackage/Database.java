package myPackage;

import java.util.ArrayList;

/**
 * Uses the Singleton design pattern
 * */
public class Database {

	private Bibliotek _bibliotek = new Bibliotek("Biblioteksnavnet");
	private ArrayList<Person> _person = new ArrayList<Person>();
	private ArrayList<Ansat> _ansat = new ArrayList<Ansat>();
	private ArrayList<Laan> _laan = new ArrayList<Laan>();
	private ArrayList<Reservation> _reservation = new ArrayList<Reservation>();
	private ArrayList<Bog> _bog = new ArrayList<Bog>();
	private ArrayList<Bog> _bogEksemplar = new ArrayList<Bog>();
	private ArrayList<Forfatter> _forfatter = new ArrayList<Forfatter>();
	private ArrayList<Emne> _emne = new ArrayList<Emne>();
	private ArrayList<Lecture> _lecture = new ArrayList<Lecture>();
	private ArrayList<PlannedLecture> _plannedLecture = new ArrayList<PlannedLecture>();

	// ******* ******* ******* ******* ******* ******* ******* ******* *******
	// BEGIN: create the Singleton design pattern
	private static Database _singleObject;

	private Database() {
	}

	public static Database getInstance() {
		if (_singleObject == null)
			_singleObject = new Database();

		return _singleObject;
	} // getInstance()

	// END: create the Singleton design pattern
	// ******* ******* ******* ******* ******* ******* ******* ******* *******

	// ******* ******* ******* ******* ******* ******* ******* ******* *******
	// BEGIN: add, setters and removes

	public Bibliotek getBibliotek() {
		return _bibliotek;
	}

	//
	
	public void addPerson(Person person) {
		_person.add(person);
	} // addPerson()

	public ArrayList<Person> getPerson() {
		return _person;
	} // getPerson()

	public void removePerson(int index) {
		_person.remove(index);
	} // removePerson()

	//

	public void addAnsat(Ansat ansat) {
		_ansat.add(ansat);
	} // addAnsat()

	public ArrayList<Ansat> getAnsat() {
		return _ansat;
	} // getAnsat()

	public void removeAnsat(int index) {
		_ansat.remove(index);
	} // removeAnsat()

	//

	public void addLaan(Laan laan) {
		_laan.add(laan);
	} // addLaan()

	public ArrayList<Laan> getLaan() {
		return _laan;
	} // getLaan()

	public void removeLaan(int index) {
		_laan.remove(index);
	} // removeLaan()

	//

	public void addReservation(Reservation reservation) {
		_reservation.add(reservation);
	} // addReservation()

	public ArrayList<Reservation> getReservation() {
		return _reservation;
	} // getReservation()

	public void removeReservation(int index) {
		_reservation.remove(index);
	}// removeReservation()

	//

	public void addBog(Bog bog) {
		_bog.add(bog);
	} // addBog()

	public ArrayList<Bog> getBog() {
		return _bog;
	} // getBog()

	public void removeBog(int index) {
		_bog.remove(index);
	}// removeBog()

	//

	public void addBogEksemplar(Bog bogEksemplar) {
		_bogEksemplar.add(bogEksemplar);
	} // addBogEksemplar()

	public ArrayList<Bog> getBogEksemplar() {
		return _bogEksemplar;
	} // getBogEksemplar()

	public void removeBogEksemplar(int index) {
		_bogEksemplar.remove(index);
	}// removeBogEksemplar()

	//

	public void addForfatter(Forfatter forfatter) {
		_forfatter.add(forfatter);
	} // addForfatter()

	public ArrayList<Forfatter> getForfatter() {
		return _forfatter;
	} // getForfatter()

	public void removeForfatter(int index) {
		_forfatter.remove(index);
	}// removeForfatter()

	//

	public void addEmne(Emne emne) {
		_emne.add(emne);
	} // addEmne()

	public ArrayList<Emne> getEmne() {
		return _emne;
	} // getEmne()

	public void removeEmne(int index) {
		_emne.remove(index);
	}// removeEmne()

	//

	public void addLecture(Lecture lecture) {
		_lecture.add(lecture);
	} // addLecture()

	public ArrayList<Lecture> getLecture() {
		return _lecture;
	} // getLecture()

	public void removeLecture(int index) {
		_lecture.remove(index);
	}// removeLecture()

	//

	public void addPlannedLecture(PlannedLecture plannedLecture) {
		_plannedLecture.add(plannedLecture);
	} // addPlannedLecture()

	public ArrayList<PlannedLecture> getPlannedLecture() {
		return _plannedLecture;
	} // getPlannedLecture()

	public void removePlannedLecture(int index) {
		_plannedLecture.remove(index);
	}// removePlannedLecture()

	// END: add, setters and removes
	// ******* ******* ******* ******* ******* ******* ******* ******* *******

} // class Database

