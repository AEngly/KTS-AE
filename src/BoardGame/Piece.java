package BoardGame;

public abstract class Piece {
	
	private Coord pos;
	Player colour;
	
	public Piece(Player colour) {
		this.colour	= colour;
	}
	
	public void setCoord(Coord k) {
		this.pos = k;
	}
	
	public Coord getPos() {
		return this.pos;
	}
	
	public Player getColour() {
		return this.colour;
	}
	protected abstract boolean isValidMove(Coord dest, Board board, Player playerTurn); // remember to reset coord cache with setCoord
}
