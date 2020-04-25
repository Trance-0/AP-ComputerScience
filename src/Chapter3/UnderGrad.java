package Chapter3;

import java.util.List;

public class UnderGrad extends Student {
	public UnderGrad() {
		super();
	}

	public UnderGrad(String studName, double[] studTest, String studGrade) {
		super(studName, studTest, studGrade);
	}

	public void computeGrade() {
		if (getTestAverage() >= 70)
			setGrade("Pass");
		else
			setGrade("Fail");
	}
}
