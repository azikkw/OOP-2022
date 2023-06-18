package Problem4;

import java.time.LocalDate;
import java.util.Vector;

public class Manager extends Employee
{
	final int bonusForOne = 30;
	
	Vector <Employee> employees = new Vector <Employee>();
	
	public Manager() {
		super();
	}
	
	public Manager(String name, double salary, LocalDate hireDate, String insuranceNumber, Vector <Employee> employees) {
		super(name, salary, hireDate, insuranceNumber);
		this.employees = employees;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		
		Manager m = (Manager)o;
		
		return this.employees == m.employees;
	} 
	
	public int getBonus() {
		return this.bonusForOne * employees.size();
	}
	
	@SuppressWarnings("unchecked")
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager)super.clone();
		m.employees = (Vector <Employee>)employees.clone();
		return m;
	}
	public int compareTo(Employee e) {
		if(super.compareTo(e) != 0) return super.compareTo(e);
		if(e instanceof Manager) {
			Manager m = (Manager)e;
			if(this.getBonus() > m.getBonus()) return 1;
			if(this.getBonus() < m.getBonus()) return -1;
		}
		return 0;
	}
	
	public String toString() {
		return super.toString() + ". Employees: " + this.employees + ". Bonus amount: " + this.getBonus(); 
	}
}