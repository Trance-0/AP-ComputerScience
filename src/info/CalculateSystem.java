package info;

import java.util.Scanner;

public class CalculateSystem {

	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub    
	System.out.println("use + to plus");
    System.out.println("use - to minus");
    System.out.println("use x to time");
    System.out.println("use / to divide into");
    
    Scanner var=new Scanner (System.in);
    double input1 = var.nextInt();
    String input2 = var.next();
    double input3 = var.nextInt();
    
    if(input2.compareTo("+") == 0) {
    System.out.print(input1+"+"+input3+"="+(double)(input1+input3));
    }
    else if(input2.compareTo("-") == 0) {
    System.out.print(input1+"-"+input3+"="+(double)(input1-input3));
    }
    else if(input2.compareTo("x") == 0) {
    System.out.print(input1+"x"+input3+"="+(double)(input1*input3));
    }
    else if(input2.compareTo("/") == 0) {
    System.out.print(input1+"÷"+input3+"="+(double)(input1/input3));
    }
}
}