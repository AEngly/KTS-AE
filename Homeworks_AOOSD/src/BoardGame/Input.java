package BoardGame;

import java.util.Scanner;

public class Input {
	
	public int[] move;
	
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
			int[] move = new int[] {x,y,nx,ny};
			s.close();
		
		this.move = move;
	}	
}