package Problem3;

public class TestTemperature
{
	public static void main(String args[]) 
	{
		Temperature t1 = new Temperature();
		Temperature t2 = new Temperature(25, "C");
		Temperature t3 = new Temperature(25);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

		t2.setValue(25);
		t2.setScale("C");
		t2.setBoth(18, "F");
		
		System.out.println(t2);
		System.out.println(t2.returnC(270));
		System.out.println(t2.returnF(27));
		System.out.println(t2.getScale());
	}
}