package Exam;

public class Array_util {

	public static int[] ArrayUtil(int[] arr) {
		int m = arr.length;
		int[] temp = new int[m];
		for (int i = 0; i < arr.length; i++) {
			temp[m - i - 1] = arr[i];
		}
		return temp;
	}

	public static int[][] reverseAllRow(int[][] arr) {
		int m = arr.length;
		int[][] temp = new int[m][];
		for (int i = 0; i < arr.length; i++) {
			temp[m - i - 1] = arr[i];
		}
		return temp;
	}

	public static int[][] reverseMatrix(int[][] arr) {
		int m = arr.length;
		int n = arr[m - 1].length;
		int[][] temp = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			temp[n - i - 1] = arr[i];
			for (int j = 0; j < arr[i].length; j++) {
				temp[n - i - 1][n - j - 1] = arr[i][j];
			}
		}
		return temp;
	}
}
