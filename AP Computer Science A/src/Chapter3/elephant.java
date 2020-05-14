package Chapter3;


public class elephant extends animal{
	private String color;
	public elephant(String name,String color) {
		super(name);
		this.color=color;
	}
public void eat() {
	System.out.println("Dog eat leaves");
}

	public String toString() {
		return super.getname() + ":" + color;
	}
}
