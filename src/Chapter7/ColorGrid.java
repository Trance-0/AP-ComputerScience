package Chapter7;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ColorGrid extends JFrame{
	private int rows;
	private int cols;
	private static final int sx = 50;// 小方格宽度
	private static final int sy = 50;// 小方格高度
	private static final int w = 40;
	private static final int rw = 400;
	private Graphics jg;
	private Color rectColor = new Color(0xffffff);
	
	private String[][] pixels;

	public ColorGrid(){
		rows=8;
		cols=8;
		pixels=new String[rows][cols];
		int stringIndex=0;
		for(int r=0;r<cols;r++)
			for(int c=0;c<rows;c++)
			{
				int t=(int)(Math.random()*4);
				String cc="";
				if(t==0)
					cc="r";
				else if(t==1)
					cc="g";
				else if(t==2)
					cc="b";
				else
					cc="y";
				pixels[r][c]=cc;
				stringIndex++;
			}		
	}
	public ColorGrid(String s,int numRows,int numCols){
		rows=numRows;
		cols=numCols;
		pixels=new String[numRows][numCols];
		int stringIndex=0;
//		for(int r=0;r<rows;r++)				//按照列填充cols列
//			for(int c=0;c<cols;c++)
//			{
//				pixels[r][c]=s.substring(stringIndex, stringIndex+1);
//				stringIndex++;
//			}
//		
		for(int c=0;c<cols;c++)				//按照行填写row行
			for(int r=0;r<rows;r++)
			{
				pixels[r][c]=s.substring(stringIndex, stringIndex+1);
				stringIndex++;
			}
	}
	
	

	
	public void paintComponents(Graphics g) {
		try {
			for(int i = 0; i < rows; i ++) {

                for(int j = 0; j < cols; j ++) {
                	if(pixels[i][j].equals("r"))
                		g.setColor(Color.RED);
                	else if (pixels[i][j].equals("g"))
                		g.setColor(Color.green);
                	else if (pixels[i][j].equals("b"))
                		g.setColor(Color.blue);
                	else if (pixels[i][j].equals("y"))
                		g.setColor(Color.yellow);
                	else
                		g.setColor(Color.white);
                	g.fillRect(sx+i*w, sy+j*w, w, w);                   
                }
            }
			g.setColor(Color.black);
			for(int i = 0; i < rows; i ++) {
				 g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rows*w);
	                
	                // 绘制第i条水平线
	               			   
  
            }
			for(int i=0;i<cols;i++){
				 g.drawLine(sx, sy + (i * w), sx + rows*w, sy + (i * w));
			}
			
			g.drawRect(sx, sy, rows*w, cols*w);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setColor(int row, int col, String color) {
		pixels[row][col] = color;
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

	public void printGrid(){
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(pixels[i][j]);
			}
			System.out.println();
		}
			
	}
	
	public void paintRegion(int row,int col,String newColor,String oldColor){
		if(row>=0 && row<rows && col>=0 && col<cols)
			if(!this.pixels[row][col].equals(newColor) && this.pixels[row][col].equals(oldColor)){
				this.pixels[row][col]=newColor;
				paintRegion(row+1,col,newColor,oldColor);
				paintRegion(row-1,col,newColor,oldColor);
				paintRegion(row,col+1,newColor,oldColor);
				paintRegion(row,col-1,newColor,oldColor);
			}
	}
}

