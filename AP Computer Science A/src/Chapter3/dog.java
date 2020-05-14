package Chapter3;


public class dog extends animal{
	private String color;
	public dog(String name,String color) {
		super(name);
		this.color=color;
	}
public void eat() {
	System.out.println("Dog eat bone");
}

	public String toString() {
		return super.getname() + ":" + color;
	}
}
