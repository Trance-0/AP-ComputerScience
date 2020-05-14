package Chapter1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 5; i >= 1; i--)
//
//		{
//
//		for (int j = i; j >= 1; j--) System.out.print(2 * j - 1);
//
//		System.out.println();
//
//		}
//	}
// for (int i = 1; i <= 6; i++)
//
//		{
//
//		for (int k = 1; k <= 6; k++) 
//
//		if (k == i)
//
//		System.out.print(2 * k); 
//
//		else
//
//		System.out.print("-");
//
//		System.out.println();
//
//		}
//
//  for (int i = 1; i <= 6; i++)
//
//		{
//
//		for (int k = 1; k <= i - 1; k++) 
//
//		System.out.print("-");
//
//		       System.out.print(2 * i);
//
//		for (int k = 1; k <= 6 - i; k++)
//
//		System.out.print("-");
//
//		System.out.println();
//
//		}
//
//	 for (int i = 1; i <= 6; i++)
//
//		{
//
//		for (int k = 1; k <= i - 1; k++) 
//
//		System.out.print("-");
//
//		System.out.print(2 * i);
//
//		for (int k = i + 1; k <= 6; k++) 
//
//		System.out.print("-");
//
//		System.out.println();
//
//		}

		int  revNum = 234;
		int rem=234;
		int n=revNum;
		for (int i = 0; i <= n; i++)

		{

		rem = n % 10;

		revNum = revNum * 10 + rem; n /= 10;

		}

		 

		    while (n != 0)

		{

		rem = n % 10;

		revNum = revNum * 10 + rem; n /= 10;

		}

		 

		      for (int i = n; i != 0; i /= 10)

		{

		rem = i % 10;

		     revNum = revNum * 10 + rem;

   System.out.println(revNum); 
   System.out.println(rem); 
   System.out.println(n); 

}
		}
	}
