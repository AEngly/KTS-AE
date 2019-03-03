package BoardGames;

public class Checkers extends BoardGames {

	Player[] Players = {Player("Black"),Player("White")};
	Board board = new Board(8,8);
	Piece[] pieces = PieceGenerator(Players); 
	
	public static void setup(Board board) {}
	
	public static void display(Board board) {}
	
	public static void turn(String[] Players) {}
		
		
		




}
