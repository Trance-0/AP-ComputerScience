package Exam;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Date birthday=new Date(2004,3,30);

Date today=new Date(2020,5,14);
 int count=0;
 while(!birthday.isEuqals(today))
 {
	 birthday.changeDay();

	 System.out.println(birthday);

	 count++;
 }	
 System.out.println(count);
	}

}
