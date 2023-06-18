package Problem4;

public class Course
{
	String name;
	String description;
	String prerequisite;
	
	int numOfCredits;
	
	public Course(String description, String name) {
		this.name = name;
		this.description = description;
	}
	
	public String toString() {
		return "Welcome to the grade book for " + this.description + " " + this.name + "!";
	}
}