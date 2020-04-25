package Chapter2;

import java.util.Scanner;

public class TestBankAccount {
	private static BankAccount a = new BankAccount(12810557, "euphoria", 100.00);
	private static BankAccount b = new BankAccount(12356165, "turlin", 100.00);
	private static BankAccount c = new BankAccount(11610340, "Alice", 100.00);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
while (i<=1) {
		System.out.println("What can I help you?");
System.out.println("Enter your usercode in the first line.");
System.out.println("Enter your password in the second line.");
System.out.println("Enter your password in the second line.");
		Scanner un=new Scanner(System.in);
		int usercode = un.nextInt();
		Scanner pw=new Scanner(System.in);
		String acpassword = pw.nextLine();
		if(usercode==a.getusercode()) {
			System.out.println("Enter \"D\" to deposit.");
			System.out.println("Enter \"W\" to withdraw.");
			System.out.println("Enter \"W\"to change your password.");
			System.out.println("else to quit.");
			Scanner ac=new Scanner(System.in);
			String act = ac.nextLine();
			String acctpassword = acpassword;
			if(act.compareTo("D")==0) {
				a.deposit();
			}
			else if(act.compareTo("W")==0) {
			a.withdraw();
			}
			else {	System.out.println("Good Bye.");
			i++;
			}
			
		}
		else if(usercode==b.getusercode()) {

			System.out.println("Enter \"D\" to deposit.");
			System.out.println("Enter \"W\" to withdraw.");
			System.out.println("else to quit.");
			Scanner ac=new Scanner(System.in);
			String act = ac.nextLine();
			String acctpassword = acpassword;
			if(act.compareTo("D")==0) {
				b.deposit();
			}
			else if(act.compareTo("W")==0) {
			b.withdraw();
			}
			else {	System.out.println("Good Bye.");
			i++;
			}
			
		}
		else if(usercode==c.getusercode()) {

			System.out.println("Enter \"D\" to deposit.");
			System.out.println("Enter \"W\" to withdraw.");
			System.out.println("else to quit.");
			Scanner ac=new Scanner(System.in);
			String act = ac.nextLine();
			String acctpassword = acpassword;
			if(act.compareTo("D")==0) {
				c.deposit();
			}
			else if(act.compareTo("W")==0) {
			c.withdraw();
			}
			else {	System.out.println("Good Bye.");
			i++;
			}
			
		}
		else {
			System.out.println("Error password or account.");
		}
	}
System.out.println("");
	}

}
