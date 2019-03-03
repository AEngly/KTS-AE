package BoardGames;

public class InstantiateBoard {
	
	public static void begin() {
		for (int i = 0; i < 8 ; i++) {
			for (int j = 0; j < 8; j++) {


				if ((i == 0 || i == 2) && j%2==1) {
					board[i][j]=1;
				}


				else if (i == 1 && j%2==0) {
					board[i][j]=1;
				}


				else if ((i == 5 || i == 7) && (j%2==0)) {
					board[i][j]=2;
				}


				else if (i == 6 && j%2==1) {
					board[i][j]=2;
				}

				else {
					board[i][j]=0;
				}


			}

			}

}
