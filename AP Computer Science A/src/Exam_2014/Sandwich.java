package Exam_2014;

public class Sandwich implements MenuItem{
	private String Sandwich;
	private int SandwichPrice;
	public Sandwich(String name,int price) {
		Sandwich=name;
		SandwichPrice=price;
	}
	public Sandwich() {
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Sandwich;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return SandwichPrice;
	}
}
