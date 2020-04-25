package Chapter3;

public class FeedAnimal {
	
	public static void Feeding(animal[] a) {
		for(int i=0;i<a.length ;i++) {
			a[i].eat();
		}
	}
	public static void main(String[] args) {
		animal[] a=new animal[10];
		for(int i=0;i<10;i++) {
			if(Math.random()<0.5)
				a[i]=new dog("LiuLiu", "dark brown");
			else 
				a[i]=new cat("Tom","gray");
			System.out.println(a[i]);
			}
		}
	}
