package Exam_2014;

public class Salad implements MenuItem{
	private String Salad;
	private int SaladPrice;
	public Salad(String name,int price) {
		Salad=name;
		SaladPrice=price;
	}
	public Salad() {
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Salad;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return SaladPrice;
	}
}
