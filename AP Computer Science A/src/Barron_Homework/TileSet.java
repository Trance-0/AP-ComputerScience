package Barron_Homework;

import java.util.List;
import java.util.ArrayList;

public class TileSet {
    /**
     * tiles contains all the tiles in the word game, * both used and not-yet-used.
     */
    private List<Tile> tiles;
    /** unusedSize is the number of tiles that are not yet used. */
    private int unusedSize;

    /**
     * Determines if there are still unused tiles.
     * 
     * @return true if all the tiles have been used; false otherwise
     */
    public boolean allUsed() {
        return unusedSize == 0;
    }

    /** @return the number of unused tiles in this tile set */
    public int getUnusedSize() {
        return unusedSize;
    }

    /**
     * Shuffles the tiles in the tile set, and resets unusedSize to the total number
     * of tiles in the set.
     */
    public void shuffle() {
    for (int k=tiles.size();k>=0;k--){
        Tile temp=tiles.remove(k);
        int index=(int)(Math.random()*k+1);
        tiles.add(index, temp);
    }    
    unusedSize=tiles.size();
    }

    /**
     * Get an unused tile from this tile set.
     * 
     * @return an unused tile, or null if all tiles have been used
     */
    public Tile getNewTile() {
        return null;/* implementation not shown */
    }
    // Constructors and other methods are not shown.
}