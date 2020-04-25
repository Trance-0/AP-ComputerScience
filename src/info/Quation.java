package info;

public class Quation {
	public static void main(String[] args) {
		for (int i=0;i<10;i++){
		int y=(int)(Math.random()*(10)+Math.random()*(-10));
	 	int x=(int)(Math.random()*(10)+Math.random()*(-10));
		if(x>0&&y>0) {
			System.out.println("("+x+","+y+")"+" is on Quation I");}
		else if(x<0&&y>0) {
			System.out.println("("+x+","+y+")"+" is on Quation I");}
		else if(x<0&&y<0) {
			System.out.println("("+x+","+y+")"+" is on Quation I");}
		else if(x>0&&y<0) {
			System.out.println("("+x+","+y+")"+" is on Quation I");}
		else if(x==0&&y!=0) {
			System.out.println("("+x+","+y+")"+" is on y ray");}
		else if(y==0&&x!=0) {
			System.out.println("("+x+","+y+")"+" is on x ray");}
		else if(y==0&&x==0) {
			System.out.println("("+x+","+y+")"+" is on origin");}

	}
		System.out.println("clear");
	}
}
