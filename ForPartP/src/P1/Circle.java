package P1;

public class Circle extends Shape {
	
	public Circle(Color color, int pos) {
		super(color, pos);
	}
	
	public void draw() {
		System.out.println(" ".repeat(pos));
		if(color==Color.BLACK)
			System.out.println("()");
	}
}
