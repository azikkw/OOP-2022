package practice2;

public class StudentTest 
{
	public static void main(String args[])
	{
		Student s = new Student();

		Student s1 = new Student(15011, "A", 92);
		Student s2 = new Student(12021, "B", 88);
		Student s3 = new Student(11011, "C", 79);
		Student s4 = new Student(10010, "D", 70);
		
		
		for(Student cur: Student.studentsList) 
			System.out.println(cur);
		
		System.out.println(s.getId());
	}
}