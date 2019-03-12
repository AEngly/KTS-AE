package BoardGame;

public class Coord {

	private int x;
	private int y;

	public Coord(int x_input, int y_input) {
//		(x_input<=7 && x_input>=0 && y_input<=7 && y_input>=0)//Sanity check that Coord is within Board, limits
		this.x = x_input;
		this.y = y_input;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}


}
