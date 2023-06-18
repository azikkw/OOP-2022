package Problem3;

public class Knight extends Piece
{
	public Knight(String fig, Color color, Position a) {
		super(fig, color, a);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.isLegalMove(b)) return false;
		else if(b.getX() == a.getX() || b.getY() == a.getY()) return false;
		else if(Math.abs(b.getX() - a.getX()) == 2 && Math.abs(b.getY() - a.getY()) == 1) return true;
		else if(Math.abs(b.getX() - a.getX()) == 1 && Math.abs(b.getY() - a.getY()) == 2) return true;	
		else return false;
	}
}