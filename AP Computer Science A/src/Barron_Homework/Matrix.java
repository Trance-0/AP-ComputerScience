package Barron_Homework;

public class Matrix {
    private int[][] mat;

    /** Constructs a matrix of integers. */
    public Matrix(int[][] m) {
        mat = m;
    }

    /**
     * Reverses the elements in each row of mat.
     * Postcondition:Theelementsineachrowhavebeenreversed.
     */
    public void reverseAllRows() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; i < mat[i].length / 2; i++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[i].length - j];
                mat[i][mat[i].length - j] = temp;
            }
        }
    }

    /**
     * Reverses the elements of mat. * Postcondition: - *
     *
     * - * - *
     */
    public void reverseMatrix() {
        reverseAllRows();
        for (int i = 0; i < mat.length / 2; i++) {
            int[] temp = mat[i];
            mat[i] = mat[mat.length - i];
            mat[mat.length - i] = temp;
        }
    }
}
// Other instance variables, constructors and methods are not shown. }