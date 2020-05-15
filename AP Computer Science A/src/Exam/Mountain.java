package Exam;

public class Mountain {

    /*
     * Param array an array of positive integer values /Param stop the last index to
     * check /Precondition: 0 s stop <array length /Return true if for each j such
     * that 0 sj <stop, array [i] <array [j 1) /*false otherwise
     */
    public static boolean isincreasing(int[] array, int stop) { /* implementation not shown */
        return false;
    }

    // * @param array an array of positive integer values
    // @param start the first index to check
    // Precondition: 0 s start <array. Length
    // Return true if for each j such that start si <array length-1
    // array [i] array [j +1]
    // false otherwise
    public static boolean isdecreasing(int[] array, int start) {
        return false;
    }

    // @param array an array of positive integer values
    // Precondition: array length>0
    // Return the index of the first peak (local maximum) in the array, if it exists
    // I otherwise
    public static int getpeakindex(int[] array) {
        if (isincreasing(array, 1)) {
            for (int i = 1; i < array.length; i++) {
                if (!isincreasing(array, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // @param array an array of positive integer values
    // Precondition: array. Length>0
    // Return true if array contains values ordered as a mountain;
    // false otherwise
    public static boolean ismountain(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (isincreasing(array, i)&&isdecreasing(array, i)) {
                return true;
            }
        }
        return false;
    }

    // There may be instance variables, constructors, and methods that are not shown
}