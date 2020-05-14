package Chapter1;

public class Private {

	private static int i = 1281055739;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 4; i++) {
//			int j = 0;
//			System.out.println("");
//			while (j < i) {
//				System.out.print("*");
//				j++;
//			}
//		}
//		System.out.println("");
//		System.out.println("");
//		System.out.println("");
		int k = 10;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			for (int j = 1; j <= k - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
	
	}

}
