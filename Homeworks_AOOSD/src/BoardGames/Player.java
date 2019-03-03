package BoardGames;

public class Player {

	final String[] playercolors = new String[] { "White", "Black" }; // A player can be black or white
	String player; // All players have a team (black or white)
	Piece[] pieces = new Piece[12]; // Each player has 12 pieces

	// Positions of white players initially
	final char[] xchords_white = new char[] { 'A', 'C', 'E', 'G', 'B', 'D', 'F', 'H', 'A', 'C', 'E', 'G' };
	final char[] ychords_white = new char[] { '8', '8', '8', '8', '7', '7', '7', '7', '6', '6', '6', '6' };

	// Positions of black players initially
	final char[] xchords_black = new char[] { 'B', 'D', 'F', 'H', 'A', 'C', 'E', 'G', 'B', 'D', 'F', 'H' };
	final char[] ychords_black = new char[] { '1', '1', '1', '1', '2', '2', '2', '2', '3', '3', '3', '3' };

	// Constructor to create a player
	public Player(String input_player) {

		if (input_player == playercolors[0] || input_player == playercolors[1]) {
			this.player = input_player;
		}

		else {
			System.out.print("\n The player needs to be one of the colors specified "
					+ "\n in the attribute 'playercolors' in class Player! \n");
		}
	}

	// Default constructor if player is not specified
	public Player() {
		this.player = "Unnamed!";
	}

	// Method to assign 12 pieces to a player
	public void AssignPieces() {

		if (this.player == "Black") {

			for (int i = 0; i < 12; i++) {

				pieces[i] = new Piece(this);

			}
		}

		else if (this.player == "White") {

			for (int i = 0; i < 12; i++) {
				pieces[i] = new Piece(this);
			}
		}

		else {

			System.out.println("The player must be given a name first!");

		}
	}

	public Piece[] getAllPieces(Player[] players) {

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

	// Method to place player X's pieces on the board
	public void PlacePieces() {

		try {

			if (this.player == "Black") {

				for (int i = 0; i < 12; i++) {

					pieces[i].position = new char[] { xchords_black[i], ychords_black[i] };

				}
			}

			else if (this.player == "White") {

				for (int i = 0; i < 12; i++) {

					pieces[i].position = new char[] { xchords_white[i], ychords_white[i] };

				}
			}
		}

		catch (Exception NullPointerException) {

			System.out.println("Remember to assign pieces first. Call the method 'AssignPieces' on the player!");

		}

	}

	public static void main(String[] args) {

		Player newplayer2 = new Player("Black");
		newplayer2.AssignPieces();
		newplayer2.PlacePieces();

	}

}
