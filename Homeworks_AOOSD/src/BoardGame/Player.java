package BoardGame;

public abstract class Player {
	
	private String colour;
	
	public Player(String input) {
		this.colour = input;
	}
	
	public String getColour() {
		return this.colour;
	}
	

}
