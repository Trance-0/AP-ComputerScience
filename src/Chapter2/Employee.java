package Chapter2;

public class Employee {
private String name;
private String sex;
private int age;
private static int employeeCount = 0;
private static int maleEmployee= 0;
private static int femaleEmployee= 0;
private static int unknowEmployee= 0;
public Employee() {
	name="Unknown";
	age=-1;
	sex="Unknown";
	employeeCount++;
}
	public Employee(String name,String sex,int age) {
	this.name=name;
	this.sex=sex;
	this.age=age;
	employeeCount++;
	if(sex=="M") {
		maleEmployee++;
	}
	else if(sex=="F") {
		femaleEmployee++;
	}
	else {
		unknowEmployee++;
	}
	}
public static int getCount() {
	return employeeCount;
}
public static String getSex() {
	return "Male employee: "+maleEmployee+" Female employee: "+femaleEmployee+" UnknowEmployee: "+unknowEmployee;
}
}
