package BoardGame;

public class PlayCheckers {

	public static void main(String[] args) {
		
		Board board = new CheckerBoard(8,8);
		Player[] players = {new CheckerPlayer("White"), new CheckerPlayer("Black")}; 
		Checkers checkers = new Checkers(board, players);
		
		checkers.play();

	}

}
