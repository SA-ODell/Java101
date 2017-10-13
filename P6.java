// P6 Assignment
// Author: Stephen O'Dell
// Date:   09/27/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

public class P6 {
	// Class variables
	public static Maze maze;
	public static int mazeWidth;
	public static int mazeHeight;

	public static void main(String[] args) {
		// https://www.cs.colostate.edu/~cs163/.Fall17/assignments/P6/doc/P6.php

		// Fixme: get new Yubaba.png file --> fixed!

		// Create maze
		String fileName = args[0];
		System.err.println("Maze name: " + fileName);

		// Get dimensions
		maze = new Maze(fileName);
		mazeWidth = maze.getWidth();
		mazeHeight = maze.getHeight();
		System.err.println("Maze width: " + mazeWidth);
		System.err.println("Maze height: " + mazeHeight);

		// Add code to move around maze

		// for loop to cycle through rows (top to bottom)
		for (int rows = 0; rows <= mazeHeight; rows++) {

			// check mod2 for even or odd row
			if (rows % 2 == 0) {

				// for loop to cycle through columns (left to right)
				// use mazeWidth minus 2 (0-index + no moves after 2nd to last)
				for (int i = 0; i <= mazeWidth - 2; i++) {
					// if possible move is "false", do evasive maneuver
					if (!maze.moveRight()) {
						maze.moveDown();
						maze.moveRight();
						maze.moveRight();
						maze.moveUp();
					}
					// if possible move is "true" just keep moving
					// else {
					// System.out.println("moving right!");
					// }
				}
				maze.moveDown(); // end of row, move down

				// now for the odd rows
			} else { // rows%2 == 1
				// same as above except right to left
				for (int i = 0; i <= mazeWidth - 2; i++) {
					if (!maze.moveLeft()) {
						maze.moveDown();
						maze.moveLeft();
						maze.moveLeft();
						maze.moveUp();
					}
					// else {
					// System.out.println("moving left!");
					// }
				}
				maze.moveDown();

			}

		}

	}
}
