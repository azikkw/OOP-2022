package Problem1;

// Abstract classes have a hierarchical relationship, that is, they only connect logically related classes
// Abstract classes describes an abstract object (For example Person or Animal)
// Abstract classes have constructors

public abstract class Person // Cannot extend more than one class
{
	// Any fields, and without initialization (not all)
	public int age;
	protected String name;
	private int height;
	final int birthday = 0;
	
	public Person() {} // Empty constructor
	public Person(int age, String name) { // Constructor with body
		this.age = age;
		this.name = name;
	}
	
	// Any methods
	public void voice() {
		System.out.println("Hello");
	}
	abstract void move(); // Method with realization
}