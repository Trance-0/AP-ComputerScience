package Chapter6;

import java.util.ArrayList;

import java.util.List;

public class changeList {

	public static void main(String[] args) {
	boolean checkNumber ;
	int n=1234;

	int d1,d2,d3,checkDigit,nRemaining,rem;

	//strip off digits

	checkDigit = n % 10; 

	nRemaining = n / 10; 

	d3 = nRemaining % 10; 

	nRemaining /= 10;

	d2 = nRemaining % 10; 

	nRemaining /= 10;

	d1 = nRemaining % 10;

	//check validity

	rem = (d1 + d2 + d3) % 7; 

	System.out.println(rem);
}
}

