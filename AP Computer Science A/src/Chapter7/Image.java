package Chapter7;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Image extends JFrame {
	private static final int sx = 50;// 小方格宽度
	private static final int sy = 50;// 小方格高度
	private static final int w = 40;
	private static final int rw = 400;
	private Graphics jg;
	private Color rectColor = new Color(0xffffff);
	private final int BLACK = 1;
	private final int WHITE = 0;
	private int[][] image;
	private int size;

	public Image() {
		size = 10;
		image = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				image[i][j] = WHITE;
			}
		}

	}

	public Image(int size) {
		this.size=size;
		image = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				image[i][j] = WHITE;
			}
		}

	}

	public void paintComponents(Graphics g) {
		try {

			// 设置线条颜色为红色
			g.setColor(Color.red);

			// 绘制外层矩形框
			g.drawRect(sx, sy, rw, rw);

			/*
			 * 绘制水平10个，垂直10个方格。 即水平方向9条线，垂直方向9条线， 外围四周4条线已经画过了，不需要再画。
			 * 同时内部64个方格填写数字。
			 */
			
			for(int i = 0; i < size; i ++) {

                for(int j = 0; j < size; j ++) {
                	if(image[i][j]==0)
                		g.setColor(Color.WHITE);
                	else
                		g.setColor(Color.BLACK);
                	g.fillRect(sx+i*w, sy+j*w, w, w);                   
                }
            }
			for(int i = 0; i < size; i ++) {
                // 绘制第i条竖直线
				g.setColor(Color.red);
				
                g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rw);
                
                // 绘制第i条水平线
                g.drawLine(sx, sy + (i * w), sx + rw, sy + (i * w));
               
  
            }
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setColor(int row, int col, int color) {
		image[row][col] = color;
	}

	public void display() {

		Container p = getContentPane();
		setBounds(100, 100, 500, 500);
		setVisible(true);
		p.setBackground(rectColor);
		setLayout(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {

			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 获取专门用于在窗口界面上绘图的对象
		jg = this.getGraphics();

		// 绘制游戏区域
		paintComponents(jg);


	}

	public void eraseBlob(int row, int col) {
		if (row >= 0 && row < size && col >= 0 && col < size){
			if (image[row][col] == 1) {
				image[row][col] = 0;
				eraseBlob(row - 1, col);
				eraseBlob(row + 1, col);
				eraseBlob(row, col - 1);
				eraseBlob(row, col + 1);
			}
		}
			
	}
}
