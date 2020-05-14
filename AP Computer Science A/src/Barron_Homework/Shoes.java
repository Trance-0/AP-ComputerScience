package Barron_Homework;

public class Shoes implements ClothingItem{
    private String Name;
    private double Price;
    public void Shoes (String name,double price){
        Name=name;
        Price=price;
    }
    public String getDescription(){
        return Name;
    }

    /** @return the price of the clothing item */
    public double getPrice(){
      return Price;
    }
}