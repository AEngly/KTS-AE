package BoardGame;

public abstract class Board {
	
	private Piece[][] playarea;
	
	public Board(int h, int j) {
		this.playarea = new Piece[h][j];
	}
	
	public Piece getPiece(Coord pos) {
		return playarea[pos.getX()][pos.getY()];
	}
	
	public void setPiece(Piece p, Coord dest) {
		this.playarea[dest.getX()][dest.getY()] = p;
	}
	
//	public Piece[][] getPlayarea() {
//		return this.playarea;
//	}
		
}
