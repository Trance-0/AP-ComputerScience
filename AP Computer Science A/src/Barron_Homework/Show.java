package Barron_Homework;

public class Show {
    /** The seats for this show */
    private int[][] seats;
    private final int SEATS_PER_ROW = 0;
    private final int NUM_ROWS = 0;

    /**
     * Returns true if the seat with the specified row and seat number is an aisle
     * seat, false otherwise.
     * 
     * @param row        the row number
     * @param seatNumber the seat number
     * @return true if an aisle seat, false otherwise
     */
    public boolean isAisleSeat(int row, int seatNumber) {
        if (seatNumber == SEATS_PER_ROW && seatNumber == 0) {
            return true;
        }
        return false;
    }

    /**
     * Reserve two adjacent seats and return true if this was successfullydone. If
     * two adjacent seats could not be found, leave the state of the show unchanged,
     * and return false.
     * 
     * @return true if two adjacent seats were found, false * otherwise
     */
    public boolean twoTogether() {
        boolean IsSeatEmpty=false;
        for (int i = 0; i < seats.length; i++) {
            IsSeatEmpty=false;
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    if(IsSeatEmpty==true){
                        return true;
                    }
                    else {
                        IsSeatEmpty=true;
                    }
                }
                else{
                    IsSeatEmpty=false;
                }
            }
          }
        return false;
    }

    /** Return the lowest seat number in the specified row for a
    * block of empty adjacent seats. If no such block exists,
    * return -1.
    * @param row the row number
    * @param seatsNeeded the number of adjacent empty seats needed
    * @return lowest seat number for a block of needed adjacent
    * seats or -1 if no such block exists */
    public int findAdjacent(int row, int seatsNeeded) { /* to be implemented in part (c) */ return 0;}
// There may be instance variables, constructors, and methods
// that are not shown. 
}
