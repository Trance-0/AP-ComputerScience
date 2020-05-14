package Exam_2014;

public class Trio implements MenuItem{
	Sandwich sandwich;
	Salad salad;
	Drink drink;
	public Trio (Sandwich sw,Salad sl,Drink dk) {
		sandwich=sw;
		salad=sl;
		drink=dk;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String result=sandwich.getName()+"/"+salad.getName()+"/"+drink.getName()+" "+"Trio";
		return result;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		double freeItem =sandwich.getPrice();
		if (salad.getPrice()<freeItem) {
			freeItem=salad.getPrice();
		}
		if (drink.getPrice()<freeItem) {
			freeItem=drink.getPrice();
		}
		return salad.getPrice()+sandwich.getPrice()+drink.getPrice()-freeItem;
	}
	
}
