package BoardGame;

abstract public class BoardGame {
	
	String playerTurn;
	Player[] players;
	Board board;
	Piece[] pices;
	
	public void setup(Board board) {}
	
	public void display(Board board) {}
	
	public void turn(Player[] players) {}

}
