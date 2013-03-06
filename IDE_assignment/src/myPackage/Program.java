package myPackage;

public class Program {

	// ******* ******* ******* ******* ******* ******* *******
	// ATTENSION
	//
	// The program can only handle one library.
	//
	// To handle several libraries would be too tricky with the current design.
	// ******* ******* ******* ******* ******* ******* *******

	public static void main(String[] args) {
		Program program = new Program();
		program.entry();
	} // main()

	private void entry() {
		// First create the dummies
		insertDummies();

		// Second - print the dummies
		printDummies();
	} // entry()

	private void insertDummies() {
		Dummies dummies = new Dummies();
		dummies.insertDummies();
	} // insertDummies()

	private void printDummies() {
		PrintDummies printDummies = new PrintDummies();

		System.out.println("_______________________________________");
		System.out.println("Emner");
		System.out.println("_______________________________________");
		printDummies.printEmner();

		System.out.println("_______________________________________");
		System.out.println("Forfattere");
		System.out.println("_______________________________________");
		printDummies.printForfatter();

		System.out.println("_______________________________________");
		System.out.println("BogEksemplarer");
		System.out.println("_______________________________________");
		printDummies.printBogEksemplarer();

		System.out.println("_______________________________________");
		System.out.println("Reservationer");
		System.out.println("_______________________________________");
		printDummies.printReservationer();

		System.out.println("_______________________________________");
		System.out.println("Planned Lectures");
		System.out.println("_______________________________________");
		printDummies.printPlannedLecture();

		System.out.println("_______________________________________");
		System.out.println("Lecture");
		System.out.println("_______________________________________");
		printDummies.printLecture();

		System.out.println("_______________________________________");
		System.out.println("Personer");
		System.out.println("_______________________________________");
		printDummies.printPersoner();

		System.out.println("_______________________________________");
		System.out.println("Ansatte");
		System.out.println("_______________________________________");
		printDummies.printAnsatte();
	} // printDummies()

} // Class Program
