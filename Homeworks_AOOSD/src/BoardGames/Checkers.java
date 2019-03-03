package BoardGames;

import java.util.Scanner;

public class Checkers extends BoardGames {
	Player Turn = new Player("White");
<<<<<<< HEAD
	Player[] players = {new Player("Black"),new Player("White")};
	Board board = new Board(8,8);
	Piece[] pieces = getAllPieces(players); 
	
	public static void setup(Board board) {}
	
=======
	Player[] players = { new Player("Black"), new Player("White") };
	Board board = new Board(8, 8);
	Piece[] pieces = ;

	public static void setup(Board board) {
	}

>>>>>>> refs/remotes/origin/master
	public static void display(Board board) {
		Display(board);
	}

	public static Piece[] getAllPieces(Player[] players) {

		int no_pieces = 0;

		for (int i = 0; i < players.length; i++) {
			no_pieces = no_pieces + players[i].pieces.length;
		}

		Piece[] allPieces = new Piece[no_pieces];

		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].pieces.length; j++) {
				allPieces[j + i * players[i].pieces.length] = players[i].pieces[j];
			}
		}

		return allPieces;

	}

	public static void turn(Player[] players, Player Turn) {

<<<<<<< HEAD
	
=======
		
		Pair<Character,Integer>[] move;
				
		while (turn <= players.length) {

			do {move = Moveinput();}
			while (moveLegal(move, turn)) 

			
			
		}

	private static boolean moveLegal(Pair<Character, Integer>[] move, turn ) {
		board.playarea[m[0]][m[1]] != t //must be players own piece
				|| board[m[2]][m[3]] != 0 //must land in empty field
				|| (t==1 && (m[0]-m[2] != -1 || Math.abs(m[1]-m[3]) != 1))
				|| (t==2 && (m[0]-m[2] != 1 || Math.abs(m[1]-m[3]) != 1)) //must be diagonal move
						)
		return false;
	}

	private static Pair<Character, Integer>[] Moveinput() {
		Scanner s = new Scanner(System.in);
		char x;
		int y;
		char nx;
		int ny;

		System.out.println("Turn of player no. 1 \n");
		System.out.println("Coordinate of piece to move \n");
		System.out.println("Enter X:");
		x = s.next().charAt(0);
		System.out.println("\nEnter Y:");
		y = s.nextInt();
		System.out.println("\nCoordinate of new position \n");
		System.out.println("Enter X:");
		nx = s.next().charAt(0);
		System.out.println("\nEnter Y:");
		ny = s.nextInt();
		Pair<Character, Integer> old = new Pair<>(x, y);
		Pair<Character, Integer> next = new Pair<>(nx, ny);
		Pair<Character, Integer>[] move = new Pair[] { old, next };
		// TODO Auto-generated method stub
		return move;
>>>>>>> refs/remotes/origin/master
	}

}
