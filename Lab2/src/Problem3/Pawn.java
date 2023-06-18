package Problem3;

public class Pawn extends Piece
{
	public Pawn(String fig, Color color, Position a) {
		super(fig, color, a);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.isLegalMove(b)) return false;
		else if(b.getX() == a.getX() || b.getY() == a.getY()) return false;
		else if(b.getX() - a.getX() == 1 && b.getY() - a.getY() == 1) return true;
		else if(b.getX() - a.getX() == -1 && b.getY() - a.getY() == 1) return true;
		else return false;
	}
}