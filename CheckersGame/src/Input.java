package BoardGame;

import java.util.Scanner;

public class Input {
	
	private Coord pos;
	private Coord dest;
	
	public Input() {
	
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		int nx;
		int ny;
	
		System.out.println("Turn of player no. 1 \n");
		System.out.println("Coordinate of piece to move \n");
		System.out.println("Enter X:");
		x = s.nextInt();
		System.out.println("\nEnter Y:");
		y = s.nextInt();
		System.out.println("\nCoordinate of new position \n");
		System.out.println("Enter X:");
		nx = s.nextInt();
		System.out.println("\nEnter Y:");
		ny = s.nextInt();
		s.close();
		
		this.pos = new Coord(x,y);
		this.dest = new Coord(nx,ny);
	}
	
	public Coord getPos() {
		return this.pos;
	}
	
	public Coord getDest() {
		return this.dest;
	}
}