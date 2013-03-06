package myPackage;

public class Lecture {
	private String _title;
	private Ansat _lecture;
	private String _description;
	private int _duration;	

	public Lecture(String title, Ansat lecture, String description, int duration) {
		_title = title;
		_lecture = lecture;
		_description = description;
		_duration = duration;
	} // Lecture()

	public String getTitle() {
		return _title;
	} // getTitle()

	public void setDesc(String description) {
		_description = description;
	} // setDesc()
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format("Title: %s\n", _title));
		result.append(String.format("Lecture: %s\n", _lecture));
		result.append(String.format("duration: %s\n", _duration));
		return result.toString();
	} // toString()

} // class Lecture
