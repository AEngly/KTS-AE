package BoardGames;

public class Player {

	protected String player;
	protected Piece[] pieces = new Piece[12]; // Each player has 12 pieces

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
			System.out.println("All players must clame 12 pieces!");
		}

		if (this.player == "Black") {

			for (int i = 0; i < 12;) {

				pieces[i] = new Piece(this);

			}
		}

	}

}
