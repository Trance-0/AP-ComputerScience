package Chapter0;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot; //包名
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

//InputEvent.BUTTON1_MASK 鼠标左键
//InputEvent.BUTTON2_MASK 鼠标中键
//InputEvent.BUTTON3_MASK 鼠标右键
public class ForestsI {
	public static void main(String[] args) throws AWTException, Exception {
		Robot robot = new Robot();
		robot.delay(100);
		System.out.println("The location is detected in one circumstance.");
		Thread.sleep(1000);
		System.out.println("Please make sure that you have opened mac fan control and minimize the manu.");
		Thread.sleep(1000);
		System.out.println("There is only 70 icon in the main bar.");
		Thread.sleep(1000);
		int k = 1;
		while (k > 0) {
			robot.mouseMove(539, 783);//most important
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(5000);
			robot.mouseMove(230, 10);//open sets
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseMove(211, 153);//maximize the windows
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(3000);
			robot.mouseMove(955, 55);//open forests
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseMove(838, 248);//click OK
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseMove(725, 104);//click back
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseMove(840, 206);//click plant
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			int t = 0;
			while (t < 7170) {
				robot.delay(1000);
				t++;
				int tl=7200-t;
				System.out.println("Time left: " + tl + "s.");
			}
		}
//	//鼠标左键点击(按下和抬起一起使用)
//	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //鼠标左键按下
//	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //鼠标左键抬起
//	//鼠标右键点击（按下和抬起一起使用）
//	robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);  //鼠标右键按下
//	robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);//鼠标右键抬起
//	//键盘按下指定的键
//	robot.keyPress(KeyEvent.VK_A); //按下A键
//	//复制操作
//	robot.keyPress(KeyEvent.VK_HOME); //按下ctrl键
//	robot.keyPress(KeyEvent.VK_C); 		//按下C键
//	robot.keyRelease(KeyEvent.VK_HOME); //抬起ctrl键
//	robot.keyRelease(KeyEvent.VK_C); 	//抬起C键
//	//粘贴操作
//	robot.keyPress(KeyEvent.VK_CONTROL); 
//	robot.keyPress(KeyEvent.VK_V); 
//	robot.keyRelease(KeyEvent.VK_CONTROL); 
//	robot.keyRelease(KeyEvent.VK_V); 
	}
}
