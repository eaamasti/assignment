package myPackage;

public class Dummies {

	private Database _database;

	public Dummies() {
		_database = Database.getInstance();
	} // Dummies()

	/** Call the other methods */
	public void insertDummies() {
		insertPersoner();
		insertAnsatte();
		insertEmner();
		insertForfattere();
		insertBoger();
		insertBogEksemplare();
		insertReservation();
		insertLecture();
		insertPlannedLectures();
	} // insertDummies()
	
	private void insertPersoner() {
		Cprnr cprnr;
		Person person;
		
		cprnr = new Cprnr(1111111111L);
		person = new Person(cprnr, "Name-A", "Address-A", 1, 1, 1);
		_database.addPerson(person);

		cprnr = new Cprnr(2222222222L);
		person = new Person(cprnr, "Name-B", "Address-B", 2,2,2);
		_database.addPerson(person);

		cprnr = new Cprnr(3333333333L);
		person = new Person(cprnr, "Name-C", "Address-C", 3,3,3);
		_database.addPerson(person);

		cprnr = new Cprnr(4444444444L);
		person = new Person(cprnr, "Name-D", "Address-D", 4,4,4);
		_database.addPerson(person);

		cprnr = new Cprnr(5555555555L);
		person = new Person(cprnr, "Name-E", "Address-E", 5,5,5);
		_database.addPerson(person);
	} // insertPersoner

	private void insertAnsatte() {
		Cprnr cprnr;
		Ansat ansat;
		
		cprnr = new Cprnr(6666666666L);
		ansat = new Ansat(cprnr, "Name-E", "Address-E", 5, 5, 5,
				"Stilling-A", "Speciale-A");
		_database.addAnsat(ansat);
		

		cprnr = new Cprnr(7777777777L);
		ansat = new Ansat(cprnr, "Name-F", "Address-F", 6, 6, 6, "Stilling-A",
				"Speciale-A");
		_database.addAnsat(ansat);
	} // insertAnsatte()

	private void insertEmner() {
		Emne emne = new Emne(1, "Emne-1");
		_database.addEmne(emne);

		emne = new Emne(2, "Emne-2");
		_database.addEmne(emne);

		emne = new Emne(3, "Emne-3");
		_database.addEmne(emne);

		emne = new Emne(4, "Emne-4");
		_database.addEmne(emne);
	} // insertEmner()

