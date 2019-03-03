package BoardGame;

import java.util.Scanner;

import BoardGames.Coordinates;

public class Checkers extends BoardGame {
	
	public Checkers() {
	
		String playerTurn = "White";
		Player[] players = {new Player("Black"),new Player("White")};
		Board board = new Board(8,8);
		final Piece[] pieces = new Piece[24];
		setup(board, pieces, players);
		//System.out.println("k");
		while (playerTurn == "White" || playerTurn == "Black") {
			display(board);
			turn(players, playerTurn);
		}
	}
	
	public void display(Board board) {}
	
	public void turn(Player[] players, String playerTurn) {
		
		int[] nextPos = new int[2];
		int[] move;
		
		do {
			move = new Input().move;
			nextPos[0] = move[2];
			nextPos[1] = move[3];
		} while (board.playarea[move[0]][move[1]].isValidMove(nextPos, playerTurn, board));
		
		board.playarea[move[0]][move[1]] = null;
		board.playarea[move[2]][move[3]] = new Piece(playerTurn);
		
		if (Math.abs(move[0]-move[2])==2) {
			int[] hit = {(move[2]-move[0])/2+move[0],(move[3]-move[1])/2+move[1]};
			board.playarea[hit[0]][hit[1]]=null;
		}
	}
	
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

					pieces[i] = new Piece(players[j].colour);
					board.playarea[xchords_black[i-12]][ychords_black[i-12] ] = pieces[i];
					//System.out.println("Black"+i);
				}
			}

			else if (players[j].colour == "White") {

				for (int i = 0; i < 12; i++) {
					pieces[i] = new Piece(players[j].colour);
					board.playarea[xchords_white[i]][ychords_white[i]] = pieces[i];
					//System.out.println("White"+i);
				}
			}

			else {
				System.out.println("The player must be given a name first!");
			}
		}
	}

}
