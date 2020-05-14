package Chapter2;

import java.util.Scanner;

public class BankAccount {
	private int usercode;
	private String password;
	private double balance;
	public static final double OVERDRAWN_PENALTY = 20.00;
	public BankAccount() {
		this.usercode = 00000000;
		this.password = "88888888";
		this.balance = 100.00;
	}
	public BankAccount(int usercode, String password, double balance) {
		this.usercode = usercode;
		this.password = password;
		this.balance = balance;
	}
	public int getusercode() {
	return usercode;
	}
	public double getbalance() {
		return balance;
		}

	public  void deposit() {
		System.out.println("Please enter your password again.");
		Scanner pw = new Scanner(System.in);
		String acctpassword=pw.nextLine() ;
		if (this.password.contentEquals(acctpassword)) {
			System.out.println("The asset you have left is"+getbalance());
			System.out.println("How much you need deposit?");
			Scanner dp=new Scanner(System.in);
			double amount = dp.nextDouble();  
			balance += amount;
			System.out.println("The asset you have left is"+balance);
		} else {
			System.out.println("Error password.");
		}
	}

	public  void withdraw() {
		System.out.println("Please enter your password again.");
		Scanner pw = new Scanner(System.in);
		String acctpassword=pw.nextLine() ;
		if (this.password.contentEquals(acctpassword)) {
			System.out.println("The asset you have left is"+getbalance());
			System.out.println("How much you need to withdraw?");
			Scanner wd = new Scanner(System.in);
			double amount = wd.nextDouble();
			balance -= amount;
			if (balance < 0) {
				balance -= OVERDRAWN_PENALTY;
			}
			System.out.println("The asset you have left is"+balance);
		} 
		else {
			System.out.println("Error password.");
		}
	}
}
