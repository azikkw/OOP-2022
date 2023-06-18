package Problem2;

class Car 
{
	String mark;
	String color;
	
	Segment segment;
	
	double capacity;
	
	private static int cnt;
	final int sumOfSegments;
	
	{
		mark = "TOYOTA Camry";
		color = "White";
		capacity = 2.5;
		sumOfSegments = 9;
	}
	
	public Car() {
		cnt += 1;
	}
	
	public Car(String mark, Segment segment, String color, double capacity) {
		this();
		this.mark = mark;
		this.segment = segment;
		this.color = color;
		this.capacity = capacity;
	}
	
	public double sumVolume(double v1, double v2) {
		return v1 + v2;
	}
	public double sumVolume(double v1, double v2, double v3) {
		return v1 + v2 + v3;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public String toString() {
		return "Your car - " +
				"Mark: " + mark + ", " + 
				"Segment: " + segment + ", " + 
				"Color: " + color + ", " +
				"Engine capacity: " + capacity; 
	}
}