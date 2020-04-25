package AliceAlpha;

	import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import info.Info;
import info.LanguageSystemBeta;

	public class AliceLauncher
	{
		public static void main(String[] args) throws InterruptedException
		{
			AliceAlpha Alice = new AliceAlpha();
			Scanner in = new Scanner (System.in);
			String start = in.nextLine();
			if(start.compareTo("test mode")!=0) {
			Alice.Info();
			Alice.timeset();
			}
			int k=-1;
			while (k<0||Alice.i<0)
			{	
				Scanner on = new Scanner (System.in);
			String statement = on.nextLine();
				statement = in.nextLine();
			Thread.sleep(1000*1);
				System.out.println (Alice.getResponse(statement));
				if(statement.equals("Bye")) {
					k=k+10;
				}
				
			}
		}

		

}
