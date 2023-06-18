package Problem4;

import java.time.LocalDate;

public class Employee extends Person implements Cloneable, Comparable <Employee>
{
	double salary;
	LocalDate hireDate;
	String insuranceNumber;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, double salary, LocalDate hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		
		Employee e = (Employee)o;
		
		return this.salary == e.salary && 
				this.hireDate == e.hireDate && 
				this.insuranceNumber.equals(e.insuranceNumber);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int compareTo(Employee e) {
		if(this.salary > e.salary) return 1;
		if(this.salary < e.salary) return -1;
		return this.name.compareTo(e.name);
	}
	
	public String toString() {
		return super.toString() + 
				". With salary: " + this.salary + 
				", Hire date: " + this.hireDate + 
				", Insurance Number: " + this.insuranceNumber; 
	}
}