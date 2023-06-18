package Problem3;

public class Rock extends Piece
{
	public Rock(String fig, Color color, Position a) {
		super(fig, color, a);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.isLegalMove(b)) return false;
		else if(b.getX() == a.getX() || b.getY() == a.getY()) return true;
		else return false;	
	}
}