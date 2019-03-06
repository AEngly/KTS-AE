package BoardGame;

abstract public class BoardGame {
	
	private Player playerTurn;
	private Player[] players;
	private Board board;
	
	public BoardGame(Board board, Player[] players) {
		this.board =board;
		this.players = players;
	}
	
	public abstract void setup(Board board, Player[] players);
	
	public abstract void display();
	
	public abstract boolean isOver();

	
	public void play(){
		setup(board, players);
		
		int i = 0;
		while(!isOver()) {
			display();
			playerTurn = players[i%players.length];
			turn(playerTurn);
			i++;
		}
	}
	
	public Board getBoard() {
		return this.board;
	}
	
	public abstract void turn(Player playerTurn);

}
