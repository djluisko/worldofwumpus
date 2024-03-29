/*****************************************************************************
 * FILE: Driver.java
 * DATE: 02/08/12
 * AUTHOR: 	Karl Schmidbauer <schmidbauerk@msoe.edu>
 * 			Ben Ebert <ebertb@msoe.edu>
 * 
 * PURPOSE: Provides a main method for running and testing the AI.
 * 
 ****************************************************************************/
package zz.main;

import zz.agent.Agent;
import zz.agent.ChickenLittle;
import zz.agent.Rambo;
import zz.board.GameBoard;

/**
 * Main method to control and run tests on the AI
 * 
 * @author schmidbauerk
 *
 */
public class Driver {

	
	/**
	 * Storage variable for the Game board
	 */
	private static GameBoard board;
	/**
	 * Width of the Game board
	 */
	private final static int sizeX = 4;
	/**
	 * Height of the game board
	 */
	private final static int sizeY = 4;
	
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		
		
		board = new GameBoard(sizeX,sizeY);
		
		//GUI gi = new GUI();
		
		Agent smith = new Rambo(board);
		smith.search();
		
	}
}
