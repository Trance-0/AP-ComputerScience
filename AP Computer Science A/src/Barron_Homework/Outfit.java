package Barron_Homework;

public class Outfit implements ClothingItem {
    private Shoes Shoes;
    private Pants Pants;
    private Top Top;

    public void Outfit(Shoes shoes, Pants pants,Top top){
        Shoes=shoes;
        Pants=pants;
        Top=top;
    }
    public String getDescription(){
        return Shoes.getDescription()+ Pants.getDescription()+Top.getDescription()+" "+"outfit";
    }

    /** @return the price of the clothing item */
    public double getPrice(){
        double originalPrice=Shoes.getPrice()+ Pants.getPrice()+Top.getPrice();
        if(originalPrice>=100){
            return originalPrice*0.75;
        }
        else{
            return originalPrice*0.9;
    }
}
}