/*****************************************************************************
 * FILE: Driver.java
 * DATE: 02/08/12
 * AUTHOR: 	Karl Schmidbauer <schmidbauerk@msoe.edu>
 * 			Ben Ebert <ebertb@msoe.edu>
 * 
 * PURPOSE: Provides a main method for running and testing the AI.
 * 
 ****************************************************************************/
package main;

import agent.Agent;
import agent.ChickenLittle;
import board.GameBoard;

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
	 * Connector to the AI's knowledge base
	 */
	private static KnowledgeConnector kc;
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
		kc = new KnowledgeConnector();
		
		GUI gi = new GUI();
		
		Agent walker = new ChickenLittle(board);

		
	}
}