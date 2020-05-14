package Exam_2017;

public class MultPractice implements StudyPractice{
	private int firstInteger;
	private int secondInteger;
	public MultPractice(int a,int b) {
		firstInteger=a;
		secondInteger=b;
	}
	public String getProblem() {
		return firstInteger+" TIMES "+secondInteger;
	}
	public void nextProblem() {
		secondInteger+=1;
	}
}
