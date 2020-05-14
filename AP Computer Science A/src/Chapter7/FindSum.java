package Chapter7;

import java.util.Scanner;

public class FindSum {
/** Private recursive helper method. * @param n a positive integer
* @return1+2+3+...+n
*/
private static int sum(int n) {
if (n == 1) return 1;
else
return n + sum(n - 1);
}

/* Driver method */
public static int main(int n) {
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
if (n > 0)
return sum(n);
else {
	throw new IllegalArgumentException ("Error: n must be positive");
} }
}
