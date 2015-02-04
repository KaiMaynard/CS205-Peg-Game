package boards;

import other.Coordinate;

public class EnglishBoard extends GameBoard{

	public EnglishBoard() {
		gameBoard = new int[][] {
				{0, 0, 2, 2, 2, 0, 0},
				{0, 0, 2, 2, 2, 0, 0},
				{2, 2, 2, 2, 2, 2, 2},
				{2, 2, 2, 1, 2, 2, 2},
				{2, 2, 2, 2, 2, 2, 2},
				{0, 0, 2, 2, 2, 0, 0},
				{0, 0, 2, 2, 2, 0, 0}
				};
	}
	
	@Override
	public Coordinate isValidMove(Coordinate initialCoordinate, Coordinate finalCoordinate) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * drawBoard prints the game board in the console.
	 * 
	 * Each hole on the board displays information regarding its position and
	 * whether or not it is occupied.
	 */
	@Override
	public void drawBoard() {
		drawHR();
		
		int holeCounter = 1;
		
		for (int row = 0; row < gameBoard.length; row++) {
			for (int col = 0; col < gameBoard[row].length; col++) {
				int peg = gameBoard[row][col];
				holeCounter = drawPeg(peg, holeCounter);
			}
			
			System.out.print("\n");
		}
	}
	
	@Override
	public void showHelp() {
		System.out.println("GAME COMMANDS AND RULES:");
		System.out.println("press q to quit.");
		System.out.println("press h for help.");
		System.out.println("Welcome to Peg solitare, the goal of the game is to remove all pegs but one");
		System.out.println("to remove a peg, you must take select a peg, and move that peg over another into");
		System.out.println("an empty space. Think jumping in checkers. Enter the coordinate of the peg you wish");
		System.out.println("to move, and then the coordinate of the empty space you wish to move that peg into");
		System.out.println("The game is over when there are no longer any moves the player can make, with the");
		System.out.println("Player winning if there is only one peg remaining at this time.");
	}
}
