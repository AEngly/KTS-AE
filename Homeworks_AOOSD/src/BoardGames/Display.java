package BoardGames;

public class Display {

	public static void display(int[][] board) { // Method for showing board

		String c = ""; // top save everything

		System.out.print("\n \n");
		System.out.println("     | 0. 1. 2. 3. 4. 5. 6. 7.");
		System.out.println("------------------------------");

		for (int row = 0; row < board[0].length; row++) { // prints
			for (int column = 0; column < board[0].length; column++) {

				if (board[row][column] == 0) {
					c = c + "   ";
				}

				else {
					c = c + board[row][column] + "  ";
				}
			}

			System.out.println(" " + row + ".  | " + c); // print each row
			c = ""; // reset c

		}
		System.out.println("\n\n");
	}
}