	private void insertForfattere() {
		Forfatter forfatter = new Forfatter("Name-1", 1901, 2001, "Born-1");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-2", 1902, 2002, "Born-2");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-3", 1903, 2003, "Born-3");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-4", 1904, 2004, "Born-4");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-5", 1905, 2005, "Born-5");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-6", 1906, 2006, "Born-6");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-7", 1907, 2007, "Born-7");
		_database.addForfatter(forfatter);

		forfatter = new Forfatter("Name-8", 1908, 2008, "Born-8");
		_database.addForfatter(forfatter);
	} // insertForfatter()

	/** Insert four dummy books */
	private void insertBoger() {
		Emne emne;
		Bog bog;
		Forfatter forfatter;

		emne = _database.getEmne().get(0);
		bog = new BogEksemplar("Titel-1", emne, 2001,1);
		forfatter = _database.getForfatter().get(0);
		bog.addForfatter(forfatter);
		_database.addBog(bog);
		
		emne = _database.getEmne().get(0);
		bog = new BogEksemplar("Titel-1", emne, 2001,2);
		forfatter = _database.getForfatter().get(0);
		bog.addForfatter(forfatter);
		_database.addBog(bog);

		emne = _database.getEmne().get(0);
		bog = new BogEksemplar("Titel-2", emne, 2002,1);
		forfatter = _database.getForfatter().get(1);
		bog.addForfatter(forfatter);
		_database.addBog(bog);
		
		emne = _database.getEmne().get(1);
		bog = new BogEksemplar("Titel-3", emne, 2003,1);
		forfatter = _database.getForfatter().get(1);
		bog.addForfatter(forfatter);
		_database.addBog(bog);
		
		emne = _database.getEmne().get(0);
		bog = new BogEksemplar("Titel-4", emne, 2001,1);
		forfatter = _database.getForfatter().get(2);
		bog.addForfatter(forfatter);
		_database.addBog(bog);
		
	} // insertBoger()

	private void insertBogEksemplare() {
		Bog bog;
		String titel;
		Emne emne;
		int aar;
		Bog bogEksemplar;

		// Three issues of book number one;
		bog = _database.getBog().get(0);
		titel = bog.getTitel();
		emne = bog.getEmne();
		aar = bog.getAar();
		bogEksemplar = new BogEksemplar(titel, emne, aar, 1);
		_database.addBogEksemplar(bogEksemplar);
		bogEksemplar = new BogEksemplar(titel, emne, aar, 2);
		_database.addBogEksemplar(bogEksemplar);
		bogEksemplar = new BogEksemplar(titel, emne, aar, 3);
		_database.addBogEksemplar(bogEksemplar);

		// Two issues of book nr two
		bog = _database.getBog().get(1);
		titel = bog.getTitel();
		emne = bog.getEmne();
		aar = bog.getAar();
		bogEksemplar = new BogEksemplar(titel, emne, aar, 1);
		_database.addBogEksemplar(bogEksemplar);
		bogEksemplar = new BogEksemplar(titel, emne, aar, 2);
		_database.addBogEksemplar(bogEksemplar);

		// one issues of book nr three
		bog = _database.getBog().get(2);
		titel = bog.getTitel();
		emne = bog.getEmne();
		aar = bog.getAar();
		bogEksemplar = new BogEksemplar(titel, emne, aar, 1);
		_database.addBogEksemplar(bogEksemplar);

		// one issues of book nr four
		bog = _database.getBog().get(3);
		titel = bog.getTitel();
		emne = bog.getEmne();
		aar = bog.getAar();
		bogEksemplar = new BogEksemplar(titel, emne, aar, 1);
		_database.addBogEksemplar(bogEksemplar);
	} // insertBogEksemplar()
	
	private void insertReservation() {
		Reservation reservation;
		Bog bog;
		NewGregorianCalendar dato;		
		Person laaner;
				
		// Person no 1 reserves 2 books
		bog = _database.getBog().get(0);
		dato = new  NewGregorianCalendar(2013, 03, 01);
		laaner = _database.getPerson().get(0);		
		reservation = new Reservation(bog, dato, laaner);		
		_database.addReservation(reservation);
		
		bog = _database.getBog().get(1);
		dato = new  NewGregorianCalendar(2013, 03, 01);
		laaner = _database.getPerson().get(0);		
		reservation = new Reservation(bog, dato, laaner);		
		_database.addReservation(reservation);						
	} //insertReservation()
	
	private void insertLecture(){				
		Ansat ansat;
		Lecture lecture;
		
		ansat = _database.getAnsat().get(0);
		lecture = new Lecture ("Title-1", ansat, "Description-1", 101);
		_database.addLecture(lecture);
		lecture = new Lecture ("Title-2", ansat, "Description-2", 102);
		_database.addLecture(lecture);
		
		ansat = _database.getAnsat().get(1);
		lecture = new Lecture ("Title-3", ansat, "Description-3", 103);
		_database.addLecture(lecture);
		lecture = new Lecture ("Title-4", ansat, "Description-4", 104);
		_database.addLecture(lecture);							
	} // insertLecture()
	
	private void insertPlannedLectures(){
		PlannedLecture plannedLecture;
		Lecture lecture;
		NewGregorianCalendar date;
		
		lecture = _database.getLecture().get(0);
		date = new NewGregorianCalendar(2013,3,1,12,0,0);
		plannedLecture = new PlannedLecture(lecture, "Forum-1", date, 101.0);
		_database.addPlannedLecture(plannedLecture);
		
		lecture = _database.getLecture().get(0);
		date = new NewGregorianCalendar(2013,3,2,12,0,0);
		plannedLecture = new PlannedLecture(lecture, "Forum-2", date, 102.0);
		_database.addPlannedLecture(plannedLecture);
		
		lecture = _database.getLecture().get(1);
		date = new NewGregorianCalendar(2013,3,3,12,0,0);
		plannedLecture = new PlannedLecture(lecture, "Forum-3", date, 103.0);
		_database.addPlannedLecture(plannedLecture);
		
		lecture = _database.getLecture().get(0);
		date = new NewGregorianCalendar(2013,3,4,12,0,0);
		plannedLecture = new PlannedLecture(lecture, "Forum-4", date, 104.0);
		_database.addPlannedLecture(plannedLecture);		
	} //insertPlannedLectures()
	
} // class Dummies
