package Barron_Homework;

import java.util.List;
import java.util.ArrayList;

public class TilePlayer {
    /**
     * NUM_LETTERS is the number of letter tiles a player should * have (if tiles
     * have not yet all been used) at the start of * her turn.
     */
    public static final int NUM_LETTERS = 54;
    /** playerTiles is the list of tiles for this player. */
    private List<Tile> playerTiles;

    /**
     * Adds a sufficient number of unused tiles from tileSet t to playerTiles so
     * that this player has NUM_LETTERS tiles. If there are insufficient unused
     * tiles, the player should take all of the remaining available tiles.
     * Precondition: playerTiles.size()<NUM_LETTERS.
     * Postcondition:playerTiles.size()<=NUM_LETTERS.
     * 
     * @param t the tile set for the word game
     */
    public void replaceTiles(TileSet t) {
        while (!t.allUsed() && NUM_LETTERS>playerTiles.size()) {
            playerTiles.add(t.getNewTile());
        }
    }

    /**
     * Returns the score a player receives for using tiles from his playerTiles at
     * his turn. The score is the sum of values on each tile used. Indexes of tiles
     * used are contained in the indexes array. If index[0] is -1, the player has
     * used no tiles at his turn and the method returns a score of 0. If the player
     * uses all of the tiles in playerTiles, a bonus of 20 points is added to his
     * score.
     * 
     * @param indexes the array of positions of tiles in playerTiles that the player
     *                uses at his turn Precondition: - - *
     */
    public int getWordScore(int[] indexes) {
        int sum = 0;
        if (indexes[0] == -1) {
            return 0;
        }
        for (int i : indexes) {
            sum += playerTiles.get(i).getValue();
        }
        if (indexes.length == playerTiles.size()) {
            sum += 20;
        }
        return sum;
    }
}
