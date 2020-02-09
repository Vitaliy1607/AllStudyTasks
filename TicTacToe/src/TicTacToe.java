import java.util.Scanner;

public class TicTacToe {

	public static final String empty = "   ";
	public static final String tic = " X ";
	public static final String tac = " O ";
	public static String activePlayer;
	
	public static final int rows =3, cols = 3;
	public static String[][] field = new String[rows][cols];
	public static int gameStatus;
	public static final int playingGame =0, draw = 1,
			winnerX = 3, winnerO=4;
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		startGame();
		do {
			getScannervalue();
			checkField();
			showGameField();
			if(gameStatus == winnerX) {
				System.out.println("WinnerX");
			}else if(gameStatus == winnerO) {
				System.out.println("winnerY");
			}else if(gameStatus == draw) {
				System.out.println("Good bye");
			}
		  activePlayer =(activePlayer == tic?tac:tic);	
		}
		while(gameStatus == playingGame);
	}

	public static void startGame() {
		for (int row = 0; row<rows; row++) {
			for (int col = 0;col<cols;col++) {
				field[row][col] = empty;
			}
		}
		activePlayer = tic;
		showGameField();
	}
	public static void getScannervalue() {
		
		boolean scannerTrue = false;
		do {
			System.out.println("Player '" + activePlayer + "',enter row(1-3) and col(1-3) using space");
		 int row = in.nextInt()-1;
		 int col = in.nextInt()-1;
		 if (row>=0 && row<rows && col>=0 && field[row][col]==empty) {
			 field[row][col] = activePlayer;
			 scannerTrue =true;
		 }else {
			 System.out.println("This field ("+ (row+1) + "," +(col + 1)
					 +") can`t be used.Try again...");
		 }
		}
		while(!scannerTrue);
				
	}
	public static void checkField() {
		String winner = findWinner();
		if(winner.equals(tic)) {
		gameStatus = winnerX;	
		}else if(winner.equals(tac)) {
			gameStatus = winnerO;
		}else if(orAllFieldFilled()) {
			gameStatus = draw;
		}else {
			gameStatus = playingGame;
		}
	}
	public static boolean orAllFieldFilled() {
		for ( int row = 0; row< rows; row++) {
			for (int col = 0; col<cols;col++) {
				if(field[row][col]==empty) {
					return false;
				}
				}
			}
		return true;
	}
	public static String findWinner() {
	
		int iValueSame;
		for ( int row = 0; row< rows; row++) {
			iValueSame = 0;
			for (int col = 0; col<cols;col++) {
				if(field[row][0]!= empty && field[row][0]==field[row][col]) {
				iValueSame++;
				}
						
		}
			if(iValueSame==3) {
				return field[row][0];
			}
			}
			for ( int col = 0; col< cols; col++) {
				iValueSame = 0;
				for (int row = 0; row<rows;row++) {
					if(field[col][0]!= empty && field[col][0]==field[row][col]) {
					iValueSame++;
					}
							
			}
				if(iValueSame==3) {
					return field[col][0];
				}
	}
			if(field[0][0] != empty && field[0][0]==field[1][1] &&field[0][0]==field[2][2]) {
				return field[0][0];
			}
			if(field[0][2] != empty && field[1][1]==field[0][2] &&field[2][0]==field[0][2]) {
				return field[0][2];
			}
			return empty;
 		}
	public static void showGameField() {
		for (int row = 0;row<rows; row++) {
     for ( int col = 0;col<cols;col++)  {
    	 System.out.print(field[row][col]);
    	 if(col!=cols-1) {
    		 System.out.print(" | ");
    	 }
     } 
     System.out.println();
     if(row!= rows -1) {
    	 System.out.println("------------");
     }
	}
		System.out.println();
}
}