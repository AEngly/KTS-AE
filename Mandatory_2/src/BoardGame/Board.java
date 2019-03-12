package BoardGame;

public abstract class Board {
	
	private Piece[][] playarea;
	
	public Board(int h, int j) {
		this.playarea = new Piece[h][j];
	}
	
	public Piece getPiece(Coord pos) {
		return playarea[pos.getY()][pos.getX()];
	}
	
	public void setPiece(Piece p, Coord dest) {
		this.playarea[dest.getY()][dest.getX()]= p;
	}
	
	public Piece[][] getPlayarea() {
		return this.playarea;
	}
		
}
