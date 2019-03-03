package BoardGames;

import java.util.Scanner;

public class Turn {
	
	
	
	
	while (turn <= players.length) {

		do {move = MoveInput();}
		while (MoveLegal(move, turn)) 

		
		
	}

	private static boolean MoveLegal(Coordinates<Character, Integer>[] move, turn ) {
		board.playarea[m[0]][m[1]] != t //must be players own piece
				|| board[m[2]][m[3]] != 0 //must land in empty field
				|| (t==1 && (m[0]-m[2] != -1 || Math.abs(m[1]-m[3]) != 1))
				|| (t==2 && (m[0]-m[2] != 1 || Math.abs(m[1]-m[3]) != 1)) //must be diagonal move
						)
		return false;
	}
	
	private static Coordinates<Character, Integer>[] MoveInput() {
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
			Coordinates<Character,Integer> old = new Coordinates<>(x,y);
			Coordinates<Character,Integer> next = new Coordinates<>(nx,ny);
			Coordinates<Character, Integer>[] move = new Coordinates[] {old,next};
	
		return move;
	}
	

}
