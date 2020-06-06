package Exam;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Date birthday=new Date(1,1,1);

Date today=new Date(2020,6,30);
//  int count=0;
//  while(!birthday.isEquals(today))
//  {
// 	 birthday.changeDay();

// 	 System.out.println(birthday);

// 	 count++;
//  }	
Calender a =new Calender(today);
System.out.println(a.getWeek());
//  System.out.println(count);
a.printMonth();
	}
}
