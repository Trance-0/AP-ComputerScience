package Chapter8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrimeNumberMiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the range of prime number");
		System.out.println("Start from?");
		Scanner in = new Scanner(System.in);
		int sta = in.nextInt();
		System.out.println("End in?");
		Scanner on = new Scanner(System.in);
		int end = on.nextInt();
		int sub = end - sta;
		if (sub > 0) {
			int det = sta;
			List PrimeNumber = new ArrayList();
			int tot = 0;
			while (det <= end) {
				int div = 2;
				boolean IsPri = true;
				while (div < det) {
					if (det % div == 0) {
						IsPri = false;
					}
					// System.out.println("["+div+"]");
					div++;
				}
				// System.out.println(det);
				if (IsPri == true && det > 1) {
					PrimeNumber.add(det);
					tot++;
				}
				det++;
			}
			System.out.println("The prime number in " + sta + " to " + end + " are");
			System.out.println(PrimeNumber);
			System.out.println(tot);
		} else {
			System.out.print("Error!");
		}
	}

}
