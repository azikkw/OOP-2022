package Problem3;

public class King extends Piece
{
	public King(String fig, Color color, Position a) {
		super(fig, color, a);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.isLegalMove(b)) return false;
		else if(Math.abs(b.getX() - a.getX()) == 1 || Math.abs(b.getY() - a.getY()) == 1) return true;
		else if(Math.abs(b.getX() - a.getX()) == 1 && Math.abs(b.getY() - a.getY()) == 1) return true;
		else return false;
	}
}