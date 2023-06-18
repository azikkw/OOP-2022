package Problem4;

import practice2.Student;

public class GradeBook 
{
	public String displayMessage(Course course) {
		return course.toString();
	}
	
	public void displayStudents() {
		System.out.println("\n" + "Please, input grades for students:" + "\n");
		
		for(Student cur: Student.studentsList) {
			System.out.println(cur);
		}
	}
	
	public String displayGradeReport() {
		return "\n" + 
				"Class average is " + determineClassAverage() +
				". Lowest grade is " + lowestGrade() +
				". Highest grade is " + highestGrade() + "." + "\n";
	}
	
	public double determineClassAverage() {
		double sum = 0;
		
		for(int i = 0; i < Student.studentsList.size(); i++) {
			sum = sum + Student.studentsList.get(i).grade;
		}
		return sum / Student.studentsList.size();
	}
	public String lowestGrade() {
		
		int min = 100;
		String student_info = " ";
		
		for(int i = 0; i < Student.studentsList.size(); i++) {
			if(min > Student.studentsList.get(i).grade) {
				min = Student.studentsList.get(i).grade;
				student_info = " (Student " + Student.studentsList.get(i).name + 
						", id: " + Student.studentsList.get(i).getId() + ")";
			}
		}
		return min + student_info;
	}
	public String highestGrade() {
		
		int max = 0;
		String student_info = " ";
		
		for(int i = 0; i < Student.studentsList.size(); i++) {
			if(max < Student.studentsList.get(i).grade) {
				max = Student.studentsList.get(i).grade;
				student_info = " (Student " + Student.studentsList.get(i).name + 
								", id: " + Student.studentsList.get(i).getId() + ")";
			}
		}
		return max + student_info;
	}
	
	public void outputBarChart() {
		
		System.out.println("Grades distribution:");

		char ch = '*';
		String[] histogram  = new String[] {"00-09: ",
											"10-19: ",
											"20-29: ",
											"30-39: ",
											"40-49: ",
											"50-59: ",
											"60-69: ",
											"70-79: ",
											"80-89: ",
											"90-99: ",
											"100: ",};

		for(int i = 0; i < Student.studentsList.size(); i++) {
			if(0 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 9) {
				histogram[0] = new StringBuilder(histogram[0]).append(ch).toString();
			}
			if(10 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 19) {
				histogram[1] = new StringBuilder(histogram[1]).append(ch).toString();
			}
			if(20 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 29) {
				histogram[2] = new StringBuilder(histogram[2]).append(ch).toString();
			}
			if(30 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 39) {
				histogram[3] = new StringBuilder(histogram[3]).append(ch).toString();
			}
			if(40 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 49) {
				histogram[4] = new StringBuilder(histogram[4]).append(ch).toString();
			}
			if(50 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 59) {
				histogram[5] = new StringBuilder(histogram[5]).append(ch).toString();
			}
			if(60 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 69) {
				histogram[6] = new StringBuilder(histogram[6]).append(ch).toString();
			}
			if(70 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 79) {
				histogram[7] = new StringBuilder(histogram[7]).append(ch).toString();
			}
			if(80 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 89) {
				histogram[8] = new StringBuilder(histogram[8]).append(ch).toString();
			}
			if(90 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 99) {
				histogram[9] = new StringBuilder(histogram[9]).append(ch).toString();
			}
			if(Student.studentsList.get(i).grade >= 100) {
				histogram[10] = new StringBuilder(histogram[10]).append(ch).toString();
			}
		}
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(histogram[i]);
		}
	}

	public String toString() {
		return displayGradeReport();
	}
}