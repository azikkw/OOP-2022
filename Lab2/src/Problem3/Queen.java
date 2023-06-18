package Problem3;

public class Queen extends Piece
{
	public Queen(String fig, Color color, Position a) {
		super(fig, color, a);
	}
	
	public boolean isLegalMove(Position b) {
		Rock r = new Rock("r", Color.B, a);
		Bishop bi = new Bishop("b",Color.B, a);
		
		if(a.equals(b)) return false;
		if(r.isLegalMove(b) || bi.isLegalMove(b)) return true;
		else return false;
	}
	
//	public boolean isLegalMove(Position b) {
//		if(a.equals(b)) return false;
//		else if(b.equals(null)) return false;
//		else if(b.getX() == 0 || b.getY() > 8) return false;
//		else if(b.getX() == a.getX() || b.getY() == a.getY()) return true;
//		else if(Math.abs(b.getX() - a.getX()) == Math.abs(b.getY() - a.getY())) return true;
//		else return false;
//
//	}
}