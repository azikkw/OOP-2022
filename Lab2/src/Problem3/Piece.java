package Problem3;

public class Piece 
{
	Position a;
	String fig;
	Color color;

	public Piece[] pieces = new Piece[12];
	
	public Piece() {}
	
	public Piece(String fig, Color color, Position a) {
		this.a = a;
		this.fig = fig;
		this.color = color;
	}
	
	public boolean isLegalMove(Position b) {
		if(a.equals(b)) return false;
		if(b.equals(null)) return false;
		if(b.getX() == 0 || b.getY() > 8) return false;
		else return true;
	}
	
	public String toString() {
		return this.fig + " " + this.color + " " + this.a;
	}
}