package Problem2;

public class TestCar
{
	public static void main(String args[])
	{
		Car car1 = new Car();
		Car car2 = new Car("Mercedes", Segment.F, "Black", 3.5);
		Car car3 = new Car("Range Rover", Segment.J, "Brown", 4.6);
		
		//System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		//car1.sumOfSegments = 5;
		
		System.out.println(car2.sumOfSegments);
		
		double v1 = 2.5;
		double v2 = 6.7;
		double v3 = 3;

		// Method overloading
		System.out.println(car3.sumVolume(v1, v2));
		System.out.println(car3.sumVolume(v1, v2, v3));
		
		System.out.println(car2.getCnt());
	}
}