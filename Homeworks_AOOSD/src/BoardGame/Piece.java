package BoardGame;

public class Piece {
	
	int[] pos = new int[2];
	
	String colour;
	
	public Piece(String colour) {
		this.colour	= colour;
	}
	
	protected boolean isValidMove(int[] move, String playerTurn, Board board) {
		boolean m = (	this.colour == playerTurn //must be players own piece
						&& (move[0]<=7 && move[0]>=0 && move[1]<=7 && move[1]>=0)//must land within board.
						&& ((Math.abs(this.pos[0]-move[0])==1 && Math.abs(this.pos[1]-move[1])==(this.colour=="White"? -1:1))
						||	(Math.abs(this.pos[0]-move[0])==2 && Math.abs(this.pos[1]-move[1])==(this.colour=="White"? -2:2)
						&& ((board.playarea[((this.pos[0]-move[0])/2+this.pos[0])][(this.pos[1]-move[1])/2+this.pos[1]]).colour == (this.colour=="White" ? "Black":"White"))) //Checks that the piece being jumped is the opponents.	
						));
		return m;
	}
	
	protected void setPosition(int[]pos) {
		this.pos = pos;
	}
	
	

}
