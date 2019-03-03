package BoardGames;

public class Player {

	protected String player;
	protected Piece[] pieces = new Piece[12]; // Each player has 12 pieces

	// Positions of white players
	char[] xchords_white = new char[] { 'A', 'C', 'E', 'G', 'B', 'D', 'F', 'H', 'A', 'C', 'E', 'G' };
	char[] ychords_white = new char[] { '8', '8', '8', '8', '7', '7', '7', '7', '6', '6', '6', '6' };

	// Positions of black players
	char[] xchords_black = new char[] { 'B', 'D', 'F', 'H', 'A', 'C', 'E', 'G', 'B', 'D', 'F', 'H' };
	char[] ychords_black = new char[] { '1', '1', '1', '1', '2', '2', '2', '2', '3', '3', '3', '3' };

	public Player(String input_player) {
		this.player = input_player;
	}

	public Player() {
		this.player = "No owner!";
	}

	public void AssignPieces() {

		if (this.player == "Black") {

			for (int i = 0; i < 12;) {

				pieces[i] = new Piece(this);

			}
		}

		else {

			for (int i = 0; i < 12;) {

				pieces[i] = new Piece(this);

			}
		}
	}

	public void PlacePieces() {

		if (this.player == null) {
			System.out.println("All players must clame 12 pieces. Use 'AssignPieces'-method and then try again!");
		}

		else if (this.player == "Black") {

			for (int i = 0; i < 12;) {

				pieces[i].position = new char[] { xchords_black[i], ychords_black[i] };

			}
		}

		else if (this.player == "White") {

			for (int i = 0; i < 12;) {

				pieces[i].position = new char[] { xchords_white[i], ychords_white[i] };

			}
		}

	}

}
