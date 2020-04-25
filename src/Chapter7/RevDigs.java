package Chapter7;

import java.util.Scanner;

public class RevDigs {
public static void revDigs(int n) {
	System.out.print(n%10);
	if(n/10!=0){
		revDigs(n/10);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int fac=in.nextInt();
		revDigs(fac);
	}

}
