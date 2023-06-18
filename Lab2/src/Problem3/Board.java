package Problem3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Board
{
	final String [][] board = new String [8][8];
	final String empty = "|   |";
	
	Piece piece = new Piece();
	
	public Board() {}
	
	public void drawBoard() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = empty;
			}
		}
	}
	public void addPieces() {
		Position a = new Position('a', 1);
		
		Pawn p = new Pawn("| P |", Color.W, a);
		Pawn p1 = new Pawn("| p |", Color.B, a);
		piece.pieces[0] = p;
		piece.pieces[1] = p1;

		Rock r = new Rock("| R |", Color.W, a);
		Rock r1 = new Rock("| r |", Color.B, a);
		piece.pieces[2] = r;
		piece.pieces[3] = r1;
		
		Knight kn = new Knight("| N |", Color.W, a);
		Knight kn1 = new Knight("| n |", Color.B, a);
		piece.pieces[4] = kn;
		piece.pieces[5] = kn1;
		
		Bishop bi = new Bishop("| B |", Color.W, a);
		Bishop bi1 = new Bishop("| b |", Color.B, a);
		piece.pieces[6] = bi;
		piece.pieces[7] = bi1;
		
		Queen q = new Queen("| Q |", Color.W, a);
		Queen q1 = new Queen("| q |", Color.B, a);
		piece.pieces[8] = q;
		piece.pieces[9] = q1;
		
		King k = new King("| K |", Color.W, a);
		King k1 = new King("| k |", Color.B, a);
		piece.pieces[10] = k;
		piece.pieces[11] = k1;
	}
	public void fillBoard() {
		addPieces();
		for(int i = 0; i < 8; i++) {
			board[1][i] = piece.pieces[1].fig;
		}
		board[0][0] = piece.pieces[3].fig;
		board[0][1] = piece.pieces[5].fig;
		board[0][2] = piece.pieces[7].fig;
		board[0][3] = piece.pieces[9].fig;
		board[0][4] = piece.pieces[11].fig;
		board[0][5] = piece.pieces[7].fig;
		board[0][6] = piece.pieces[5].fig;
		board[0][7] = piece.pieces[3].fig;
				
		for(int i = 0; i < 8; i++) {
			board[6][i] = piece.pieces[0].fig;
		}
		board[7][0] = piece.pieces[2].fig;
		board[7][1] = piece.pieces[4].fig;
		board[7][2] = piece.pieces[6].fig;
		board[7][3] = piece.pieces[8].fig;
		board[7][4] = piece.pieces[10].fig;
		board[7][5] = piece.pieces[6].fig;
		board[7][6] = piece.pieces[4].fig;
		board[7][7] = piece.pieces[2].fig;
	}
	public void printBoard() {
		System.out.println();
		
		for(char i = 'A'; i <= 'H'; i++) System.out.print("    " + i); 
		
		System.out.println();
		System.out.print("  ");
		
		for(int i = 0; i < board.length * 5; i++) {
			System.out.print("-");
		}

		System.out.println();
		
		for(int i = 0; i < board.length; i++) {
			System.out.print((8 - i) + " ");
			
			for(int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			
			System.out.print(" " + (8 - i));
			System.out.println();
			System.out.print("  ");
			
			for(int t = 0; t < board.length * 5; t++) {
				System.out.print("-");
			}

			System.out.println();
		}

		for(char i = 'A'; i <= 'H'; i++) System.out.print("    " + i); 
		
		System.out.println();
	}
	
	public void gameForWhite1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nChoose the piece you want to make a move(For white):\n" +
							"1. p - Pawn\n" +
							"2. r - Rock\n" +
							"3. n - Knight\n" +
							"4. b - Bishop\n" +
							"5. k - King\n" +
							"6. q - Queen\n" +
							"7. e - for exit\n");
		
		String f = br.readLine();
		
		if(f.equals("p")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, i);
			Pawn p = new Pawn("| P |", Color.W, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, i1);
			

			if(board[8 - b.getY()][b.getX() - 1] != empty && p.color == piece.pieces[0].color) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(p.isLegalMove(b)) {
				board[8 - b.getY()][b.getX() - 1] = p.fig;
				board[8 - a.getY()][a.getX() - 1] = empty;
				piece.pieces[8 - b.getY()].color = Color.W;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForWhite1();
			}
		}
		if(f.equals("r")) {
				System.out.println("Choose position A:");
				char c = br.readLine().charAt(0);
				int i = Integer.parseInt(br.readLine());
				Position a = new Position(c, i);
				Rock r = new Rock("| R |", Color.W, a);

				System.out.println("Choose position B:");
				char c1 = br.readLine().charAt(0);
				int i1 = Integer.parseInt(br.readLine());
				Position b = new Position(c1, i1);

				int cnt = 0;
				for(int s = 8 - a.getY(); s >= 8 - b.getY(); s--) {
					if(board[s - 1][b.getX() - 1] != empty && r.color == piece.pieces[s - 1].color) {
						cnt += 1;
					}
				}
				for(int s = 8 - a.getY() + 1; s <= 8 - b.getY(); s++) {
					if(board[s][b.getX() - 1] != empty && r.color == piece.pieces[0].color) {
						cnt += 1;
					}
				}
				if(cnt > 0) {
					System.out.println("Cannot move because same colors");
					printBoard();
					gameForWhite1();
				}
				else if(r.isLegalMove(b)) {
					board[8 - b.getY()][b.getX() - 1] = r.fig;
					board[8 - a.getY()][a.getX() - 1] = empty;
					piece.pieces[8 - b.getY()].color = Color.W;
					printBoard();
				}
				else {
					System.out.println("Cannot move");
					printBoard();
					gameForWhite1();
				}
		}
		if(f.equals("n")) {
				System.out.println("Choose position A:");
				char c = br.readLine().charAt(0);
				int i = Integer.parseInt(br.readLine());
				Position a = new Position(c, i);
				Knight k = new Knight("| N |", Color.W, a);

				System.out.println("Choose position B:");
				char c1 = br.readLine().charAt(0);
				int i1 = Integer.parseInt(br.readLine());
				Position b = new Position(c1, i1);

				int cnt = 0;
				for(int s = 8 - a.getY(); s >= 8 - b.getY(); s--) {
					if(board[s - 1][b.getX() - 1] != empty && k.color == piece.pieces[s - 1].color) {
						cnt += 1;
					}
				}
				for(int s = 8 - a.getY() + 1; s <= 8 - b.getY(); s++) {
					if(board[s][b.getX() - 1] != empty && k.color == piece.pieces[0].color) {
						cnt += 1;
					}
				}
				if(cnt > 0) {
					System.out.println("Cannot move because same colors");
					printBoard();
					gameForWhite1();
				}
				else if(k.isLegalMove(b)) {
					board[8 - b.getY()][b.getX() - 1] = k.fig;
					board[8 - a.getY()][a.getX() - 1] = empty;
					piece.pieces[8 - b.getY()].color = Color.W;
					printBoard();
				}
				else {
					System.out.println("Cannot move");
					printBoard();
					gameForWhite1();
				}
		}
		if(f.equals("b")) {
				System.out.println("Choose position A:");
				char c = br.readLine().charAt(0);
				int i = Integer.parseInt(br.readLine());
				Position a = new Position(c, i);
				Bishop bi = new Bishop("| B |", Color.W, a);

				System.out.println("Choose position B:");
				char c1 = br.readLine().charAt(0);
				int i1 = Integer.parseInt(br.readLine());
				Position b = new Position(c1, i1);

				int cnt = 0;
				for(int s = 8 - a.getY(); s >= 8 - b.getY(); s--) {
					if(board[s - 1][b.getX() - 1] != empty && bi.color == piece.pieces[s - 1].color) {
						cnt += 1;
					}
				}
				for(int s = 8 - a.getY() + 1; s <= 8 - b.getY(); s++) {
					if(board[s][b.getX() - 1] != empty && bi.color == piece.pieces[0].color) {
						cnt += 1;
					}
				}
				if(cnt > 0) {
					System.out.println("Cannot move because same colors");
					printBoard();
					gameForWhite1();
				}
				else if(bi.isLegalMove(b)) {
					board[8 - b.getY()][b.getX() - 1] = bi.fig;
					board[8 - a.getY()][a.getX() - 1] = empty;
					piece.pieces[8 - b.getY()].color = Color.W;
					printBoard();
				}
				else {
					System.out.println("Cannot move");
					printBoard();
					gameForWhite1();
				}
		}
		if(f.equals("k")) {
				System.out.println("Choose position A:");
				char c = br.readLine().charAt(0);
				int i = Integer.parseInt(br.readLine());
				Position a = new Position(c, i);
				King k = new King("| K |", Color.W, a);

				System.out.println("Choose position B:");
				char c1 = br.readLine().charAt(0);
				int i1 = Integer.parseInt(br.readLine());
				Position b = new Position(c1, i1);

				int cnt = 0;
				for(int s = 8 - a.getY(); s >= 8 - b.getY(); s--) {
					if(board[s - 1][b.getX() - 1] != empty && k.color == piece.pieces[s - 1].color) {
						cnt += 1;
					}
				}
				for(int s = 8 - a.getY() + 1; s <= 8 - b.getY(); s++) {
					if(board[s][b.getX() - 1] != empty && k.color == piece.pieces[0].color) {
						cnt += 1;
					}
				}
				if(cnt > 0) {
					System.out.println("Cannot move because same colors");
					printBoard();
					gameForWhite1();
				}
				else if(k.isLegalMove(b)) {
					board[8 - b.getY()][b.getX() - 1] = k.fig;
					board[8 - a.getY()][a.getX() - 1] = empty;
					piece.pieces[8 - b.getY()].color = Color.W;
					printBoard();
				}
				else {
					System.out.println("Cannot move");
					printBoard();
					gameForWhite1();
				}
		}
		if(f.equals("q")) {
				System.out.println("Choose position A:");
				char c = br.readLine().charAt(0);
				int i = Integer.parseInt(br.readLine());
				Position a = new Position(c, i);
				Queen q = new Queen("| Q |", Color.W, a);

				System.out.println("Choose position B:");
				char c1 = br.readLine().charAt(0);
				int i1 = Integer.parseInt(br.readLine());
				Position b = new Position(c1, i1);

				int cnt = 0;
				for(int s = 8 - a.getY(); s >= 8 - b.getY(); s--) {
					if(board[s - 1][b.getX() - 1] != empty && q.color == piece.pieces[s - 1].color) {
						cnt += 1;
					}
				}
				for(int s = 8 - a.getY() + 1; s <= 8 - b.getY(); s++) {
					if(board[s][b.getX() - 1] != empty && q.color == piece.pieces[0].color) {
						cnt += 1;
					}
				}
				if(cnt > 0) {
					System.out.println("Cannot move because same colors");
					printBoard();
					gameForWhite1();
				}
				else if(q.isLegalMove(b)) {
					board[8 - b.getY()][b.getX() - 1] = q.fig;
					board[8 - a.getY()][a.getX() - 1] = empty;
					piece.pieces[8 - b.getY()].color = Color.W;
					printBoard();
				}
				else {
					System.out.println("Cannot move");
					printBoard();
					gameForWhite1();
				}
		}
		if(f.equals("e")) System.exit(0);
	}
	public void gameForBlack1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nChoose the piece you want to make a move (For black):\n" +
							"1. p - Pawn\n" +
							"2. r - Rock\n" +
							"3. n - Knight\n" +
							"4. b - Bishop\n" +
							"5. k - King\n" +
							"6. q - Queen\n" +
							"7. e - for exit\n");
		
		String f1 = br.readLine();
		
		if(f1.equals("p")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, 8 - i);
			Pawn p = new Pawn("| p |", Color.B, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, 8 - i1);

			if(board[b.getY()][b.getX() - 1] != empty && p.color == piece.pieces[1].color) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(p.isLegalMove(b)) {
				board[b.getY()][b.getX() - 1] = p.fig;
				board[a.getY()][a.getX() - 1] = empty;
				piece.pieces[b.getY()].color = Color.B;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForBlack1();
			}
		}
		if(f1.equals("r")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, 8 - i);
			Rock r = new Rock("| r |", Color.B, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, 8 - i1);

			int cnt = 0;
			for(int s = a.getY() + 1; s <= b.getY() ; s++) {
				if(board[s][b.getX() - 1] != empty && r.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			for(int s = a.getX() - 1; s <= b.getX() - 1; s++) {
				if(board[b.getY()][s] != empty && r.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			for(int s = a.getX() - 1; s >= b.getX() - 1; s--) {
				if(board[b.getY()][s] != empty && r.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			if(cnt > 0) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(r.isLegalMove(b)) {
				board[b.getY()][b.getX() - 1] = r.fig;
				board[a.getY()][a.getX() - 1] = empty;
				piece.pieces[b.getY()].color = Color.B;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForBlack1();
			}
		}
		if(f1.equals("n")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, 8 - i);
			Knight k = new Knight("| n |", Color.B, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, 8 - i1);

			int cnt = 0;
			for(int s = a.getY() + 1; s <= b.getY() ; s++) {
				if(board[s][b.getX() - 1] != empty && k.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			if(cnt > 0) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(k.isLegalMove(b)) {
				board[b.getY()][b.getX() - 1] = k.fig;
				board[a.getY()][a.getX() - 1] = empty;
				piece.pieces[b.getY()].color = Color.B;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForBlack1();
			}
		}
		if(f1.equals("b")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, 8 - i);
			Bishop bi = new Bishop("| b |", Color.B, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, 8 - i1);

			int cnt = 0;
			for(int s = a.getY() + 1; s <= b.getY() ; s++) {
				if(board[s][b.getX() - 1] != empty && bi.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			if(cnt > 0) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(bi.isLegalMove(b)) {
				board[b.getY()][b.getX() - 1] = bi.fig;
				board[a.getY()][a.getX() - 1] = empty;
				piece.pieces[b.getY()].color = Color.B;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForBlack1();
			}
		}
		if(f1.equals("k")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, 8 - i);
			King k = new King("| k |", Color.B, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, 8 - i1);

			int cnt = 0;
			for(int s = a.getY() + 1; s <= b.getY() ; s++) {
				if(board[s][b.getX() - 1] != empty && k.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			for(int s = a.getX() - 1; s <= b.getX() - 1; s++) {
				if(board[b.getY()][s] != empty && k.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			for(int s = a.getX() - 1; s >= b.getX() - 1; s--) {
				if(board[b.getY()][s] != empty && k.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			if(cnt > 0) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(k.isLegalMove(b)) {
				board[b.getY()][b.getX() - 1] = k.fig;
				board[a.getY()][a.getX() - 1] = empty;
				piece.pieces[b.getY()].color = Color.B;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForBlack1();
			}
		}
		if(f1.equals("q")) {
			System.out.println("Choose position A:");
			char c = br.readLine().charAt(0);
			int i = Integer.parseInt(br.readLine());
			Position a = new Position(c, 8 - i);
			Queen q = new Queen("| q |", Color.B, a);

			System.out.println("Choose position B:");
			char c1 = br.readLine().charAt(0);
			int i1 = Integer.parseInt(br.readLine());
			Position b = new Position(c1, 8 - i1);

			int cnt = 0;
			for(int s = a.getY() + 1; s <= b.getY() ; s++) {
				if(board[s][b.getX() - 1] != empty && q.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			for(int s = a.getX() - 1; s <= b.getX() - 1; s++) {
				if(board[b.getY()][s] != empty && q.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			for(int s = a.getX() - 1; s >= b.getX() - 1; s--) {
				if(board[b.getY()][s] != empty && q.color == piece.pieces[s].color) {
					cnt += 1;
				}
			}
			if(cnt > 0) {
				System.out.println("Cannot move because same colors");
				printBoard();
				gameForBlack1();
			}
			else if(q.isLegalMove(b)) {
				board[b.getY()][b.getX() - 1] = q.fig;
				board[a.getY()][a.getX() - 1] = empty;
				piece.pieces[b.getY()].color = Color.W;
				piece.pieces[b.getY()].color = Color.B;
				printBoard();
			}
			else {
				System.out.println("Cannot move");
				printBoard();
				gameForBlack1();
			}
		}
		if(f1.equals("e")) System.exit(0);
	}

	public void game() throws Exception {
		drawBoard();
		
		System.out.println("\nWelcome to My Chess Game:\n" +
							"st - For start game\n" +
							"e - For exit\n");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		if(s.equals("st")) {
			fillBoard();
			printBoard();
			while(true) {
				gameForWhite1();
				gameForBlack1();
			}
		}
		if(s.equals("e")) System.exit(0);
	}
	
	public static void main(String[] args) throws Exception {
		new Board().game();
	}
}