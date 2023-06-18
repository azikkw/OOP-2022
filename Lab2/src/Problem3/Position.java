package Problem3;

public class Position 
{
	char x;
	int y;
	
	private int realX;
	private int realY;
	
	public Position(char x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		if(this.x == 'a') this.realX = 1;
		if(this.x == 'b') this.realX = 2;
		if(this.x == 'c') this.realX = 3;
		if(this.x == 'd') this.realX = 4;
		if(this.x == 'e') this.realX = 5;
		if(this.x == 'f') this.realX = 6;
		if(this.x == 'g') this.realX = 7;
		if(this.x == 'h') this.realX = 8;
		return this.realX;
	}
	public int getY() {
		this.realY = this.y;
		return this.realY;
	}

	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		Position p = (Position)o;
		
		return this.x == p.x && this.y == p.y;
	}
	
	public String toString() {
		return this.x + "" + this.y;
	}
}