package Exam_2014;

public class Drink implements MenuItem{
	private String Drink;
	private int DrinkPrice;
	public Drink(String name,int price) {
		Drink=name;
		DrinkPrice=price;
	}
	public Drink() {
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Drink;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return DrinkPrice;
	}
}
