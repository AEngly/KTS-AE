package BoardGame;

// Updates pending:
// Change colours to Enum.
// change Piece colour to owner
// Fix display() to show something else than the adress.

public class Checkers extends BoardGame {

	public Checkers(Board board, Player[] players) { // Calls the constructor of the super-class
		super(board, players);
	}

	@Override
	public void display() {

		Board board = getBoard();

		String c = ""; // Dummy variable

		System.out.print("\n \n");
		System.out.println("     | 0. 1. 2. 3. 4. 5. 6. 7.");
		System.out.println("------------------------------");

		for (int row = 0; row < board.getPlayarea()[0].length; row++) { // prints
			for (int column = 0; column < board.getPlayarea()[0].length; column++) {

				if (board.getPlayarea()[row][column] == null) {
					c = c + "   ";
				}

				else {
					c = c + board.getPlayarea()[row][column].colour.getColour().charAt(0) + "  ";
				}
			}

			System.out.println(" " + row + ".  | " + c); // print each row
			c = ""; // reset c

		}
		System.out.println("\n\n");

	}

	public boolean isOver() {
		return false;
	}

	public void turn(Player playerturn) {
		Piece p = null;
		Input I;
		do {
			I = new Input();
			p = getBoard().getPiece(I.getPos());

		} while (p != null && p.isValidMove(I.getDest(), getBoard(), playerturn));

		getBoard().setPiece(getBoard().getPiece(I.getPos()), I.getDest());
		getBoard().setPiece(null, I.getPos());
		getBoard().getPiece(I.getDest()).setCoord(I.getDest());

		if (Math.abs(I.getPos().getX() - I.getDest().getX()) == 2) {
			Coord hit = new Coord(((I.getPos().getX() + I.getDest().getX()) / 2),
					((I.getPos().getY() + I.getDest().getY()) / 2));
			getBoard().setPiece(null, hit);
		}
	}

	public void setup(Board board, Player[] players) {

		// Positions of white players initially
		int[] xcoords_white = new int[] { 0, 2, 4, 6, 1, 3, 5, 7, 0, 2, 4, 6 };
		int[] ycoords_white = new int[] { 7, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 5 };

		// Positions of black players initially
		int[] xcoords_black = new int[] { 1, 3, 5, 7, 0, 2, 4, 6, 1, 3, 5, 7 };
		int[] ycoords_black = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2 };

		for (int j = 0; j < players.length; j++) {

			if (players[j].getColour() == "Black") {

				for (int i = 0; i < 12; i++) {
					Piece p = new CheckerPiece(players[j]);
					p.setCoord(new Coord(xcoords_black[i], ycoords_black[i]));
					board.setPiece(p, p.getPos());

				}
			}

			else if (players[j].getColour() == "White") {

				for (int i = 0; i < 12; i++) {
					Piece p = new CheckerPiece(players[j]);
					p.setCoord(new Coord(xcoords_white[i], ycoords_white[i]));
					board.setPiece(p, p.getPos());
				}
			}

			else {
				System.out.println("The player must be given a name first!");
			}
		}
	}
}
