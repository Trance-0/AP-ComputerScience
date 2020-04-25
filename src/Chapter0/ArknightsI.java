package Chapter0;

import java.awt.AWTException;
import java.awt.Robot; //包名
import java.awt.event.InputEvent;

public class ArknightsI {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.mouseMove(636,147);
		click(2);
		robot.delay(20000);
		robot.mouseMove(338,234);
		click(2);
		robot.delay(20000);
		
	}

	private static void click() throws AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	private static void click(int a) throws AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		int b = 0;
		while (b < a) {
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			b++;
		}
	}

	private static void click(int a, String b) throws AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		int c = 0;
		if (b.compareTo("l") == 0) {
			while (c < a) {
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				c++;
			}
		} else if (b.compareTo("r") == 0) {
			while (c < a) {
				robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
				c++;
			}
		} else {
			System.out.println("Error String, please try again.");
		}
	}

}
