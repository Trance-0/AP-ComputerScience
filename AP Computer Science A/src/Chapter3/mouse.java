package Chapter3;


public class mouse extends animal{
	private String color;
	public mouse(String name,String color) {
		super(name);
		this.color=color;
	}
public void eat() {
	System.out.println("mouse eat cheese");
}

	public String toString() {
		return super.getname() + ":" + color;
	}
}
