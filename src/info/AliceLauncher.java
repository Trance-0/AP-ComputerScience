package info;
import java.util.Scanner;

public class AliceLauncher
{
	public static void main(String[] args)
	{
		new Info();
		LanguageSystemBeta Alice = new LanguageSystemBeta();
		System.out.println (Alice.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		while (!statement.equals("Bye"))
		{
			System.out.println (Alice.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
