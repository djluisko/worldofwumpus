/*****************************************************************************
 * FILE: Tile.java
 * DATE: 02/08/12
 * AUTHOR: 	Karl Schmidbauer <schmidbauerk@msoe.edu>
 * 			Ben Ebert <ebertb@msoe.edu>
 * 
 * PURPOSE: Single tile object serves to store the state of each tile 
 * 			or room on the game board.
 * 
 ****************************************************************************/
package z.wumpus;

/**
 * Storage for the configuration of each tile or room on the game board
 * 
 * @author Karl Schmidbauer <schmidbauerk@msoe.edu>
 *
 */
public class Tile {
	
	/**
	 * Stores if the gold in in this tile
	 */
	public boolean gold;
	/**
	 * Stores if the wumpus is in this tile
	 */
	public boolean wumpus;
	/**
	 * Stores if there is a pit on this tile
	 */
	public boolean pit;
	/**
	 * Stores if there is a breeze on this tile
	 */
	public boolean breeze;
	/**
	 * Stores if there is a stench on this tile
	 */
	public boolean stench;
	/**
	 * Stores if tile has been visited
	 */
	public boolean visited;
	/**
	 * Stores if tile has Mile Marker
	 */
	public int mileMarker = 0;
	
	public boolean wumpusDead;

	/* (non-Javadoc)
	 * Outputs the tile to a string to be viewed on a console.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String output = "";
		if(gold)	output+="A";
		if(wumpus && !wumpusDead)	output+="W";
		if(wumpus && wumpusDead)	output+="X";
		if(pit)		output+="P";
		if(breeze)	output+="B";
		if(stench)	output+="S";
		if(visited) output+="V";
		return output;
	}
	
	public Object clone(){
		Tile temp = new Tile();
		temp.gold = this.gold;
		temp.wumpus = this.wumpus;
		temp.pit = this.pit;
		temp.breeze = this.breeze;
		temp.stench = this.stench;
		temp.visited = this.visited;
		temp.mileMarker = this.mileMarker;
		return temp;
	}
}

