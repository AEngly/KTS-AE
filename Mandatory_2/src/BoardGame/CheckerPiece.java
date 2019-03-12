package BoardGame;

public class CheckerPiece extends Piece {
	
	public CheckerPiece(Player colour) {
		super(colour);
	}

	@Override
	protected boolean isValidMove(Coord dest, Board board, Player playerTurn) {
		boolean m = (	this.colour == playerTurn //must be players own piece
						&& (dest.getX()<=7 && dest.getX()>=0 && dest.getY()<=7 && dest.getY()>=0)//must land within board.
						&& ((Math.abs(this.getPos().getX()-dest.getX())==1 && (this.getPos().getY()-dest.getY())==((playerTurn.getColour()=="White")? 1:-1))
						||	(Math.abs(this.getPos().getX()-dest.getX())==2 && (this.getPos().getY()-dest.getY())==(playerTurn.getColour()=="White"? 2:-2)
						&& ((board.getPiece(new Coord(((this.getPos().getX()+dest.getX())/2),((this.getPos().getY()+dest.getY())/2))).getColour().getColour() == (playerTurn.getColour()=="White" ? "Black":"White"))) //Checks that the piece being jumped is the opponents.	
						)));
		return m;
	}


}
