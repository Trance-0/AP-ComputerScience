package info;

import java.util.Date;

public class SleepMode {

		public static void main(String args[]) {
			try {
				System.out.println(new Date()+"\n");
				Thread.sleep(1000*3);
				System.out.println(new Date()+"\n");
			}
			catch (Exception e) {
				System.out.println("hahahaha");
			}
		}
	}
