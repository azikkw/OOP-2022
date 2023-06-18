package P1;

public abstract class Shape 
{
	Color color;
	
	int pos;
	
	public Shape() {
		
	}
	
	public Shape(Color color, int pos) {
		this.color = color;
		this.pos = pos;
	}
	
	public abstract void draw();
}
