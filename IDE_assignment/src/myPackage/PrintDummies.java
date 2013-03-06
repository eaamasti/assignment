package myPackage;

public class PrintDummies {

	private Database _database;

	public PrintDummies() {
		_database = Database.getInstance();
	} // PrintDummies()

	public void printEmner() {
		for (Emne emne : _database.getEmne())
			System.out.println(emne);
	} // printEmner()

	public void printForfatter() {
		for (Forfatter forfatter : _database.getForfatter())
			System.out.println(forfatter);
	} // printForfatter()

	public void printBogEksemplarer() {
		for (Bog bogEksemplar : _database.getBog())
			System.out.println(bogEksemplar);
	} // printBogEksemplarer()

	public void printReservationer() {
		for (Reservation reservation : _database.getReservation())
			System.out.println(reservation);
	} // printReservation()

	public void printPlannedLecture() {
		for (PlannedLecture plannedLecture : _database.getPlannedLecture())
			System.out.println(plannedLecture);
	} // printPlannedLecture()
	
	public void printLecture() {
		for (Lecture lecture : _database.getLecture())
			System.out.println(lecture);
	} // printLecture()
	
	public void printPersoner() {
		for (Person person : _database.getPerson())
			System.out.println(person);
	} // printPersoner()

	public void printAnsatte() {
		for (Person ansat : _database.getAnsat())
			System.out.println(ansat);
	} // printPersoner()
	
	public void printLaan(){
		for (Laan laan : _database.getLaan())
			System.out.println(laan);
	} // printLaan()
	
} // Class PrintDummies
