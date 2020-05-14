package Exam_2014;

public class Test_Scramble {
	public static void main (String[]args) {
		System.out.println(scrambleWord("TAN"));
	}

	public static String scrambleWord(String word) {
		String result="";
		int i=1;
		while(i<word.length()-1) {
			String temp=word.substring(i-1,i);
			String comp=word.substring(i, i+1);
			if (temp.equals("A")&&comp.compareTo("A")!=0) {
				result+=comp;
				result+=temp;
				i+=2;
			}
			result+=temp;
			i++;
		}
		return result;
	}
}
