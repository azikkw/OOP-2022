package Problem4;

import practice2.Student;

public class TestGradeBook 
{
	public static void main(String args[])
	{
		GradeBook g = new GradeBook(); 
		
		Course OOP = new Course("CS101", "Object-oriented Programming and Design");

		Student s1 = new Student(15011, "A", 92);
		Student s2 = new Student(12021, "B", 88);
		Student s3 = new Student(11011, "C", 79);
		Student s4 = new Student(10010, "D", 70);
		Student s5 = new Student(10115, "E", 65);
		Student s6 = new Student(10348, "F", 50);
		Student s7 = new Student(12008, "G", 100);
		Student s8 = new Student(12009, "H", 35);
		

		System.out.println(g.displayMessage(OOP));
		
		g.displayStudents();
		System.out.println(g);
		g.outputBarChart();
		
	}
}