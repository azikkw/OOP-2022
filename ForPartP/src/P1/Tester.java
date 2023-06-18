package P1;

import java.util.Vector;

public class Tester {
	public static void main(String[] args) {
		Vector <Shape> sh = new Vector <Shape>();
		sh.add(new Circle(Color.BLACK, 4));
		
		for(Shape s: sh) {
			s.draw();
		}
	}
}
