package Chapter2;

public class TestEmployee {

	public static void main(String[] args) {
		Employee a=new Employee("4265471839","M",23);
		Employee b=new Employee("4265471216","F",24);
		Employee c=new Employee("4265412318","M",25);
		Employee d=new Employee("4265125312","M",28);
		Employee e=new Employee("4265471825","F",20);
		Employee f=new Employee("4265471215","F",21);
		Employee g=new Employee("4265475125","F",22);
		System.out.println(Employee.getCount());
	}
}
