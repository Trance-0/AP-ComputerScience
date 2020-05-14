
package Barron_Homework;

public class Pants implements ClothingItem{
    private String Name;
    private double Price;
    public void Pants(String name,double price){
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