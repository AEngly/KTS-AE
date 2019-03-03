package BoardGame;

public class Board {
	
	public Piece[][] playarea;
	
	public Board(int h, int j) {
		this.playarea = new Piece[h][j];
	}

}
