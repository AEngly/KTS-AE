package BoardGames;

public class CheckerRules {
	
	boolean rule;

	public boolean CheckerRules(Piece piece, Move move ){
		rule = (	board[m[0]][m[1]] != t //must be players own piece
				|| board[m[2]][m[3]] != 0 //must land in empty field
				|| (t==1 && (m[0]-m[2] != -1 || Math.abs(m[1]-m[3]) != 1))
				|| (t==2 && (m[0]-m[2] != 1 || Math.abs(m[1]-m[3]) != 1)) //must be diagonal move
						);
		return rule;
		
	}

}
