package BoardGame;

public class Checkers extends BoardGame {
	
	public Checkers() {
	
		String playerTurn = "White";
		Player[] players = {new Player("Black"),new Player("White")};
		Board board = new Board(8,8);
		final Piece[] pieces = new Piece[24];
		setup(board, pieces, players);
	}
	
	public void display(Board board) {}
	
	public void turn(Player[] players) {}
	
	public void setup(Board board, Piece[] pieces, Player[] players) {
		
		// Positions of white players initially
		int[] xchords_white = new int[] { 0, 2, 4, 6, 1, 3, 5, 7, 0, 2, 4, 6};
		int[] ychords_white = new int[] { 7,7,7,7,6,6,6,6,5,5,5,5 };

		// Positions of black players initially
		int[] xchords_black = new int[] { 1,3,5,7,0,2,4,6,1,3,5,7 };
		int[] ychords_black = new int[] { 0,0,0,0,1,1,1,1,2,2,2,2 };
		
		
		for (int j=0; j < players.length; j++) {
			if (players[j].colour == "Black") {

				for (int i = 12; i < 24; i++) {

					pieces[i] = new Piece(players[j]);
					//System.out.println("Black"+i);

				}
			}

			else if (players[j].colour == "White") {

				for (int i = 0; i < 12; i++) {
					pieces[i] = new Piece(players[j]);
					//System.out.println("White"+i);
				}
			}

			else {

				System.out.println("The player must be given a name first!");

			}
			try {
		
				if (players[j].colour == "Black") {
		
					for (int i = 12; i < 24; i++) {
		
						pieces[i].pos = new int[] { xchords_black[i-12], ychords_black[i-12] };
		
					}
				}
		
				else if (players[j].colour == "White") {
		
					for (int i = 0; i < 12; i++) {
		
						pieces[i].pos = new int[] { xchords_white[i], ychords_white[i] };
		
					}
				}
			}
			
			catch (Exception NullPointerException) {

				System.out.println("Remember to assign pieces first. Call the method 'AssignPieces' on the player!");
			}
		}
		for (int i = 0 ; i < pieces.length; i++) {
			System.out.println(i);
			System.out.println(pieces[i]);
			board.playarea[pieces[i].pos[0]][pieces[i].pos[1]]=pieces[i];
			
			System.out.println(board.playarea[pieces[i].pos[0]][pieces[i].pos[1]]);
		}
	}

}
