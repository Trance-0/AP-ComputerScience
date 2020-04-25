package info;

public class UserInfo {
	private String name;
	private int age;
	private String sex;

	public void user(String name, String sex, int age) {
		this.sex = sex;
		this.age = age;
		this.name = name;
	}

	public String toString() {

		return name + " " + age + " " + sex;
	}
	
	public String getname(){
		return name;
	}

	public void printPerson() {
		System.out.println(this.toString());
	}

	private String Country;
	private String State;
	private String City;
	private String Street;

	public void address(String Country, String State, String City, String Street) {
		this.Country = Country;
		this.State = State;
		this.City = City;
		this.Street = Street;
	}

}
