package info;

import java.util.Scanner;

public class Gsqh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the start first.");
	    Scanner in=new Scanner (System.in);
	    int start= in.nextInt();
		System.out.println("Enter the end of the caculate.");
	    Scanner on=new Scanner (System.in);
	    int end= on.nextInt();
		System.out.println("Enter the difference in the last.");
	    Scanner kn=new Scanner (System.in);
	    int dif= kn.nextInt();
	    int num = 0 ;
	    int i = 0 ;
	    int tot=0;
	    int times =(end-start)/dif;
			      while( i <= times) { 
			    	  num=start+dif*i;
			    	  tot=tot+num;
				 i++;
				}
					System.out.println("The answer is "+tot+".");
			
	}
}
