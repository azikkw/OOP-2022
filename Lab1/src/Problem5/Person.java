package Problem5;

import java.util.Vector;

public class Person 
{
	String name;
	
	Gender gender;
	
	static Vector <Person> kidnapped;
	
	static {
		kidnapped = new Vector <Person>();
	}
	{
		kidnapped.add(this);
	}
	
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String toString() {
		return name + " " + gender;
	}
}