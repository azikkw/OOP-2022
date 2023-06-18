package MidtermPre;

import java.util.Objects;

public class Y extends X
{
	int id;
	
	String uni;
	
	public Y(int id, String uni) {
		super();
		this.id = id;
		this.uni = uni;
	}
	
	public Y(String name, int age, Gender gender, int id, String uni) {
		super(name, age, gender);
		this.id = id;
		this.uni = uni;
	}
	
	public int idSum(int i, int i1, int i2) {
		i1 = this.id;
		i2 = this.id;
		
		i = i1 + i2;
		
		return i;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void accessTo() {
		if(this.getAge() > 18) System.out.println("You are over 18. You have access !!!");
		else {
			System.out.println("Sorry, but you do not have access :(");			
		}
	}
	
	public boolean equals(Object o) {
		
		if(!super.equals(o)) return false;
		
		Y y = (Y)o;
		
		return this.id == y.id && this.uni == y.uni;
	}
	
	public int hashCode() {
		
//		int result = 17;
//		
//		result = (31 * result) + super.hashCode();
//		result = (31 * result) + id;
//		result = (31 * result) + uni.hashCode();
//		
//		return result;
		
		return Objects.hash(name, this.getAge(), gender, id, uni);
	}
	
	public String toString() {
		return "Student " + super.toString() + ", ID - " + this.id + ", University - " + this.uni;
	}
}