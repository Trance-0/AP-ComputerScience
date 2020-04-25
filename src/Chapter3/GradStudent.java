package Chapter3;

import java.util.List;

public class GradStudent extends Student {
	private int gradID;

	public GradStudent() {
		super();
		gradID = 0;
	}

	public GradStudent(String studName, double[] studTests, String studGrade, int gradStudID) {
		super(studName, studTests, studGrade);
		gradID = gradStudID;
	}

	public int getID() {
		return gradID;
	}

	public void computeGrade() {

		if (getTestAverage() >= 90)
			setGrade("Pass with distinction");
	}
}