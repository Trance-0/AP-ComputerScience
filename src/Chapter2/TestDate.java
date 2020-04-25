package Chapter2;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Date birthday=new Date(2008,2,8);

Date today=new Date(2019,12,22);
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
