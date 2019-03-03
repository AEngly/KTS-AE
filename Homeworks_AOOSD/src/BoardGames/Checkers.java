package BoardGames;

import java.util.Scanner;

public class Checkers extends BoardGames {
	Player Turn = new Player("White");
	Player[] players = {new Player("Black"),new Player("White")};
	Board board = new Board(8,8);
	Piece[] pieces = getAllPieces(players); 
	
	public static void setup(Board board) {}
	
	public static void display(Board board) {
		Display(board);
	}
	
	public static void turn(Player[] players, Player Turn) {

	
	}


		
		
		




}
