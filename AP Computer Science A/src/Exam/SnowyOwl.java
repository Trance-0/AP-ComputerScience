package Exam;

public class SnowyOwl extends Owl{
	
	public SnowyOwl() {
		super("Snowy owl");
	}

	public String getFood() {
		String[]FoodList= { "hare", "lemming", "small bird"};
		int i =(int) (Math.random()*3);
		return FoodList[i];
	}
}
