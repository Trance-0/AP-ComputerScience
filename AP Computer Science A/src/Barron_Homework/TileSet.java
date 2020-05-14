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
    for (int i=0;i<tiles.size();i++){
        Tile temp=tiles.remove(tiles.size()-i-1);
        int index=(int)Math.random()*tiles.size();
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