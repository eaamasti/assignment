package myPackage;

public class PlannedLecture {

	private Lecture _lecture;
	private String _forum;
	private NewGregorianCalendar _calendar;
	private double _entryFee;

	public PlannedLecture(Lecture lecture, String forum,
			NewGregorianCalendar calendar, double entryFee) {
		_lecture = lecture;
		_forum = forum;
		_calendar = calendar;
		_entryFee = entryFee;
	} // PlannedLecture()

	@Override
	public String toString() { 
		StringBuilder result = new StringBuilder();
		result.append(String.format("Lecture: %s\n", _lecture));
		result.append(String.format("Forum: %s\n", _forum));
		result.append(String.format("Calendar: %s\n", _calendar));
		result.append(String.format("Entry fee: %s\n", _entryFee));		
		return result.toString();
	} // toString()
	
} // ClassPlannedLecture
