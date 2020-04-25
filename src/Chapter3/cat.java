package Chapter3;

public class cat extends animal {
	private String color;

	public cat(String name,String color) {
		super(name);
		this.color = color;
	}

	public void eat() {
		System.out.println("cat eat mouse");
	}

	public String toString() {
		return super.getname() + ":" + color;
	}
}
