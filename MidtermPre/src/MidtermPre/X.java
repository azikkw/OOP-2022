package MidtermPre;

import java.util.Objects;
import java.util.Vector;

public class X 
{
	String name;
	
	private int age;
	
	Gender gender;
	
	static Vector <X> xes;
	
	static {
		xes = new Vector <X>();
	} 
	{
		xes.add(this);
	}
	
	public X() {}
	
	public X(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int idSum(int i) {
		return i;
	}
	
	public void accessTo() {
		if(this.getAge() > 10) System.out.println("You have access !!!");
		else {
			System.out.println("Sorry, but you do not have access :(");
		}
	}
	
	public boolean equals(Object o) {
		
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		X x = (X)o;
		
		return this.name == x.name && this.age == x.age && this.gender == x.gender;
	}
	
	public int hashCode() {
		
//		int result = 17;
//		
//		result = (31 * result) + name.hashCode();
//		result = (31 * result) + age;
//		result = (31 * result) + gender.hashCode();
//		
//		return result;
		
		return Objects.hash(name, age, gender);
	}
	
	public String toString() {
		return "Name " + this.name + ", Age - " + this.getAge() + ", Gender - " + this.gender;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}