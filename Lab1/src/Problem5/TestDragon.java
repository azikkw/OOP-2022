package Problem5;

public class TestDragon 
{
	public static void main(String args[]) 
	{
		DragonLunch d = new DragonLunch();

		Person p1 = new Person("A", Gender.BOY);
		Person p2 = new Person("B", Gender.GIRL);
		Person p3 = new Person("C", Gender.BOY);
		Person p4 = new Person("D", Gender.GIRL);
		Person p5 = new Person("E", Gender.GIRL);
		Person p6 = new Person("F", Gender.BOY);
		
		//for(Person cur: Person.kidnapped) {
			//System.out.println(cur);
		//}
		
		d.willDragonEatOrNot();
	}
}